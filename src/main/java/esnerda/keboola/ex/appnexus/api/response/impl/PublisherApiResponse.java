
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.entity.Publisher;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PublisherApiResponse extends ApiResponse{

    @JsonProperty("publishers")
    private List<Publisher> publishers = null;

    @JsonProperty("publishers")
    public List<Publisher> getPublishers() {
        return publishers;
    }

    @JsonProperty("publishers")
    public void setPublishers(List<Publisher> publishers) {
        this.publishers = publishers;
    }

}
