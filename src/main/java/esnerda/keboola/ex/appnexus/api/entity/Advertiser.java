
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Advertiser {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("state")
    private String state;
    @JsonProperty("default_brand_id")
    private Integer defaultBrandId;
    @JsonProperty("remarketing_segment_id")
    private Integer remarketingSegmentId;
    @JsonProperty("profile_id")
    private Integer profileId;
    @JsonProperty("control_pct")
    private Integer controlPct;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("member_id")
    private Integer memberId;
    @JsonProperty("billing_name")
    private String billingName;
    @JsonProperty("billing_phone")
    private String billingPhone;
    @JsonProperty("billing_address1")
    private String billingAddress1;
    @JsonProperty("billing_address2")
    private String billingAddress2;
    @JsonProperty("billing_city")
    private String billingCity;
    @JsonProperty("billing_state")
    private String billingState;
    @JsonProperty("billing_country")
    private String billingCountry;
    @JsonProperty("billing_zip")
    private String billingZip;
    @JsonProperty("default_currency")
    private String defaultCurrency;
    @JsonProperty("use_insertion_orders")
    private Boolean useInsertionOrders;
    @JsonProperty("time_format")
    private String timeFormat;
    @JsonProperty("is_malicious")
    private Boolean isMalicious;
    @JsonProperty("is_mediated")
    private Boolean isMediated;
    @JsonProperty("default_category")
    private Category defaultCategory;
    @JsonProperty("default_brand")
    private Brand defaultBrand;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("competitive_brands")
    private List<String> competitiveBrands;
    @JsonProperty("competitive_categories")
    private List<String> competitiveCategories;
    /*@JsonProperty("thirdparty_pixels")
    private Object thirdpartyPixels;*/
    /*@JsonProperty("macros")
    private Object macros;*/
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
   /* @JsonProperty("lifetime_pacing")
    private Object lifetimePacing;
    @JsonProperty("lifetime_pacing_span")
    private Object lifetimePacingSpan;
    @JsonProperty("lifetime_pacing_pct")
    private Object lifetimePacingPct;*/

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("code")
    public Object getCode() {
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

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("default_brand_id")
    public Integer getDefaultBrandId() {
        return defaultBrandId;
    }

    @JsonProperty("default_brand_id")
    public void setDefaultBrandId(Integer defaultBrandId) {
        this.defaultBrandId = defaultBrandId;
    }

    @JsonProperty("remarketing_segment_id")
    public Integer getRemarketingSegmentId() {
        return remarketingSegmentId;
    }

    @JsonProperty("remarketing_segment_id")
    public void setRemarketingSegmentId(Integer remarketingSegmentId) {
        this.remarketingSegmentId = remarketingSegmentId;
    }

    @JsonProperty("profile_id")
    public Integer getProfileId() {
        return profileId;
    }

    @JsonProperty("profile_id")
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    @JsonProperty("control_pct")
    public Integer getControlPct() {
        return controlPct;
    }

    @JsonProperty("control_pct")
    public void setControlPct(Integer controlPct) {
        this.controlPct = controlPct;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("member_id")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("member_id")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("billing_name")
    public String getBillingName() {
        return billingName;
    }

    @JsonProperty("billing_name")
    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    @JsonProperty("billing_phone")
    public String getBillingPhone() {
        return billingPhone;
    }

    @JsonProperty("billing_phone")
    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    @JsonProperty("billing_address1")
    public String getBillingAddress1() {
        return billingAddress1;
    }

    @JsonProperty("billing_address1")
    public void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    @JsonProperty("billing_address2")
    public String getBillingAddress2() {
        return billingAddress2;
    }

    @JsonProperty("billing_address2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    @JsonProperty("billing_city")
    public String getBillingCity() {
        return billingCity;
    }

    @JsonProperty("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @JsonProperty("billing_state")
    public String getBillingState() {
        return billingState;
    }

    @JsonProperty("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    @JsonProperty("billing_country")
    public String getBillingCountry() {
        return billingCountry;
    }

    @JsonProperty("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @JsonProperty("billing_zip")
    public String getBillingZip() {
        return billingZip;
    }

    @JsonProperty("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    @JsonProperty("default_currency")
    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    @JsonProperty("default_currency")
    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    @JsonProperty("use_insertion_orders")
    public Boolean getUseInsertionOrders() {
        return useInsertionOrders;
    }

    @JsonProperty("use_insertion_orders")
    public void setUseInsertionOrders(Boolean useInsertionOrders) {
        this.useInsertionOrders = useInsertionOrders;
    }

    @JsonProperty("time_format")
    public String getTimeFormat() {
        return timeFormat;
    }

    @JsonProperty("time_format")
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    @JsonProperty("is_malicious")
    public Boolean getIsMalicious() {
        return isMalicious;
    }

    @JsonProperty("is_malicious")
    public void setIsMalicious(Boolean isMalicious) {
        this.isMalicious = isMalicious;
    }

    @JsonProperty("is_mediated")
    public Boolean getIsMediated() {
        return isMediated;
    }

    @JsonProperty("is_mediated")
    public void setIsMediated(Boolean isMediated) {
        this.isMediated = isMediated;
    }

    @JsonProperty("default_category")
    public Category getDefaultCategory() {
        return defaultCategory;
    }

    @JsonProperty("default_category")
    public void setDefaultCategory(Category defaultCategory) {
        this.defaultCategory = defaultCategory;
    }

    @JsonProperty("default_brand")
    public Brand getDefaultBrand() {
        return defaultBrand;
    }

    @JsonProperty("default_brand")
    public void setDefaultBrand(Brand defaultBrand) {
        this.defaultBrand = defaultBrand;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("competitive_brands")
    public String getCompetitiveBrands() {
    	if( competitiveBrands == null) {
    		return null;
    	}
        return  String.join(";", competitiveBrands);
    }

    @JsonProperty("competitive_brands")
    public void setCompetitiveBrands(List<String> competitiveBrands) {
        this.competitiveBrands = competitiveBrands;
    }

    @JsonProperty("competitive_categories")
    public String getCompetitiveCategories() {
    	if (competitiveCategories == null) {
    		return "";
    	}
        return String.join(";", competitiveCategories);
    }

    @JsonProperty("competitive_categories")
    public void setCompetitiveCategories(List<String> competitiveCategories) {
        this.competitiveCategories = competitiveCategories;
    }

   /* @JsonProperty("thirdparty_pixels")
    public Object getThirdpartyPixels() {
        return thirdpartyPixels;
    }

    @JsonProperty("thirdparty_pixels")
    public void setThirdpartyPixels(Object thirdpartyPixels) {
        this.thirdpartyPixels = thirdpartyPixels;
    }

    @JsonProperty("macros")
    public Object getMacros() {
        return macros;
    }

    @JsonProperty("macros")
    public void setMacros(Object macros) {
        this.macros = macros;
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

   /* @JsonProperty("lifetime_pacing")
    public Object getLifetimePacing() {
        return lifetimePacing;
    }

    @JsonProperty("lifetime_pacing")
    public void setLifetimePacing(Object lifetimePacing) {
        this.lifetimePacing = lifetimePacing;
    }

    @JsonProperty("lifetime_pacing_span")
    public Object getLifetimePacingSpan() {
        return lifetimePacingSpan;
    }

    @JsonProperty("lifetime_pacing_span")
    public void setLifetimePacingSpan(Object lifetimePacingSpan) {
        this.lifetimePacingSpan = lifetimePacingSpan;
    }

    @JsonProperty("lifetime_pacing_pct")
    public Object getLifetimePacingPct() {
        return lifetimePacingPct;
    }

    @JsonProperty("lifetime_pacing_pct")
    public void setLifetimePacingPct(Object lifetimePacingPct) {
        this.lifetimePacingPct = lifetimePacingPct;
    }*/

}
