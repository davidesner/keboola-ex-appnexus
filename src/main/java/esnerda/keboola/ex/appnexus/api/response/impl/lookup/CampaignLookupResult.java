
package esnerda.keboola.ex.appnexus.api.response.impl.lookup;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.Campaign;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "results",
    "num_elements"
})

public class CampaignLookupResult {

    @JsonProperty("results")
    private List<Campaign> results = null;
    @JsonProperty("num_elements")
    private String numElements;

    @JsonProperty("results")
    public List<Campaign> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Campaign> results) {
        this.results = results;
    }

    @JsonProperty("num_elements")
    public String getNumElements() {
        return numElements;
    }

    @JsonProperty("num_elements")
    public void setNumElements(String numElements) {
        this.numElements = numElements;
    }

}
