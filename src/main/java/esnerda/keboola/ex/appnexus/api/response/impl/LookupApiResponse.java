package esnerda.keboola.ex.appnexus.api.response.impl;

import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

/**
 * @author David Esner
 */
public class LookupApiResponse<T> extends ApiResponse{
	@JsonProperty("results")
	private T results;


	@JsonProperty("results")
	public T getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(T results) {
		this.results = results;
	}
}
