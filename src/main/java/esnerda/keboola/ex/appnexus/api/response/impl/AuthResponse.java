package esnerda.keboola.ex.appnexus.api.response.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

/**
 * @author David Esner
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthResponse extends ApiResponse {

	@JsonProperty("token")
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
