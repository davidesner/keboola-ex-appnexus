
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Segment {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("state")
    private String state;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("member_id")
    private Integer memberId;
    @JsonProperty("category")
    private String category;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("expire_minutes")
    private Integer expireMinutes;
    @JsonProperty("enable_rm_piggyback")
    private Boolean enableRmPiggyback;
    @JsonProperty("max_usersync_pixels")
    private Integer maxUsersyncPixels;
    @JsonProperty("advertiser_id")
    private Integer advertiserId;
    @JsonProperty("last_modified")
    private String lastModified;
   /* @JsonProperty("provider")
    private Object provider;*/
    @JsonProperty("parent_segment_id")
    private Integer parentSegmentId;
   /* @JsonProperty("piggyback_pixels")
    private Object piggybackPixels;*/
    /*@JsonProperty("querystring_mapping")
    private Object querystringMapping;
    @JsonProperty("querystring_mapping_key_value")
    private Object querystringMappingKeyValue;*/

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("member_id")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("member_id")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    @JsonProperty("expire_minutes")
    public Integer getExpireMinutes() {
        return expireMinutes;
    }

    @JsonProperty("expire_minutes")
    public void setExpireMinutes(Integer expireMinutes) {
        this.expireMinutes = expireMinutes;
    }

    @JsonProperty("enable_rm_piggyback")
    public Boolean getEnableRmPiggyback() {
        return enableRmPiggyback;
    }

    @JsonProperty("enable_rm_piggyback")
    public void setEnableRmPiggyback(Boolean enableRmPiggyback) {
        this.enableRmPiggyback = enableRmPiggyback;
    }

    @JsonProperty("max_usersync_pixels")
    public Integer getMaxUsersyncPixels() {
        return maxUsersyncPixels;
    }

    @JsonProperty("max_usersync_pixels")
    public void setMaxUsersyncPixels(Integer maxUsersyncPixels) {
        this.maxUsersyncPixels = maxUsersyncPixels;
    }

    @JsonProperty("advertiser_id")
    public Integer getAdvertiserId() {
        return advertiserId;
    }

    @JsonProperty("advertiser_id")
    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

   /* @JsonProperty("provider")
    public Object getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(Object provider) {
        this.provider = provider;
    }*/

    @JsonProperty("parent_segment_id")
    public Object getParentSegmentId() {
        return parentSegmentId;
    }

   /* @JsonProperty("parent_segment_id")
    public void setParentSegmentId(Object parentSegmentId) {
        this.parentSegmentId = parentSegmentId;
    }

    @JsonProperty("piggyback_pixels")
    public Object getPiggybackPixels() {
        return piggybackPixels;
    }

    @JsonProperty("piggyback_pixels")
    public void setPiggybackPixels(Object piggybackPixels) {
        this.piggybackPixels = piggybackPixels;
    }

    @JsonProperty("querystring_mapping")
    public Object getQuerystringMapping() {
        return querystringMapping;
    }

    @JsonProperty("querystring_mapping")
    public void setQuerystringMapping(Object querystringMapping) {
        this.querystringMapping = querystringMapping;
    }

    @JsonProperty("querystring_mapping_key_value")
    public Object getQuerystringMappingKeyValue() {
        return querystringMappingKeyValue;
    }

    @JsonProperty("querystring_mapping_key_value")
    public void setQuerystringMappingKeyValue(Object querystringMappingKeyValue) {
        this.querystringMappingKeyValue = querystringMappingKeyValue;
    }*/

}
