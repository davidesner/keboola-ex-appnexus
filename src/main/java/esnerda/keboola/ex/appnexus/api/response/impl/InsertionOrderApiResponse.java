
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import esnerda.keboola.ex.appnexus.api.entity.InsertionOrder;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "insertion-orders"
})
public class InsertionOrderApiResponse extends ApiResponse{

    @JsonProperty("insertion-orders")
    private List<InsertionOrder> insertionOrders = null;

    @JsonProperty("insertion-orders")
    public List<InsertionOrder> getInsertionOrders() {
        return insertionOrders;
    }

    @JsonProperty("insertion-orders")
    public void setInsertionOrders(List<InsertionOrder> insertionOrders) {
        this.insertionOrders = insertionOrders;
    }

}
