
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaType {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("media_type_group_id")
    private Integer mediaTypeGroupId;
    @JsonProperty("uses_sizes")
    private String usesSizes;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("code")
    private String code;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("media_type_group_id")
    public Integer getMediaTypeGroupId() {
        return mediaTypeGroupId;
    }

    @JsonProperty("media_type_group_id")
    public void setMediaTypeGroupId(Integer mediaTypeGroupId) {
        this.mediaTypeGroupId = mediaTypeGroupId;
    }

    @JsonProperty("uses_sizes")
    public String getUsesSizes() {
        return usesSizes;
    }

    @JsonProperty("uses_sizes")
    public void setUsesSizes(String usesSizes) {
        this.usesSizes = usesSizes;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

}
