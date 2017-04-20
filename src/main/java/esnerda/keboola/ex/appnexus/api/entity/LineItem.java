
package esnerda.keboola.ex.appnexus.api.entity;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LineItem {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("advertiser_id")
    private Integer advertiserId;
    @JsonProperty("state")
    private String state;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("discrepancy_pct")
    private Integer discrepancyPct;
    @JsonProperty("publishers_allowed")
    private String publishersAllowed;
    @JsonProperty("revenue_value")
    private Integer revenueValue;
    @JsonProperty("revenue_type")
    private String revenueType;
    @JsonProperty("goal_type")
    private String goalType;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("click_url")
    private String clickUrl;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("require_cookie_for_tracking")
    private Boolean requireCookieForTracking;
    @JsonProperty("profile_id")
    private Integer profileId;
    @JsonProperty("member_id")
    private Integer memberId;
    /*
    @JsonProperty("flat_fee_type")
    private Object flatFeeType;*/
    @JsonProperty("comments")
    private String comments;
   
    @JsonProperty("manage_creative")
    private Boolean manageCreative;
    @JsonProperty("creative_distribution_type")
    private String creativeDistributionType;
    @JsonProperty("line_item_type")
    private String lineItemType;
    @JsonProperty("prefer_delivery_over_performance")
    private Boolean preferDeliveryOverPerformance;
    @JsonProperty("advertiser")
    private Advertiser advertiser;
    /*
    @JsonProperty("flat_fee")
    private Object flatFee;*/
    /*
    @JsonProperty("delivery_goal")
    private Object deliveryGoal;*/
    @JsonProperty("labels")
    private List<Label> labels;
    /*
    @JsonProperty("broker_fees")
    private Object brokerFees;
    @JsonProperty("pixels")
    private Object pixels;*/
    @JsonProperty("insertion_orders")
    private List<InsertionOrder> insertionOrders = null;
    /*
    @JsonProperty("goal_pixels")
    private Object goalPixels;
    @JsonProperty("imptrackers")
    private Object imptrackers;
    @JsonProperty("clicktrackers")
    private Object clicktrackers;*/
    
    @JsonProperty("campaigns")
    private List<Campaign> campaigns = null;
    
    @JsonProperty("valuation")
    private Valuation valuation;
    //parse helper attrs
   
    private BigDecimal minMarginPct;  
    private  Double maxAvgCpm;    
    private Double minAvgCpm;    
    private BigDecimal goalTarget;   
    private BigDecimal goalThreshold;
    private Boolean noRevenueLog;
    private Boolean performanceOffer;
    private Boolean performanceMktManaged;
    private Boolean performanceMktCrossnet;
    private Boolean bidPricePacingEnabled;
    private Integer bidPricePacingLever;
    private String campaignGroupValuationStrategy;
    private BigDecimal goalConfidenceThreshold;
    
    @JsonProperty("creatives")
    private List<Creative> creatives;
    @JsonProperty("budget_intervals")
    private List<BudgetInterval> budgetIntervals = null;
   
    /*
    @JsonProperty("click_model")
    private Object clickModel;
    @JsonProperty("expected_value_model")
    private Object expectedValueModel;
    @JsonProperty("custom_models")
    private Object customModels;*//*
    @JsonProperty("inventory_discovery")
    private Object inventoryDiscovery;
    @JsonProperty("inventory_discovery_budget")
    private Object inventoryDiscoveryBudget;
    @JsonProperty("incrementality")
    private Object incrementality;
    @JsonProperty("auction_event")
    private Object auctionEvent;
    @JsonProperty("custom_optimization_note")
    private Object customOptimizationNote;*/
    @JsonProperty("lifetime_budget")
    private Double lifetimeBudget;
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
    private Double lifetimePacingPct;
    @JsonProperty("payout_margin")
    private Double payoutMargin;

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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("advertiser_id")
    public Integer getAdvertiserId() {
        return advertiserId;
    }

    @JsonProperty("advertiser_id")
    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
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

    @JsonProperty("discrepancy_pct")
    public Integer getDiscrepancyPct() {
        return discrepancyPct;
    }

    @JsonProperty("discrepancy_pct")
    public void setDiscrepancyPct(Integer discrepancyPct) {
        this.discrepancyPct = discrepancyPct;
    }

    @JsonProperty("publishers_allowed")
    public String getPublishersAllowed() {
        return publishersAllowed;
    }

    @JsonProperty("publishers_allowed")
    public void setPublishersAllowed(String publishersAllowed) {
        this.publishersAllowed = publishersAllowed;
    }

    @JsonProperty("revenue_value")
    public Integer getRevenueValue() {
        return revenueValue;
    }

    @JsonProperty("revenue_value")
    public void setRevenueValue(Integer revenueValue) {
        this.revenueValue = revenueValue;
    }

    @JsonProperty("revenue_type")
    public String getRevenueType() {
        return revenueType;
    }

    @JsonProperty("revenue_type")
    public void setRevenueType(String revenueType) {
        this.revenueType = revenueType;
    }

    @JsonProperty("goal_type")
    public String getGoalType() {
        return goalType;
    }

    @JsonProperty("goal_type")
    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("click_url")
    public String getClickUrl() {
        return clickUrl;
    }

    @JsonProperty("click_url")
    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("require_cookie_for_tracking")
    public Boolean getRequireCookieForTracking() {
        return requireCookieForTracking;
    }

    @JsonProperty("require_cookie_for_tracking")
    public void setRequireCookieForTracking(Boolean requireCookieForTracking) {
        this.requireCookieForTracking = requireCookieForTracking;
    }

    @JsonProperty("profile_id")
    public Integer getProfileId() {
        return profileId;
    }

    @JsonProperty("profile_id")
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    @JsonProperty("member_id")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("member_id")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
/*
    @JsonProperty("flat_fee_type")
    public Object getFlatFeeType() {
        return flatFeeType;
    }

    @JsonProperty("flat_fee_type")
    public void setFlatFeeType(Object flatFeeType) {
        this.flatFeeType = flatFeeType;
    }*/

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("manage_creative")
    public Boolean getManageCreative() {
        return manageCreative;
    }

    @JsonProperty("manage_creative")
    public void setManageCreative(Boolean manageCreative) {
        this.manageCreative = manageCreative;
    }

    @JsonProperty("creative_distribution_type")
    public String getCreativeDistributionType() {
        return creativeDistributionType;
    }

    @JsonProperty("creative_distribution_type")
    public void setCreativeDistributionType(String creativeDistributionType) {
        this.creativeDistributionType = creativeDistributionType;
    }

    @JsonProperty("line_item_type")
    public String getLineItemType() {
        return lineItemType;
    }

    @JsonProperty("line_item_type")
    public void setLineItemType(String lineItemType) {
        this.lineItemType = lineItemType;
    }

    @JsonProperty("prefer_delivery_over_performance")
    public Boolean getPreferDeliveryOverPerformance() {
        return preferDeliveryOverPerformance;
    }

    @JsonProperty("prefer_delivery_over_performance")
    public void setPreferDeliveryOverPerformance(Boolean preferDeliveryOverPerformance) {
        this.preferDeliveryOverPerformance = preferDeliveryOverPerformance;
    }

    @JsonProperty("advertiser")
    public Advertiser getAdvertiser() {
        return advertiser;
    }

    @JsonProperty("advertiser")
    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }

   /* @JsonProperty("flat_fee")
    public Object getFlatFee() {
        return flatFee;
    }

    @JsonProperty("flat_fee")
    public void setFlatFee(Object flatFee) {
        this.flatFee = flatFee;
    }

    @JsonProperty("delivery_goal")
    public Object getDeliveryGoal() {
        return deliveryGoal;
    }

    @JsonProperty("delivery_goal")
    public void setDeliveryGoal(Object deliveryGoal) {
        this.deliveryGoal = deliveryGoal;
    }*/

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    /*@JsonProperty("broker_fees")
    public Object getBrokerFees() {
        return brokerFees;
    }

    @JsonProperty("broker_fees")
    public void setBrokerFees(Object brokerFees) {
        this.brokerFees = brokerFees;
    }

    @JsonProperty("pixels")
    public Object getPixels() {
        return pixels;
    }

    @JsonProperty("pixels")
    public void setPixels(Object pixels) {
        this.pixels = pixels;
    }
*/
    @JsonProperty("insertion_orders")
    public List<InsertionOrder> getInsertionOrders() {
        return insertionOrders;
    }

    @JsonProperty("insertion_orders")
    public void setInsertionOrders(List<InsertionOrder> insertionOrders) {
        this.insertionOrders = insertionOrders;
    }
/*
    @JsonProperty("goal_pixels")
    public Object getGoalPixels() {
        return goalPixels;
    }

    @JsonProperty("goal_pixels")
    public void setGoalPixels(Object goalPixels) {
        this.goalPixels = goalPixels;
    }

    @JsonProperty("imptrackers")
    public Object getImptrackers() {
        return imptrackers;
    }

    @JsonProperty("imptrackers")
    public void setImptrackers(Object imptrackers) {
        this.imptrackers = imptrackers;
    }

    @JsonProperty("clicktrackers")
    public Object getClicktrackers() {
        return clicktrackers;
    }

    @JsonProperty("clicktrackers")
    public void setClicktrackers(Object clicktrackers) {
        this.clicktrackers = clicktrackers;
    }*/

    @JsonProperty("campaigns")
    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    @JsonProperty("campaigns")
    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    @JsonProperty("valuation")
    public Valuation getValuation() {
        return valuation;
    }

    

    public BigDecimal getMinMarginPct() {
    	if (valuation != null) {
    		valuation.getMinMarginPct();
    	}
		return null;
	}

	public Double getMaxAvgCpm() {
		if (valuation != null) {
    		valuation.getMaxAvgCpm();
    	}
		return null;
	}

	public Double getMinAvgCpm() {
		if (valuation != null) {
    		valuation.getMinAvgCpm();
    	}
		return null;
	}

	public BigDecimal getGoalTarget() {
		if (valuation != null) {
    		valuation.getGoalTarget();
    	}
		return null;
	}

	public BigDecimal getGoalThreshold() {
		if (valuation != null) {
    		valuation.getGoalThreshold();
    	}
		return null;
	}

	public Boolean getNoRevenueLog() {
		if (valuation != null) {
    		valuation.getNoRevenueLog();
    	}
		return null;
	}

	public Boolean getPerformanceOffer() {
		if (valuation != null) {
    		valuation.getPerformanceOffer();
    	}
		return null;
	}

	public Boolean getPerformanceMktManaged() {
		if (valuation != null) {
    		valuation.getPerformanceMktManaged();
    	}
		return null;
	}

	public Boolean getPerformanceMktCrossnet() {
		if (valuation != null) {
    		valuation.getPerformanceMktCrossnet();
    	}
		return null;
	}

	public Boolean getBidPricePacingEnabled() {
		if (valuation != null) {
    		return valuation.getBidPricePacingEnabled();
    	}
		return null;
	}

	public Integer getBidPricePacingLever() {
		if (valuation != null) {
    		valuation.getBidPricePacingLever();
    	}
		return null;
	}

	public String getCampaignGroupValuationStrategy() {
		if (valuation != null) {
    		valuation.getCampaignGroupValuationStrategy();
    	}
		return null;
	}

	public BigDecimal getGoalConfidenceThreshold() {
		if (valuation != null) {
    		valuation.getGoalConfidenceThreshold();
    	}
		return null;
	}

	@JsonProperty("valuation")
    public void setValuation(Valuation valuation) {
        this.valuation = valuation;
    }

    @JsonProperty("creatives")
    public List<Creative> getCreatives() {
        return creatives;
    }

    @JsonProperty("creatives")
    public void setCreatives(List<Creative> creatives) {
        this.creatives = creatives;
    }

    @JsonProperty("budget_intervals")
    public List<BudgetInterval> getBudgetIntervals() {
        return budgetIntervals;
    }

    @JsonProperty("budget_intervals")
    public void setBudgetIntervals(List<BudgetInterval> budgetIntervals) {
        this.budgetIntervals = budgetIntervals;
    }
/*
    @JsonProperty("click_model")
    public Object getClickModel() {
        return clickModel;
    }

    @JsonProperty("click_model")
    public void setClickModel(Object clickModel) {
        this.clickModel = clickModel;
    }

    @JsonProperty("expected_value_model")
    public Object getExpectedValueModel() {
        return expectedValueModel;
    }

    @JsonProperty("expected_value_model")
    public void setExpectedValueModel(Object expectedValueModel) {
        this.expectedValueModel = expectedValueModel;
    }

    @JsonProperty("custom_models")
    public Object getCustomModels() {
        return customModels;
    }

    @JsonProperty("custom_models")
    public void setCustomModels(Object customModels) {
        this.customModels = customModels;
    }
*/
    /*@JsonProperty("inventory_discovery")
    public Object getInventoryDiscovery() {
        return inventoryDiscovery;
    }

    @JsonProperty("inventory_discovery")
    public void setInventoryDiscovery(Object inventoryDiscovery) {
        this.inventoryDiscovery = inventoryDiscovery;
    }

    @JsonProperty("inventory_discovery_budget")
    public Object getInventoryDiscoveryBudget() {
        return inventoryDiscoveryBudget;
    }

    @JsonProperty("inventory_discovery_budget")
    public void setInventoryDiscoveryBudget(Object inventoryDiscoveryBudget) {
        this.inventoryDiscoveryBudget = inventoryDiscoveryBudget;
    }

    @JsonProperty("incrementality")
    public Object getIncrementality() {
        return incrementality;
    }

    @JsonProperty("incrementality")
    public void setIncrementality(Object incrementality) {
        this.incrementality = incrementality;
    }

    @JsonProperty("auction_event")
    public Object getAuctionEvent() {
        return auctionEvent;
    }

    @JsonProperty("auction_event")
    public void setAuctionEvent(Object auctionEvent) {
        this.auctionEvent = auctionEvent;
    }

    @JsonProperty("custom_optimization_note")
    public Object getCustomOptimizationNote() {
        return customOptimizationNote;
    }

    @JsonProperty("custom_optimization_note")
    public void setCustomOptimizationNote(Object customOptimizationNote) {
        this.customOptimizationNote = customOptimizationNote;
    }*/

    @JsonProperty("lifetime_budget")
    public Double getLifetimeBudget() {
        return lifetimeBudget;
    }

    @JsonProperty("lifetime_budget")
    public void setLifetimeBudget(Double lifetimeBudget) {
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
    public Double getLifetimePacingPct() {
        return lifetimePacingPct;
    }

    @JsonProperty("lifetime_pacing_pct")
    public void setLifetimePacingPct(Double lifetimePacingPct) {
        this.lifetimePacingPct = lifetimePacingPct;
    }

    @JsonProperty("payout_margin")
    public Double getPayoutMargin() {
        return payoutMargin;
    }

    @JsonProperty("payout_margin")
    public void setPayoutMargin(Double payoutMargin) {
        this.payoutMargin = payoutMargin;
    }

}
