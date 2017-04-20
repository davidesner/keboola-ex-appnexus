
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Site {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("state")
    private String state;
    @JsonProperty("publisher_id")
    private Integer publisherId;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("primary_content_category_id")
    private Integer primaryContentCategoryId;
    @JsonProperty("intended_audience")
    private String intendedAudience;
    @JsonProperty("managed_optimization_zone_id")
    private String managedOptimizationZoneId;
    @JsonProperty("rtb_optimization_zone_id")
    private Integer rtbOptimizationZoneId;
    @JsonProperty("audited")
    private Boolean audited;
    @JsonProperty("publisher_name")
    private String publisherName;
    @JsonProperty("supply_type")
    private String supplyType;
    @JsonProperty("creative_format_action")
    private String creativeFormatAction;
   /* @JsonProperty("mobile_app_instance")
    private Object mobileAppInstance;*/
    @JsonProperty("placements")
    private List<Placement> placements = null;
   /*@JsonProperty("content_categories")
    private Object contentCategories;
    @JsonProperty("inventory_attributes")
    private Object inventoryAttributes;
    @JsonProperty("creative_formats")
    private Object creativeFormats;
    @JsonProperty("allowed_click_actions")
    private Object allowedClickActions;*/
    @JsonProperty("marketplace_map")
    private MarketplaceMap marketplaceMap;
    //hlp
    private Boolean performance;   
    private Boolean rtb;   
    private Boolean anAuditPerfOnly;   
    private Boolean rtbSuspended;   
    private Boolean dealsAllowed;   
    private Boolean dealsSuspended;

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

    @JsonProperty("publisher_id")
    public Integer getPublisherId() {
        return publisherId;
    }

    @JsonProperty("publisher_id")
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("primary_content_category_id")
    public Integer getPrimaryContentCategoryId() {
        return primaryContentCategoryId;
    }

    @JsonProperty("primary_content_category_id")
    public void setPrimaryContentCategoryId(Integer primaryContentCategoryId) {
        this.primaryContentCategoryId = primaryContentCategoryId;
    }

    @JsonProperty("intended_audience")
    public String getIntendedAudience() {
        return intendedAudience;
    }

    @JsonProperty("intended_audience")
    public void setIntendedAudience(String intendedAudience) {
        this.intendedAudience = intendedAudience;
    }

    @JsonProperty("managed_optimization_zone_id")
    public String getManagedOptimizationZoneId() {
        return managedOptimizationZoneId;
    }

    @JsonProperty("managed_optimization_zone_id")
    public void setManagedOptimizationZoneId(String managedOptimizationZoneId) {
        this.managedOptimizationZoneId = managedOptimizationZoneId;
    }

    @JsonProperty("rtb_optimization_zone_id")
    public Integer getRtbOptimizationZoneId() {
        return rtbOptimizationZoneId;
    }

    @JsonProperty("rtb_optimization_zone_id")
    public void setRtbOptimizationZoneId(Integer rtbOptimizationZoneId) {
        this.rtbOptimizationZoneId = rtbOptimizationZoneId;
    }

    @JsonProperty("audited")
    public Boolean getAudited() {
        return audited;
    }

    @JsonProperty("audited")
    public void setAudited(Boolean audited) {
        this.audited = audited;
    }

    @JsonProperty("publisher_name")
    public String getPublisherName() {
        return publisherName;
    }

    @JsonProperty("publisher_name")
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @JsonProperty("supply_type")
    public String getSupplyType() {
        return supplyType;
    }

    @JsonProperty("supply_type")
    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    @JsonProperty("creative_format_action")
    public String getCreativeFormatAction() {
        return creativeFormatAction;
    }

    @JsonProperty("creative_format_action")
    public void setCreativeFormatAction(String creativeFormatAction) {
        this.creativeFormatAction = creativeFormatAction;
    }

    /*@JsonProperty("mobile_app_instance")
    public Object getMobileAppInstance() {
        return mobileAppInstance;
    }

    @JsonProperty("mobile_app_instance")
    public void setMobileAppInstance(Object mobileAppInstance) {
        this.mobileAppInstance = mobileAppInstance;
    }*/

    @JsonProperty("placements")
    public List<Placement> getPlacements() {
        return placements;
    }

    @JsonProperty("placements")
    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

   /* @JsonProperty("content_categories")
    public Object getContentCategories() {
        return contentCategories;
    }

    @JsonProperty("content_categories")
    public void setContentCategories(Object contentCategories) {
        this.contentCategories = contentCategories;
    }

    @JsonProperty("inventory_attributes")
    public Object getInventoryAttributes() {
        return inventoryAttributes;
    }

    @JsonProperty("inventory_attributes")
    public void setInventoryAttributes(Object inventoryAttributes) {
        this.inventoryAttributes = inventoryAttributes;
    }

    @JsonProperty("creative_formats")
    public Object getCreativeFormats() {
        return creativeFormats;
    }

    @JsonProperty("creative_formats")
    public void setCreativeFormats(Object creativeFormats) {
        this.creativeFormats = creativeFormats;
    }

    @JsonProperty("allowed_click_actions")
    public Object getAllowedClickActions() {
        return allowedClickActions;
    }

    @JsonProperty("allowed_click_actions")
    public void setAllowedClickActions(Object allowedClickActions) {
        this.allowedClickActions = allowedClickActions;
    }*/

    @JsonProperty("marketplace_map")
    public MarketplaceMap getMarketplaceMap() {
        return marketplaceMap;
    }

    @JsonProperty("marketplace_map")
    public void setMarketplaceMap(MarketplaceMap marketplaceMap) {
        this.marketplaceMap = marketplaceMap;
    }

	public Boolean getPerformance() {
		if (marketplaceMap == null) {
			return null;
		}
		return marketplaceMap.getPerformance();
	}

	public Boolean getRtb() {
		if (marketplaceMap == null) {
			return null;
		}
		return marketplaceMap.getRtb();
	}

	public Boolean getAnAuditPerfOnly() {
		if (marketplaceMap == null) {
			return null;
		}
		return marketplaceMap.getAnAuditPerfOnly();
	}

	public Boolean getRtbSuspended() {
		if (marketplaceMap == null) {
			return null;
		}
		return marketplaceMap.getRtbSuspended();
	}

	public Boolean getDealsAllowed() {
		if (marketplaceMap == null) {
			return null;
		}
		return marketplaceMap.getDealsAllowed();
	}

	public Boolean getDealsSuspended() {
		if (marketplaceMap == null) {
			return null;
		}
		return marketplaceMap.getDealsSuspended();
	}

}
