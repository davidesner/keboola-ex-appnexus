
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.entity.Label;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LabelApiResponse extends ApiResponse {

	@JsonProperty("labels")
	private List<Label> labels = null;

	@JsonProperty("labels")
	public List<Label> getLabels() {
		return labels;
	}

	@JsonProperty("labels")
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

}
