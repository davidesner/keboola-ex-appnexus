
package esnerda.keboola.ex.appnexus.api.entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {

@JsonProperty("id")
private Integer id;
@JsonProperty("state")
private String state;
@JsonProperty("code")
private String code;
@JsonProperty("advertiser_id")
private Integer advertiserId;
@JsonProperty("line_item_id")
private Integer lineItemId;
@JsonProperty("creative_id")
private Integer creativeId;
@JsonProperty("pixel_id")
private Integer pixelId;
@JsonProperty("short_name")
private String shortName;
@JsonProperty("name")
private String name;
@JsonProperty("profile_id")
private Integer profileId;
@JsonProperty("start_date")
private String startDate;
@JsonProperty("end_date")
private String endDate;
@JsonProperty("timezone")
private String timezone;
@JsonProperty("priority")
private Integer priority;
@JsonProperty("cadence_modifier_enabled")
private Boolean cadenceModifierEnabled;
@JsonProperty("cpc_goal")
private Double cpcGoal;
@JsonProperty("cpm_bid_type")
private String cpmBidType;
@JsonProperty("base_bid")
private Integer baseBid;
@JsonProperty("min_bid")
private Double minBid;
@JsonProperty("max_bid")
private Integer maxBid;
@JsonProperty("bid_margin")
private Integer bidMargin;
@JsonProperty("roadblock_creatives")
private Boolean roadblockCreatives;
@JsonProperty("roadblock_type")
private String roadblockType;
@JsonProperty("inventory_type")
private String inventoryType;
@JsonProperty("last_modified")
private String lastModified;
@JsonProperty("max_learn_bid")
private Double maxLearnBid;
@JsonProperty("cadence_type")
private String cadenceType;
@JsonProperty("member_id")
private Integer memberId;
@JsonProperty("click_url")
private String clickUrl;
@JsonProperty("require_cookie_for_tracking")
private Boolean requireCookieForTracking;
@JsonProperty("allow_unverified_ecp")
private Boolean allowUnverifiedEcp;
@JsonProperty("defer_to_li_prediction")
private Boolean deferToLiPrediction;
/* DEPRECATED @JsonProperty("ecp_learn_divisor")
private Object ecpLearnDivisor;
@JsonProperty("projected_learn_events")
private Object projectedLearnEvents;*/
@JsonProperty("learn_threshold")
private Integer learnThreshold;
@JsonProperty("cpc_payout")
private Double cpcPayout;
/*@JsonProperty("comments")
private Object comments;*/
@JsonProperty("optimization_version")
private String optimizationVersion;
@JsonProperty("learn_override_type")
private String learnOverrideType;
@JsonProperty("base_cpm_bid_value")
private Double baseCpmBidValue;
@JsonProperty("impression_limit")
private Integer impressionLimit;
@JsonProperty("bid_multiplier")
private Double bidMultiplier;
@JsonProperty("campaign_type")
private String campaignType;
@JsonProperty("creative_distribution_type")
private String creativeDistributionType;
/*@JsonProperty("allocation_pct")
private Object allocationPct;*/
@JsonProperty("supply_type_action")
private String supplyTypeAction;
@JsonProperty("supply_type")
private String supplyType;
@JsonProperty("creatives")
private List<Creative> creatives;
/*
@JsonProperty("pixels")
private Object pixels;
@JsonProperty("optimization_lookback")
private Object optimizationLookback;
@JsonProperty("campaign_modifiers")
private Object campaignModifiers;*/
@JsonProperty("labels")
private List<Label> labels;
/*
@JsonProperty("broker_fees")
private Object brokerFees;
*/
/*
@JsonProperty("valuation")
private Object valuation;
*/
/*
@JsonProperty("bid_model")
private Object bidModel;
@JsonProperty("bid_modifier_model")
private Object bidModifierModel;
*/
@JsonProperty("lifetime_budget")
private Integer lifetimeBudget;
@JsonProperty("lifetime_budget_imps")
private Integer lifetimeBudgetImps;
@JsonProperty("daily_budget")
private Double dailyBudget;
@JsonProperty("daily_budget_imps")
private Integer dailyBudgetImps;
@JsonProperty("enable_pacing")
private Boolean enablePacing;
@JsonProperty("allow_safety_pacing")
private Boolean allowSafetyPacing;
@JsonProperty("lifetime_pacing")
private Boolean lifetimePacing;
@JsonProperty("lifetime_pacing_span")
private Integer lifetimePacingSpan;
@JsonProperty("lifetime_pacing_pct")
private Integer lifetimePacingPct;

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("state")
public String getState() {
return state;
}

@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

@JsonProperty("code")
public String getCode() {
return code;
}

@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

@JsonProperty("advertiser_id")
public Integer getAdvertiserId() {
return advertiserId;
}

@JsonProperty("advertiser_id")
public void setAdvertiserId(Integer advertiserId) {
this.advertiserId = advertiserId;
}

@JsonProperty("line_item_id")
public Integer getLineItemId() {
return lineItemId;
}

@JsonProperty("line_item_id")
public void setLineItemId(Integer lineItemId) {
this.lineItemId = lineItemId;
}

@JsonProperty("creative_id")
public Integer getCreativeId() {
return creativeId;
}

@JsonProperty("creative_id")
public void setCreativeId(Integer creativeId) {
this.creativeId = creativeId;
}

@JsonProperty("pixel_id")
public Integer getPixelId() {
return pixelId;
}

@JsonProperty("pixel_id")
public void setPixelId(Integer pixelId) {
this.pixelId = pixelId;
}

@JsonProperty("short_name")
public String getShortName() {
return shortName;
}

@JsonProperty("short_name")
public void setShortName(String shortName) {
this.shortName = shortName;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("profile_id")
public Integer getProfileId() {
return profileId;
}

@JsonProperty("profile_id")
public void setProfileId(Integer profileId) {
this.profileId = profileId;
}

@JsonProperty("start_date")
public String getStartDate() {
return startDate;
}

@JsonProperty("start_date")
public void setStartDate(String startDate) {
this.startDate = startDate;
}

@JsonProperty("end_date")
public String getEndDate() {
return endDate;
}

@JsonProperty("end_date")
public void setEndDate(String endDate) {
this.endDate = endDate;
}

@JsonProperty("timezone")
public String getTimezone() {
return timezone;
}

@JsonProperty("timezone")
public void setTimezone(String timezone) {
this.timezone = timezone;
}

@JsonProperty("priority")
public Integer getPriority() {
return priority;
}

@JsonProperty("priority")
public void setPriority(Integer priority) {
this.priority = priority;
}

@JsonProperty("cadence_modifier_enabled")
public Boolean getCadenceModifierEnabled() {
return cadenceModifierEnabled;
}

@JsonProperty("cadence_modifier_enabled")
public void setCadenceModifierEnabled(Boolean cadenceModifierEnabled) {
this.cadenceModifierEnabled = cadenceModifierEnabled;
}

@JsonProperty("cpc_goal")
public Double getCpcGoal() {
return cpcGoal;
}

@JsonProperty("cpc_goal")
public void setCpcGoal(Double cpcGoal) {
this.cpcGoal = cpcGoal;
}

@JsonProperty("cpm_bid_type")
public String getCpmBidType() {
return cpmBidType;
}

@JsonProperty("cpm_bid_type")
public void setCpmBidType(String cpmBidType) {
this.cpmBidType = cpmBidType;
}

@JsonProperty("base_bid")
public Integer getBaseBid() {
return baseBid;
}

@JsonProperty("base_bid")
public void setBaseBid(Integer baseBid) {
this.baseBid = baseBid;
}

@JsonProperty("min_bid")
public Double getMinBid() {
return minBid;
}

@JsonProperty("min_bid")
public void setMinBid(Double minBid) {
this.minBid = minBid;
}

@JsonProperty("max_bid")
public Integer getMaxBid() {
return maxBid;
}

@JsonProperty("max_bid")
public void setMaxBid(Integer maxBid) {
this.maxBid = maxBid;
}

@JsonProperty("bid_margin")
public Integer getBidMargin() {
return bidMargin;
}

@JsonProperty("bid_margin")
public void setBidMargin(Integer bidMargin) {
this.bidMargin = bidMargin;
}

@JsonProperty("roadblock_creatives")
public Boolean getRoadblockCreatives() {
return roadblockCreatives;
}

@JsonProperty("roadblock_creatives")
public void setRoadblockCreatives(Boolean roadblockCreatives) {
this.roadblockCreatives = roadblockCreatives;
}

@JsonProperty("roadblock_type")
public String getRoadblockType() {
return roadblockType;
}

@JsonProperty("roadblock_type")
public void setRoadblockType(String roadblockType) {
this.roadblockType = roadblockType;
}

@JsonProperty("inventory_type")
public String getInventoryType() {
return inventoryType;
}

@JsonProperty("inventory_type")
public void setInventoryType(String inventoryType) {
this.inventoryType = inventoryType;
}

@JsonProperty("last_modified")
public String getLastModified() {
return lastModified;
}

@JsonProperty("last_modified")
public void setLastModified(String lastModified) {
this.lastModified = lastModified;
}

@JsonProperty("max_learn_bid")
public Double getMaxLearnBid() {
return maxLearnBid;
}

@JsonProperty("max_learn_bid")
public void setMaxLearnBid(Double maxLearnBid) {
this.maxLearnBid = maxLearnBid;
}

@JsonProperty("cadence_type")
public String getCadenceType() {
return cadenceType;
}

@JsonProperty("cadence_type")
public void setCadenceType(String cadenceType) {
this.cadenceType = cadenceType;
}

@JsonProperty("member_id")
public Integer getMemberId() {
return memberId;
}

@JsonProperty("member_id")
public void setMemberId(Integer memberId) {
this.memberId = memberId;
}

@JsonProperty("click_url")
public String getClickUrl() {
return clickUrl;
}

@JsonProperty("click_url")
public void setClickUrl(String clickUrl) {
this.clickUrl = clickUrl;
}

@JsonProperty("require_cookie_for_tracking")
public Boolean getRequireCookieForTracking() {
return requireCookieForTracking;
}

@JsonProperty("require_cookie_for_tracking")
public void setRequireCookieForTracking(Boolean requireCookieForTracking) {
this.requireCookieForTracking = requireCookieForTracking;
}

@JsonProperty("allow_unverified_ecp")
public Boolean getAllowUnverifiedEcp() {
return allowUnverifiedEcp;
}

@JsonProperty("allow_unverified_ecp")
public void setAllowUnverifiedEcp(Boolean allowUnverifiedEcp) {
this.allowUnverifiedEcp = allowUnverifiedEcp;
}

@JsonProperty("defer_to_li_prediction")
public Boolean getDeferToLiPrediction() {
return deferToLiPrediction;
}

@JsonProperty("defer_to_li_prediction")
public void setDeferToLiPrediction(Boolean deferToLiPrediction) {
this.deferToLiPrediction = deferToLiPrediction;
}

/*
@JsonProperty("ecp_learn_divisor")
public Object getEcpLearnDivisor() {
return ecpLearnDivisor;
}

@JsonProperty("ecp_learn_divisor")
public void setEcpLearnDivisor(Object ecpLearnDivisor) {
this.ecpLearnDivisor = ecpLearnDivisor;
}

@JsonProperty("projected_learn_events")
public Object getProjectedLearnEvents() {
return projectedLearnEvents;
}

@JsonProperty("projected_learn_events")
public void setProjectedLearnEvents(Object projectedLearnEvents) {
this.projectedLearnEvents = projectedLearnEvents;
}*/

@JsonProperty("learn_threshold")
public Integer getLearnThreshold() {
return learnThreshold;
}

@JsonProperty("learn_threshold")
public void setLearnThreshold(Integer learnThreshold) {
this.learnThreshold = learnThreshold;
}

@JsonProperty("cpc_payout")
public Double getCpcPayout() {
return cpcPayout;
}

@JsonProperty("cpc_payout")
public void setCpcPayout(Double cpcPayout) {
this.cpcPayout = cpcPayout;
}
/*
@JsonProperty("comments")
public Object getComments() {
return comments;
}

@JsonProperty("comments")
public void setComments(Object comments) {
this.comments = comments;
}
*/
@JsonProperty("optimization_version")
public String getOptimizationVersion() {
return optimizationVersion;
}

@JsonProperty("optimization_version")
public void setOptimizationVersion(String optimizationVersion) {
this.optimizationVersion = optimizationVersion;
}

@JsonProperty("learn_override_type")
public String getLearnOverrideType() {
return learnOverrideType;
}

@JsonProperty("learn_override_type")
public void setLearnOverrideType(String learnOverrideType) {
this.learnOverrideType = learnOverrideType;
}

@JsonProperty("base_cpm_bid_value")
public Double getBaseCpmBidValue() {
return baseCpmBidValue;
}

@JsonProperty("base_cpm_bid_value")
public void setBaseCpmBidValue(Double baseCpmBidValue) {
this.baseCpmBidValue = baseCpmBidValue;
}

@JsonProperty("impression_limit")
public Integer getImpressionLimit() {
return impressionLimit;
}

@JsonProperty("impression_limit")
public void setImpressionLimit(Integer impressionLimit) {
this.impressionLimit = impressionLimit;
}

@JsonProperty("bid_multiplier")
public Double getBidMultiplier() {
return bidMultiplier;
}

@JsonProperty("bid_multiplier")
public void setBidMultiplier(Double bidMultiplier) {
this.bidMultiplier = bidMultiplier;
}

@JsonProperty("campaign_type")
public String getCampaignType() {
return campaignType;
}

@JsonProperty("campaign_type")
public void setCampaignType(String campaignType) {
this.campaignType = campaignType;
}

@JsonProperty("creative_distribution_type")
public String getCreativeDistributionType() {
return creativeDistributionType;
}

@JsonProperty("creative_distribution_type")
public void setCreativeDistributionType(String creativeDistributionType) {
this.creativeDistributionType = creativeDistributionType;
}

@JsonProperty("supply_type_action")
public String getSupplyTypeAction() {
return supplyTypeAction;
}

@JsonProperty("supply_type_action")
public void setSupplyTypeAction(String supplyTypeAction) {
this.supplyTypeAction = supplyTypeAction;
}

@JsonProperty("supply_type")
public String getSupplyType() {
return supplyType;
}

@JsonProperty("supply_type")
public void setSupplyType(String supplyType) {
this.supplyType = supplyType;
}

@JsonProperty("creatives")
public List<Creative> getCreatives() {
return creatives;
}

@JsonProperty("creatives")
public void setCreatives(List<Creative> creatives) {
this.creatives = creatives;
}
/*
@JsonProperty("pixels")
public Object getPixels() {
return pixels;
}

@JsonProperty("pixels")
public void setPixels(Object pixels) {
this.pixels = pixels;
}

@JsonProperty("optimization_lookback")
public Object getOptimizationLookback() {
return optimizationLookback;
}

@JsonProperty("optimization_lookback")
public void setOptimizationLookback(Object optimizationLookback) {
this.optimizationLookback = optimizationLookback;
}

@JsonProperty("campaign_modifiers")
public Object getCampaignModifiers() {
return campaignModifiers;
}

@JsonProperty("campaign_modifiers")
public void setCampaignModifiers(Object campaignModifiers) {
this.campaignModifiers = campaignModifiers;
}*/

@JsonProperty("labels")
public List<Label> getLabels() {
return labels;
}

@JsonProperty("labels")
public void setLabels(List<Label> labels) {
this.labels = labels;
}
/*
@JsonProperty("broker_fees")
public Object getBrokerFees() {
return brokerFees;
}

@JsonProperty("broker_fees")
public void setBrokerFees(Object brokerFees) {
this.brokerFees = brokerFees;
}

@JsonProperty("valuation")
public Object getValuation() {
return valuation;
}

@JsonProperty("valuation")
public void setValuation(Object valuation) {
this.valuation = valuation;
}

@JsonProperty("bid_model")
public Object getBidModel() {
return bidModel;
}

@JsonProperty("bid_model")
public void setBidModel(Object bidModel) {
this.bidModel = bidModel;
}

@JsonProperty("bid_modifier_model")
public Object getBidModifierModel() {
return bidModifierModel;
}

@JsonProperty("bid_modifier_model")
public void setBidModifierModel(Object bidModifierModel) {
this.bidModifierModel = bidModifierModel;
}*/

@JsonProperty("lifetime_budget")
public Integer getLifetimeBudget() {
return lifetimeBudget;
}

@JsonProperty("lifetime_budget")
public void setLifetimeBudget(Integer lifetimeBudget) {
this.lifetimeBudget = lifetimeBudget;
}

@JsonProperty("lifetime_budget_imps")
public Integer getLifetimeBudgetImps() {
return lifetimeBudgetImps;
}

@JsonProperty("lifetime_budget_imps")
public void setLifetimeBudgetImps(Integer lifetimeBudgetImps) {
this.lifetimeBudgetImps = lifetimeBudgetImps;
}

@JsonProperty("daily_budget")
public Double getDailyBudget() {
return dailyBudget;
}

@JsonProperty("daily_budget")
public void setDailyBudget(Double dailyBudget) {
this.dailyBudget = dailyBudget;
}

@JsonProperty("daily_budget_imps")
public Integer getDailyBudgetImps() {
return dailyBudgetImps;
}

@JsonProperty("daily_budget_imps")
public void setDailyBudgetImps(Integer dailyBudgetImps) {
this.dailyBudgetImps = dailyBudgetImps;
}

@JsonProperty("enable_pacing")
public Boolean getEnablePacing() {
return enablePacing;
}

@JsonProperty("enable_pacing")
public void setEnablePacing(Boolean enablePacing) {
this.enablePacing = enablePacing;
}

@JsonProperty("allow_safety_pacing")
public Boolean getAllowSafetyPacing() {
return allowSafetyPacing;
}

@JsonProperty("allow_safety_pacing")
public void setAllowSafetyPacing(Boolean allowSafetyPacing) {
this.allowSafetyPacing = allowSafetyPacing;
}

@JsonProperty("lifetime_pacing")
public Boolean getLifetimePacing() {
return lifetimePacing;
}

@JsonProperty("lifetime_pacing")
public void setLifetimePacing(Boolean lifetimePacing) {
this.lifetimePacing = lifetimePacing;
}

@JsonProperty("lifetime_pacing_span")
public Integer getLifetimePacingSpan() {
return lifetimePacingSpan;
}

@JsonProperty("lifetime_pacing_span")
public void setLifetimePacingSpan(Integer lifetimePacingSpan) {
this.lifetimePacingSpan = lifetimePacingSpan;
}

@JsonProperty("lifetime_pacing_pct")
public Integer getLifetimePacingPct() {
return lifetimePacingPct;
}

@JsonProperty("lifetime_pacing_pct")
public void setLifetimePacingPct(Integer lifetimePacingPct) {
this.lifetimePacingPct = lifetimePacingPct;
}

}