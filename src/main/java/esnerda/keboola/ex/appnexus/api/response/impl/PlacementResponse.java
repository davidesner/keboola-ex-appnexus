
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.Placement;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "placements"
})
public class PlacementResponse extends ApiResponse {

    @JsonProperty("placements")
    private List<Placement> placements = null;

    @JsonProperty("placements")
    public List<Placement> getPlacements() {
        return placements;
    }

    @JsonProperty("placements")
    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

}
