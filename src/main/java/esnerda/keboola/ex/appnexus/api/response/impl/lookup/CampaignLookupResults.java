
package esnerda.keboola.ex.appnexus.api.response.impl.lookup;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignLookupResults {

   
    private CampaignLookupResult campaign;

    @JsonProperty("campaign")
    public CampaignLookupResult getCampaign() {
        return campaign;
    }

    @JsonProperty("campaign")
    public void setCampaign(CampaignLookupResult campaign) {
        this.campaign = campaign;
    }

}
