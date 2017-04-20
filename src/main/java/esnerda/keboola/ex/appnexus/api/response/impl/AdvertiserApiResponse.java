
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.Advertiser;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "advertisers"
})
public class AdvertiserApiResponse extends ApiResponse{

    @JsonProperty("advertisers")
    private List<Advertiser> advertisers = null;

    @JsonProperty("advertisers")
    public List<Advertiser> getAdvertisers() {
        return advertisers;
    }

    @JsonProperty("advertisers")
    public void setAdvertisers(List<Advertiser> advertisers) {
        this.advertisers = advertisers;
    }

}
