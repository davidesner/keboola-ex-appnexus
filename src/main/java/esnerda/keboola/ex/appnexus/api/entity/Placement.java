
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Placement {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("code2")
    private String code2;
    @JsonProperty("code3")
    private String code3;
    @JsonProperty("state")
    private String state;
    @JsonProperty("cost_cpm")
    private Double costCpm;
    @JsonProperty("publisher_id")
    private Integer publisherId;
    @JsonProperty("content_retrieval_timeout_ms")
    private Integer contentRetrievalTimeoutMs;
    @JsonProperty("enable_for_mediation")
    private Boolean enableForMediation;
    @JsonProperty("is_prohibited")
    private Boolean isProhibited;
    @JsonProperty("site_id")
    private Integer siteId;
    @JsonProperty("default_referrer_url")
    private String defaultReferrerUrl;
    @JsonProperty("reserve_price")
    private Double reservePrice;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("default_position")
    private String defaultPosition;
    @JsonProperty("default_creative_id")
    private Integer defaultCreativeId;
    @JsonProperty("ad_profile_id")
    private Integer adProfileId;
    @JsonProperty("hide_referer")
    private Boolean hideReferer;
    @JsonProperty("exclusive")
    private Boolean exclusive;
    @JsonProperty("pixel_url")
    private String pixelUrl;
    @JsonProperty("pixel_type")
    private String pixelType;
    @JsonProperty("last_modified")
    private String lastModified; 
    @JsonProperty("intended_audience")
    private String intendedAudience;
    @JsonProperty("audited")
    private Boolean audited;
    @JsonProperty("audit_level")
    private String auditLevel;
    @JsonProperty("default_calculation_type")
    private String defaultCalculationType;
    @JsonProperty("publisher_name")
    private String publisherName;
    @JsonProperty("site_name")
    private String siteName;
    @JsonProperty("site_audit_status")
    private String siteAuditStatus;
    @JsonProperty("demand_filter_action")
    private String demandFilterAction;
    @JsonProperty("visibility_profile_id")
    private Integer visibilityProfileId;
    @JsonProperty("is_resizable")
    private Boolean isResizable;
    @JsonProperty("pixel_url_secure")
    private String pixelUrlSecure;
    @JsonProperty("floor_application_target")
    private String floorApplicationTarget;
    @JsonProperty("use_detected_domain")
    private Boolean useDetectedDomain;
    /*@JsonProperty("pop_values")
    private Object popValues;
    @JsonProperty("toolbar")
    private Object toolbar;
    @JsonProperty("inventory_attributes")
    private Object inventoryAttributes;*/
    @JsonProperty("supported_media_types")
    private List<MediaType> supportedMediaTypes = null; 
    /*@JsonProperty("content_categories")
    private Object contentCategories;*/
    @JsonProperty("segments")
    private List<Segment> segments;
   /* @JsonProperty("estimated_clear_prices")
    private Object estimatedClearPrices;
    @JsonProperty("filtered_advertisers")
    private Object filteredAdvertisers;
    @JsonProperty("filtered_line_items")
    private Object filteredLineItems;
    @JsonProperty("filtered_campaigns")
    private Object filteredCampaigns;
    @JsonProperty("default_creatives")
    private Object defaultCreatives;
    @JsonProperty("private_sizes")
    private Object privateSizes;
    @JsonProperty("video")
    private Object video;
    @JsonProperty("ad_types")
    private Object adTypes;*/

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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Object String) {
        this.code = code;
    }

    @JsonProperty("code2")
    public String getCode2() {
        return code2;
    }

    @JsonProperty("code2")
    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @JsonProperty("code3")
    public String getCode3() {
        return code3;
    }

    @JsonProperty("code3")
    public void setCode3(String code3) {
        this.code3 = code3;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("cost_cpm")
    public Double getCostCpm() {
        return costCpm;
    }

    @JsonProperty("cost_cpm")
    public void setCostCpm(Double costCpm) {
        this.costCpm = costCpm;
    }

    @JsonProperty("publisher_id")
    public Integer getPublisherId() {
        return publisherId;
    }

    @JsonProperty("publisher_id")
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @JsonProperty("content_retrieval_timeout_ms")
    public Integer getContentRetrievalTimeoutMs() {
        return contentRetrievalTimeoutMs;
    }

    @JsonProperty("content_retrieval_timeout_ms")
    public void setContentRetrievalTimeoutMs(Integer contentRetrievalTimeoutMs) {
        this.contentRetrievalTimeoutMs = contentRetrievalTimeoutMs;
    }

    @JsonProperty("enable_for_mediation")
    public Boolean getEnableForMediation() {
        return enableForMediation;
    }

    @JsonProperty("enable_for_mediation")
    public void setEnableForMediation(Boolean enableForMediation) {
        this.enableForMediation = enableForMediation;
    }

    @JsonProperty("is_prohibited")
    public Boolean getIsProhibited() {
        return isProhibited;
    }

    @JsonProperty("is_prohibited")
    public void setIsProhibited(Boolean isProhibited) {
        this.isProhibited = isProhibited;
    }

    @JsonProperty("site_id")
    public Integer getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("default_referrer_url")
    public String getDefaultReferrerUrl() {
        return defaultReferrerUrl;
    }

    @JsonProperty("default_referrer_url")
    public void setDefaultReferrerUrl(String defaultReferrerUrl) {
        this.defaultReferrerUrl = defaultReferrerUrl;
    }

    @JsonProperty("reserve_price")
    public Double getReservePrice() {
        return reservePrice;
    }

    @JsonProperty("reserve_price")
    public void setReservePrice(Double reservePrice) {
        this.reservePrice = reservePrice;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("default_position")
    public String getDefaultPosition() {
        return defaultPosition;
    }

    @JsonProperty("default_position")
    public void setDefaultPosition(String defaultPosition) {
        this.defaultPosition = defaultPosition;
    }

    @JsonProperty("default_creative_id")
    public Integer getDefaultCreativeId() {
        return defaultCreativeId;
    }

    @JsonProperty("default_creative_id")
    public void setDefaultCreativeId(Integer defaultCreativeId) {
        this.defaultCreativeId = defaultCreativeId;
    }

    @JsonProperty("ad_profile_id")
    public Integer getAdProfileId() {
        return adProfileId;
    }

    @JsonProperty("ad_profile_id")
    public void setAdProfileId(Integer adProfileId) {
        this.adProfileId = adProfileId;
    }

    @JsonProperty("hide_referer")
    public Boolean getHideReferer() {
        return hideReferer;
    }

    @JsonProperty("hide_referer")
    public void setHideReferer(Boolean hideReferer) {
        this.hideReferer = hideReferer;
    }

    @JsonProperty("exclusive")
    public Boolean getExclusive() {
        return exclusive;
    }

    @JsonProperty("exclusive")
    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    @JsonProperty("pixel_url")
    public String getPixelUrl() {
        return pixelUrl;
    }

    @JsonProperty("pixel_url")
    public void setPixelUrl(String pixelUrl) {
        this.pixelUrl = pixelUrl;
    }

    @JsonProperty("pixel_type")
    public String getPixelType() {
        return pixelType;
    }

    @JsonProperty("pixel_type")
    public void setPixelType(String pixelType) {
        this.pixelType = pixelType;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

   /* @JsonProperty("media_subtypes")
    public Object getMediaSubtypes() {
        return mediaSubtypes;
    }

    @JsonProperty("media_subtypes")
    public void setMediaSubtypes(Object mediaSubtypes) {
        this.mediaSubtypes = mediaSubtypes;
    }*/

    @JsonProperty("intended_audience")
    public String getIntendedAudience() {
        return intendedAudience;
    }

    @JsonProperty("intended_audience")
    public void setIntendedAudience(String intendedAudience) {
        this.intendedAudience = intendedAudience;
    }

    @JsonProperty("audited")
    public Boolean getAudited() {
        return audited;
    }

    @JsonProperty("audited")
    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    @JsonProperty("audit_level")
    public String getAuditLevel() {
        return auditLevel;
    }

    @JsonProperty("audit_level")
    public void setAuditLevel(String auditLevel) {
        this.auditLevel = auditLevel;
    }

    @JsonProperty("default_calculation_type")
    public String getDefaultCalculationType() {
        return defaultCalculationType;
    }

    @JsonProperty("default_calculation_type")
    public void setDefaultCalculationType(String defaultCalculationType) {
        this.defaultCalculationType = defaultCalculationType;
    }

    @JsonProperty("publisher_name")
    public String getPublisherName() {
        return publisherName;
    }

    @JsonProperty("publisher_name")
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @JsonProperty("site_name")
    public String getSiteName() {
        return siteName;
    }

    @JsonProperty("site_name")
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @JsonProperty("site_audit_status")
    public String getSiteAuditStatus() {
        return siteAuditStatus;
    }

    @JsonProperty("site_audit_status")
    public void setSiteAuditStatus(String siteAuditStatus) {
        this.siteAuditStatus = siteAuditStatus;
    }

    @JsonProperty("demand_filter_action")
    public String getDemandFilterAction() {
        return demandFilterAction;
    }

    @JsonProperty("demand_filter_action")
    public void setDemandFilterAction(String demandFilterAction) {
        this.demandFilterAction = demandFilterAction;
    }

    @JsonProperty("visibility_profile_id")
    public Integer getVisibilityProfileId() {
        return visibilityProfileId;
    }

    @JsonProperty("visibility_profile_id")
    public void setVisibilityProfileId(Integer visibilityProfileId) {
        this.visibilityProfileId = visibilityProfileId;
    }

    @JsonProperty("is_resizable")
    public Boolean getIsResizable() {
        return isResizable;
    }

    @JsonProperty("is_resizable")
    public void setIsResizable(Boolean isResizable) {
        this.isResizable = isResizable;
    }

    @JsonProperty("pixel_url_secure")
    public String getPixelUrlSecure() {
        return pixelUrlSecure;
    }

    @JsonProperty("pixel_url_secure")
    public void setPixelUrlSecure(String pixelUrlSecure) {
        this.pixelUrlSecure = pixelUrlSecure;
    }

    @JsonProperty("floor_application_target")
    public String getFloorApplicationTarget() {
        return floorApplicationTarget;
    }

    @JsonProperty("floor_application_target")
    public void setFloorApplicationTarget(String floorApplicationTarget) {
        this.floorApplicationTarget = floorApplicationTarget;
    }

    @JsonProperty("use_detected_domain")
    public Boolean getUseDetectedDomain() {
        return useDetectedDomain;
    }

    @JsonProperty("use_detected_domain")
    public void setUseDetectedDomain(Boolean useDetectedDomain) {
        this.useDetectedDomain = useDetectedDomain;
    }

    /*@JsonProperty("pop_values")
    public Object getPopValues() {
        return popValues;
    }

    @JsonProperty("pop_values")
    public void setPopValues(Object popValues) {
        this.popValues = popValues;
    }

    @JsonProperty("toolbar")
    public Object getToolbar() {
        return toolbar;
    }

    @JsonProperty("toolbar")
    public void setToolbar(Object toolbar) {
        this.toolbar = toolbar;
    }

    @JsonProperty("inventory_attributes")
    public Object getInventoryAttributes() {
        return inventoryAttributes;
    }

    @JsonProperty("inventory_attributes")
    public void setInventoryAttributes(Object inventoryAttributes) {
        this.inventoryAttributes = inventoryAttributes;
    }
*/
    @JsonProperty("supported_media_types")
    public List<MediaType> getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    @JsonProperty("supported_media_types")
    public void setMediaTypes(List<MediaType> supportedMediaTypes) {
        this.supportedMediaTypes = supportedMediaTypes;
    }

   /* @JsonProperty("content_categories")
    public Object getContentCategories() {
        return contentCategories;
    }

    @JsonProperty("content_categories")
    public void setContentCategories(Object contentCategories) {
        this.contentCategories = contentCategories;
    }*/

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

   /* @JsonProperty("estimated_clear_prices")
    public Object getEstimatedClearPrices() {
        return estimatedClearPrices;
    }

    @JsonProperty("estimated_clear_prices")
    public void setEstimatedClearPrices(Object estimatedClearPrices) {
        this.estimatedClearPrices = estimatedClearPrices;
    }

    @JsonProperty("filtered_advertisers")
    public Object getFilteredAdvertisers() {
        return filteredAdvertisers;
    }

    @JsonProperty("filtered_advertisers")
    public void setFilteredAdvertisers(Object filteredAdvertisers) {
        this.filteredAdvertisers = filteredAdvertisers;
    }

    @JsonProperty("filtered_line_items")
    public Object getFilteredLineItems() {
        return filteredLineItems;
    }

    @JsonProperty("filtered_line_items")
    public void setFilteredLineItems(Object filteredLineItems) {
        this.filteredLineItems = filteredLineItems;
    }

    @JsonProperty("filtered_campaigns")
    public Object getFilteredCampaigns() {
        return filteredCampaigns;
    }

    @JsonProperty("filtered_campaigns")
    public void setFilteredCampaigns(Object filteredCampaigns) {
        this.filteredCampaigns = filteredCampaigns;
    }

    @JsonProperty("default_creatives")
    public Object getDefaultCreatives() {
        return defaultCreatives;
    }

    @JsonProperty("default_creatives")
    public void setDefaultCreatives(Object defaultCreatives) {
        this.defaultCreatives = defaultCreatives;
    }

    @JsonProperty("private_sizes")
    public Object getPrivateSizes() {
        return privateSizes;
    }

    @JsonProperty("private_sizes")
    public void setPrivateSizes(Object privateSizes) {
        this.privateSizes = privateSizes;
    }

    @JsonProperty("video")
    public Object getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Object video) {
        this.video = video;
    }

    @JsonProperty("ad_types")
    public Object getAdTypes() {
        return adTypes;
    }

    @JsonProperty("ad_types")
    public void setAdTypes(Object adTypes) {
        this.adTypes = adTypes;
    }*/

}
