
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.Creative;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "creatives"
})
public class CreativeApiResponse extends ApiResponse{

    @JsonProperty("creatives")
    private List<Creative> creatives = null;

    @JsonProperty("creatives")
    public List<Creative> getCreatives() {
        return creatives;
    }

    @JsonProperty("creatives")
    public void setCreatives(List<Creative> creatives) {
        this.creatives = creatives;
    }

}
