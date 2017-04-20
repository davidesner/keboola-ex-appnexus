
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.LineItem;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "line-items"
})
public class LineItemApiResponse extends ApiResponse{

    @JsonProperty("line-items")
    private List<LineItem> lineItems = null;

    @JsonProperty("line-items")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("line-items")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

}
