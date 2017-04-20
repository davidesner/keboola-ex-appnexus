
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BudgetInterval {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("object_id")
    private Integer objectId;
    @JsonProperty("object_type")
    private String objectType;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("lifetime_budget")
    private Double lifetimeBudget;
    @JsonProperty("lifetime_budget_imps")
    private Integer lifetimeBudgetImps;
    @JsonProperty("lifetime_pacing")
    private Boolean lifetimePacing;
    @JsonProperty("enable_pacing")
    private Boolean enablePacing;
    @JsonProperty("daily_budget_imps")
    private Integer dailyBudgetImps;
    @JsonProperty("daily_budget")
    private Integer dailyBudget;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("object_id")
    public Integer getObjectId() {
        return objectId;
    }

    @JsonProperty("object_id")
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    @JsonProperty("object_type")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("object_type")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
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

    @JsonProperty("lifetime_pacing")
    public Boolean getLifetimePacing() {
        return lifetimePacing;
    }

    @JsonProperty("lifetime_pacing")
    public void setLifetimePacing(Boolean lifetimePacing) {
        this.lifetimePacing = lifetimePacing;
    }

    @JsonProperty("enable_pacing")
    public Boolean getEnablePacing() {
        return enablePacing;
    }

    @JsonProperty("enable_pacing")
    public void setEnablePacing(Boolean enablePacing) {
        this.enablePacing = enablePacing;
    }

    @JsonProperty("daily_budget_imps")
    public Integer getDailyBudgetImps() {
        return dailyBudgetImps;
    }

    @JsonProperty("daily_budget_imps")
    public void setDailyBudgetImps(Integer dailyBudgetImps) {
        this.dailyBudgetImps = dailyBudgetImps;
    }

    @JsonProperty("daily_budget")
    public Integer getDailyBudget() {
        return dailyBudget;
    }

    @JsonProperty("daily_budget")
    public void setDailyBudget(Integer dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

}
