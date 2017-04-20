
package esnerda.keboola.ex.appnexus.api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseWrapper<T extends ApiResponse> {

	@JsonProperty("response")
	private T response;

	@JsonProperty("response")
	public T getResponse() {
		return response;
	}

	@JsonProperty("response")
	public void setResponse(T response) {
		this.response = response;
	}

}
