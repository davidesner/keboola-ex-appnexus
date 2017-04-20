
package esnerda.keboola.ex.appnexus.api.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Valuation {

    @JsonProperty("min_margin_pct")
    private BigDecimal minMarginPct;
    @JsonProperty("max_avg_cpm")
    private  Double maxAvgCpm;
    @JsonProperty("min_avg_cpm")
    private Double minAvgCpm;
    @JsonProperty("goal_target")
    private BigDecimal goalTarget;
    @JsonProperty("goal_threshold")
    private BigDecimal goalThreshold;
    @JsonProperty("no_revenue_log")
    private Boolean noRevenueLog;
    @JsonProperty("performance_offer")
    private Boolean performanceOffer;
    @JsonProperty("performance_mkt_managed")
    private Boolean performanceMktManaged;
    @JsonProperty("performance_mkt_crossnet")
    private Boolean performanceMktCrossnet;
    @JsonProperty("bid_price_pacing_enabled")
    private Boolean bidPricePacingEnabled;
    @JsonProperty("bid_price_pacing_lever")
    private Integer bidPricePacingLever;
    @JsonProperty("campaign_group_valuation_strategy")
    private String campaignGroupValuationStrategy;
    @JsonProperty("goal_confidence_threshold")
    private BigDecimal goalConfidenceThreshold;

    @JsonProperty("min_margin_pct")
    public BigDecimal getMinMarginPct() {
        return minMarginPct;
    }

    @JsonProperty("min_margin_pct")
    public void setMinMarginPct(BigDecimal minMarginPct) {
        this.minMarginPct = minMarginPct;
    }

    @JsonProperty("max_avg_cpm")
    public Double getMaxAvgCpm() {
        return maxAvgCpm;
    }

    @JsonProperty("max_avg_cpm")
    public void setMaxAvgCpm(Double maxAvgCpm) {
        this.maxAvgCpm = maxAvgCpm;
    }

    @JsonProperty("min_avg_cpm")
    public Double getMinAvgCpm() {
        return minAvgCpm;
    }

    @JsonProperty("min_avg_cpm")
    public void setMinAvgCpm(Double minAvgCpm) {
        this.minAvgCpm = minAvgCpm;
    }

    @JsonProperty("goal_target")
    public BigDecimal getGoalTarget() {
        return goalTarget;
    }

    @JsonProperty("goal_target")
    public void setGoalTarget(BigDecimal goalTarget) {
        this.goalTarget = goalTarget;
    }

    @JsonProperty("goal_threshold")
    public BigDecimal getGoalThreshold() {
        return goalThreshold;
    }

    @JsonProperty("goal_threshold")
    public void setGoalThreshold(BigDecimal goalThreshold) {
        this.goalThreshold = goalThreshold;
    }

    @JsonProperty("no_revenue_log")
    public Boolean getNoRevenueLog() {
        return noRevenueLog;
    }

    @JsonProperty("no_revenue_log")
    public void setNoRevenueLog(Boolean noRevenueLog) {
        this.noRevenueLog = noRevenueLog;
    }

    @JsonProperty("performance_offer")
    public Boolean getPerformanceOffer() {
        return performanceOffer;
    }

    @JsonProperty("performance_offer")
    public void setPerformanceOffer(Boolean performanceOffer) {
        this.performanceOffer = performanceOffer;
    }

    @JsonProperty("performance_mkt_managed")
    public Boolean getPerformanceMktManaged() {
        return performanceMktManaged;
    }

    @JsonProperty("performance_mkt_managed")
    public void setPerformanceMktManaged(Boolean performanceMktManaged) {
        this.performanceMktManaged = performanceMktManaged;
    }

    @JsonProperty("performance_mkt_crossnet")
    public Boolean getPerformanceMktCrossnet() {
        return performanceMktCrossnet;
    }

    @JsonProperty("performance_mkt_crossnet")
    public void setPerformanceMktCrossnet(Boolean performanceMktCrossnet) {
        this.performanceMktCrossnet = performanceMktCrossnet;
    }

    @JsonProperty("bid_price_pacing_enabled")
    public Boolean getBidPricePacingEnabled() {
        return bidPricePacingEnabled;
    }

    @JsonProperty("bid_price_pacing_enabled")
    public void setBidPricePacingEnabled(Boolean bidPricePacingEnabled) {
        this.bidPricePacingEnabled = bidPricePacingEnabled;
    }

    @JsonProperty("bid_price_pacing_lever")
    public Integer getBidPricePacingLever() {
        return bidPricePacingLever;
    }

    @JsonProperty("bid_price_pacing_lever")
    public void setBidPricePacingLever(Integer bidPricePacingLever) {
        this.bidPricePacingLever = bidPricePacingLever;
    }

    @JsonProperty("campaign_group_valuation_strategy")
    public String getCampaignGroupValuationStrategy() {
        return campaignGroupValuationStrategy;
    }

    @JsonProperty("campaign_group_valuation_strategy")
    public void setCampaignGroupValuationStrategy(String campaignGroupValuationStrategy) {
        this.campaignGroupValuationStrategy = campaignGroupValuationStrategy;
    }

    @JsonProperty("goal_confidence_threshold")
    public BigDecimal getGoalConfidenceThreshold() {
        return goalConfidenceThreshold;
    }

    @JsonProperty("goal_confidence_threshold")
    public void setGoalConfidenceThreshold(BigDecimal goalConfidenceThreshold) {
        this.goalConfidenceThreshold = goalConfidenceThreshold;
    }

}
