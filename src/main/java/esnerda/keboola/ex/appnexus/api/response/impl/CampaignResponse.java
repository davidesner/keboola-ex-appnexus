package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.entity.Campaign;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

/**
 * @author David Esner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignResponse extends ApiResponse {

	@JsonProperty("campaigns")
	private List<Campaign> campaigns = null;

	@JsonProperty("campaigns")
	public List<Campaign> getCampaigns() {
	return campaigns;
	}

	@JsonProperty("campaigns")
	public void setCampaigns(List<Campaign> campaigns) {
	this.campaigns = campaigns;
	}

}
