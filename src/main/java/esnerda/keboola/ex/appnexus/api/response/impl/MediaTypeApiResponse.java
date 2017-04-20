
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.entity.MediaType;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MediaTypeApiResponse extends ApiResponse {

    @JsonProperty("media-types")
    private List<MediaType> mediaTypes = null;

    @JsonProperty("media-types")
    public List<MediaType> getMediaTypes() {
        return mediaTypes;
    }

    @JsonProperty("media-types")
    public void setMediaTypes(List<MediaType> mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

}
