package esnerda.keboola.ex.appnexus.api;

import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.logging.LoggingFeature.Verbosity;

import esnerda.keboola.ex.appnexus.api.filters.ErrorResponseFilter;
import esnerda.keboola.ex.appnexus.api.request.AuthRequestWrapper;
import esnerda.keboola.ex.appnexus.api.response.ApiResponseWrapper;
import esnerda.keboola.ex.appnexus.api.response.impl.AuthResponse;
import esnerda.keboola.ex.appnexus.util.SimpleTimer;

/**
 * @author David Esner
 */
public class AppNexusApiRestClient{

	private static final String AUTH_PATH = "auth";
	private static final String KEY_AUTH_HEADER = "Authorization";
	
		private static final int CONNECTION_TIMEOUT = 300000;
	private final String endpointUrl;
	private final String userName;
	private final Client client;
	private final String password;
	private Integer reqRemaining = null;
	private Integer currentReqLimit = null;
	private  long currentRateLimitWindowLength;
	
	private String authToken;
	
	public AppNexusApiRestClient (String endpointUrl, String username, String password) {
		this.endpointUrl = endpointUrl;
		this.userName = username;
		this.password = password;
		this.client = ClientBuilder.newClient(
				new ClientConfig().register(new LoggingFeature(Logger.getAnonymousLogger(), Verbosity.HEADERS_ONLY))
						.register(ErrorResponseFilter.class).register(new LoggingFeature(Logger.getGlobal(), LoggingFeature.Verbosity.PAYLOAD_ANY)));
		this.client.property(ClientProperties.CONNECT_TIMEOUT, CONNECTION_TIMEOUT);
	}

	public void authenticate() throws NexusApiException, Exception {
		Response resp = sendPostRequest(AUTH_PATH, new AuthRequestWrapper(userName, password));
		ApiResponseWrapper<AuthResponse> authResp = resp.readEntity(new GenericType<ApiResponseWrapper<AuthResponse>>() {});
		if (authResp.getResponse().getErrorId() == null) {
			authToken = authResp.getResponse().getToken();
		} else {
			throw new NexusApiException(authResp.getResponse().getError(), authResp.getResponse().getErrorId());
		}
	}

	public void authenticateIfFirst() throws NexusApiException, Exception {
		if (authToken == null) {
			authenticate();
		}
	}

	public Response sendGetRequest(String path, Map<String, String> params) throws NexusApiException, Exception {
		waitBeforeNext();
		WebTarget paramTarget = setParams(buildWebTarget(path), params);		
		Response resp =  prepareTargetBuilder(paramTarget).get();	
		
		return resp;
	}

	public Response sendPostRequest(String path, Object entity) throws Exception {
		waitBeforeNext();
		Response response = prepareTargetBuilder(buildWebTarget(path))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
				.post(Entity.entity(entity, MediaType.APPLICATION_JSON));	
		
		return response;
	}


	protected Builder prepareTargetBuilder(WebTarget target) {
		Builder b = target.request(MediaType.APPLICATION_JSON);
		if (authToken != null) {
			b.header(KEY_AUTH_HEADER, authToken);
		}
		return b;
	}

	protected WebTarget buildWebTarget(String path){
		return client.target(endpointUrl).path(path);
	}
	protected WebTarget setParams(WebTarget webTarget, Map<String, String> params) {
		if (params != null) {
			for (Entry<String, String> param : params.entrySet()) {
				webTarget = webTarget.queryParam(param.getKey(), param.getValue());
			}
		}
		return webTarget;
	}
	/* rate limitting */
	public void setRateLimitDetails(Integer readLimit, Integer currReads, Integer readLimitSeconds ) {
		if (readLimit == null || currReads == null || readLimitSeconds == null) {
			return;
		}
		this.currentReqLimit = readLimit;
		this.reqRemaining = currentReqLimit - currReads;
		this.currentRateLimitWindowLength = readLimitSeconds*1000L;
	}

	protected void waitBeforeNext() {
		if (reqRemaining == null || currentReqLimit == null) {
			return;
		}
		if (reqRemaining <= 0) {
			waitNmilis(currentRateLimitWindowLength);
		} else {
			waitNmilis(currentRateLimitWindowLength / currentReqLimit);
		}
	}

	private void waitNmilis(long interval) {
		try {

			SimpleTimer.reallySleep(interval);
		} catch (RuntimeException ex) {
			Logger.getLogger(getClass().getName()).warning("Thread sleep failed " + ex.getMessage());

		}
	}

	

	public static class NexusApiException extends Exception {
		
		public enum ErrorID {
			INTEGRITY, LIMIT, NOAUTH, NOAUTH_DISABLED, NOAUTH_EXPIRED;
		}

		private String errorId;
		
		public NexusApiException(String message, String errorId) {
			
			super(message);
			this.errorId = errorId;
		}

		public boolean isRecoverable() {
			return ErrorID.NOAUTH_EXPIRED.name().equals(errorId) || ErrorID.NOAUTH_EXPIRED.name().equals(errorId) ||
					ErrorID.LIMIT.name().equals(errorId);
		}

		public String getErrorId() {
			return errorId;
		}
		
	}

}
