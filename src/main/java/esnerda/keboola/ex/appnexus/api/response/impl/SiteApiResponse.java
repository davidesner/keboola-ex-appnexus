
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.Site;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sites"
})
public class SiteApiResponse extends ApiResponse {

    @JsonProperty("sites")
    private List<Site> sites = null;

    @JsonProperty("sites")
    public List<Site> getSites() {
        return sites;
    }

    @JsonProperty("sites")
    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

}
