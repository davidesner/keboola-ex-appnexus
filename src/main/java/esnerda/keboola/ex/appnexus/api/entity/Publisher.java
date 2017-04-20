
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Publisher {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("reselling_name")
    private String resellingName;
    @JsonProperty("expose_domains")
    private Boolean exposeDomains;
    @JsonProperty("is_rtb")
    private Boolean isRtb;
    @JsonProperty("reselling_exposure")
    private String resellingExposure;
    @JsonProperty("reselling_exposed_on")
    private String resellingExposedOn;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("max_learn_pct")
    private Integer maxLearnPct;
    @JsonProperty("accept_demand_partner_usersync")
    private Boolean acceptDemandPartnerUsersync;
    @JsonProperty("learn_bypass_cpm")
    private Integer learnBypassCpm;
    @JsonProperty("ad_quality_advanced_mode_enabled")
    private Boolean adQualityAdvancedModeEnabled;
    @JsonProperty("allow_report_on_default_imps")
    private Boolean allowReportOnDefaultImps;
    @JsonProperty("inventory_source")
    private String inventorySource;
    @JsonProperty("inventory_relationship")
    private String inventoryRelationship;
    @JsonProperty("disclosure_status")
    private String disclosureStatus;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("state")
    private String state;
    @JsonProperty("default_site_id")
    private Integer defaultSiteId;
    @JsonProperty("default_ad_profile_id")
    private Integer defaultAdProfileId;
    @JsonProperty("billing_dba")
    private String billingDba;
    @JsonProperty("billing_address1")
    private String billingAddress1;
    @JsonProperty("billing_address2")
    private String billingAddress2;
    @JsonProperty("billing_city")
    private String billingCity;
    @JsonProperty("billing_state")
    private String billingState;
    @JsonProperty("billing_zip")
    private String billingZip;
    @JsonProperty("billing_country")
    private String billingCountry;
    @JsonProperty("accept_supply_partner_usersync")
    private Boolean acceptSupplyPartnerUsersync;
    @JsonProperty("accept_data_provider_usersync")
    private Boolean acceptDataProviderUsersync;
    @JsonProperty("ym_profile_id")
    private Integer ymProfileId;
    @JsonProperty("allow_cpm_managed")
    private Boolean allowCpmManaged;
    @JsonProperty("allow_cpm_external")
    private Boolean allowCpmExternal;
    @JsonProperty("allow_cpa_managed")
    private Boolean allowCpaManaged;
    @JsonProperty("allow_cpa_external")
    private Boolean allowCpaExternal;
    @JsonProperty("allow_cpc_managed")
    private Boolean allowCpcManaged;
    @JsonProperty("allow_cpc_external")
    private Boolean allowCpcExternal;
    @JsonProperty("managed_cpc_bias_pct")
    private Integer managedCpcBiasPct;
    @JsonProperty("managed_cpa_bias_pct")
    private Integer managedCpaBiasPct;
    @JsonProperty("external_cpc_bias_pct")
    private Integer externalCpcBiasPct;
    @JsonProperty("external_cpa_bias_pct")
    private Integer externalCpaBiasPct;
    @JsonProperty("is_oo")
    private Boolean isOo;
    @JsonProperty("base_payment_rule_id")
    private Integer basePaymentRuleId;
    @JsonProperty("base_ad_quality_rule_id")
    private Integer baseAdQualityRuleId;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("visibility_profile_id")
    private Integer visibilityProfileId;
    @JsonProperty("cpm_reselling_disabled")
    private Boolean cpmResellingDisabled;
    @JsonProperty("cpc_reselling_disabled")
    private Boolean cpcResellingDisabled;
    @JsonProperty("platform_ops_notes")
    private String platformOpsNotes;
    @JsonProperty("pitbull_segment_id")
    private Integer pitbullSegmentId;
    @JsonProperty("pitbull_segment_value")
    private Integer pitbullSegmentValue;
    @JsonProperty("enable_cookie_tracking_default")
    private Boolean enableCookieTrackingDefault;
    @JsonProperty("seller_page_cap_enabled")
    private Boolean sellerPageCapEnabled;
    @JsonProperty("inventory_source_name")
    private String inventorySourceName;
    @JsonProperty("billing_internal_user")
    private Integer billingInternalUser;
    /*@JsonProperty("labels")
    private Object labels;*/
    @JsonProperty("placements")
    private List<Placement> placements = null;
    /*@JsonProperty("external_inv_codes")
    private Object externalInvCodes;*/
   /* @JsonProperty("contact_info")
    private Object contactInfo;
    @JsonProperty("publisher_brand_exceptions")
    private Object publisherBrandExceptions;
    @JsonProperty("contact")
    private Object contact;*/

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

    @JsonProperty("reselling_name")
    public String getResellingName() {
        return resellingName;
    }

    @JsonProperty("reselling_name")
    public void setResellingName(String resellingName) {
        this.resellingName = resellingName;
    }

    @JsonProperty("expose_domains")
    public Boolean getExposeDomains() {
        return exposeDomains;
    }

    @JsonProperty("expose_domains")
    public void setExposeDomains(Boolean exposeDomains) {
        this.exposeDomains = exposeDomains;
    }

    @JsonProperty("is_rtb")
    public Boolean getIsRtb() {
        return isRtb;
    }

    @JsonProperty("is_rtb")
    public void setIsRtb(Boolean isRtb) {
        this.isRtb = isRtb;
    }

    @JsonProperty("reselling_exposure")
    public String getResellingExposure() {
        return resellingExposure;
    }

    @JsonProperty("reselling_exposure")
    public void setResellingExposure(String resellingExposure) {
        this.resellingExposure = resellingExposure;
    }

    @JsonProperty("reselling_exposed_on")
    public String getResellingExposedOn() {
        return resellingExposedOn;
    }

    @JsonProperty("reselling_exposed_on")
    public void setResellingExposedOn(String resellingExposedOn) {
        this.resellingExposedOn = resellingExposedOn;
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

    @JsonProperty("max_learn_pct")
    public Integer getMaxLearnPct() {
        return maxLearnPct;
    }

    @JsonProperty("max_learn_pct")
    public void setMaxLearnPct(Integer maxLearnPct) {
        this.maxLearnPct = maxLearnPct;
    }

    @JsonProperty("accept_demand_partner_usersync")
    public Boolean getAcceptDemandPartnerUsersync() {
        return acceptDemandPartnerUsersync;
    }

    @JsonProperty("accept_demand_partner_usersync")
    public void setAcceptDemandPartnerUsersync(Boolean acceptDemandPartnerUsersync) {
        this.acceptDemandPartnerUsersync = acceptDemandPartnerUsersync;
    }

    @JsonProperty("learn_bypass_cpm")
    public Integer getLearnBypassCpm() {
        return learnBypassCpm;
    }

    @JsonProperty("learn_bypass_cpm")
    public void setLearnBypassCpm(Integer learnBypassCpm) {
        this.learnBypassCpm = learnBypassCpm;
    }

    @JsonProperty("ad_quality_advanced_mode_enabled")
    public Boolean getAdQualityAdvancedModeEnabled() {
        return adQualityAdvancedModeEnabled;
    }

    @JsonProperty("ad_quality_advanced_mode_enabled")
    public void setAdQualityAdvancedModeEnabled(Boolean adQualityAdvancedModeEnabled) {
        this.adQualityAdvancedModeEnabled = adQualityAdvancedModeEnabled;
    }

    @JsonProperty("allow_report_on_default_imps")
    public Boolean getAllowReportOnDefaultImps() {
        return allowReportOnDefaultImps;
    }

    @JsonProperty("allow_report_on_default_imps")
    public void setAllowReportOnDefaultImps(Boolean allowReportOnDefaultImps) {
        this.allowReportOnDefaultImps = allowReportOnDefaultImps;
    }

    @JsonProperty("inventory_source")
    public String getInventorySource() {
        return inventorySource;
    }

    @JsonProperty("inventory_source")
    public void setInventorySource(String inventorySource) {
        this.inventorySource = inventorySource;
    }

    @JsonProperty("inventory_relationship")
    public String getInventoryRelationship() {
        return inventoryRelationship;
    }

    @JsonProperty("inventory_relationship")
    public void setInventoryRelationship(String inventoryRelationship) {
        this.inventoryRelationship = inventoryRelationship;
    }

    @JsonProperty("disclosure_status")
    public String getDisclosureStatus() {
        return disclosureStatus;
    }

    @JsonProperty("disclosure_status")
    public void setDisclosureStatus(String disclosureStatus) {
        this.disclosureStatus = disclosureStatus;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("default_site_id")
    public Integer getDefaultSiteId() {
        return defaultSiteId;
    }

    @JsonProperty("default_site_id")
    public void setDefaultSiteId(Integer defaultSiteId) {
        this.defaultSiteId = defaultSiteId;
    }

    @JsonProperty("default_ad_profile_id")
    public Integer getDefaultAdProfileId() {
        return defaultAdProfileId;
    }

    @JsonProperty("default_ad_profile_id")
    public void setDefaultAdProfileId(Integer defaultAdProfileId) {
        this.defaultAdProfileId = defaultAdProfileId;
    }

    @JsonProperty("billing_dba")
    public String getBillingDba() {
        return billingDba;
    }

    @JsonProperty("billing_dba")
    public void setBillingDba(String billingDba) {
        this.billingDba = billingDba;
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

    @JsonProperty("billing_zip")
    public String getBillingZip() {
        return billingZip;
    }

    @JsonProperty("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    @JsonProperty("billing_country")
    public String getBillingCountry() {
        return billingCountry;
    }

    @JsonProperty("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    @JsonProperty("accept_supply_partner_usersync")
    public Boolean getAcceptSupplyPartnerUsersync() {
        return acceptSupplyPartnerUsersync;
    }

    @JsonProperty("accept_supply_partner_usersync")
    public void setAcceptSupplyPartnerUsersync(Boolean acceptSupplyPartnerUsersync) {
        this.acceptSupplyPartnerUsersync = acceptSupplyPartnerUsersync;
    }

    @JsonProperty("accept_data_provider_usersync")
    public Boolean getAcceptDataProviderUsersync() {
        return acceptDataProviderUsersync;
    }

    @JsonProperty("accept_data_provider_usersync")
    public void setAcceptDataProviderUsersync(Boolean acceptDataProviderUsersync) {
        this.acceptDataProviderUsersync = acceptDataProviderUsersync;
    }

    @JsonProperty("ym_profile_id")
    public Integer getYmProfileId() {
        return ymProfileId;
    }

    @JsonProperty("ym_profile_id")
    public void setYmProfileId(Integer ymProfileId) {
        this.ymProfileId = ymProfileId;
    }

    @JsonProperty("allow_cpm_managed")
    public Boolean getAllowCpmManaged() {
        return allowCpmManaged;
    }

    @JsonProperty("allow_cpm_managed")
    public void setAllowCpmManaged(Boolean allowCpmManaged) {
        this.allowCpmManaged = allowCpmManaged;
    }

    @JsonProperty("allow_cpm_external")
    public Boolean getAllowCpmExternal() {
        return allowCpmExternal;
    }

    @JsonProperty("allow_cpm_external")
    public void setAllowCpmExternal(Boolean allowCpmExternal) {
        this.allowCpmExternal = allowCpmExternal;
    }

    @JsonProperty("allow_cpa_managed")
    public Boolean getAllowCpaManaged() {
        return allowCpaManaged;
    }

    @JsonProperty("allow_cpa_managed")
    public void setAllowCpaManaged(Boolean allowCpaManaged) {
        this.allowCpaManaged = allowCpaManaged;
    }

    @JsonProperty("allow_cpa_external")
    public Boolean getAllowCpaExternal() {
        return allowCpaExternal;
    }

    @JsonProperty("allow_cpa_external")
    public void setAllowCpaExternal(Boolean allowCpaExternal) {
        this.allowCpaExternal = allowCpaExternal;
    }

    @JsonProperty("allow_cpc_managed")
    public Boolean getAllowCpcManaged() {
        return allowCpcManaged;
    }

    @JsonProperty("allow_cpc_managed")
    public void setAllowCpcManaged(Boolean allowCpcManaged) {
        this.allowCpcManaged = allowCpcManaged;
    }

    @JsonProperty("allow_cpc_external")
    public Boolean getAllowCpcExternal() {
        return allowCpcExternal;
    }

    @JsonProperty("allow_cpc_external")
    public void setAllowCpcExternal(Boolean allowCpcExternal) {
        this.allowCpcExternal = allowCpcExternal;
    }

    @JsonProperty("managed_cpc_bias_pct")
    public Integer getManagedCpcBiasPct() {
        return managedCpcBiasPct;
    }

    @JsonProperty("managed_cpc_bias_pct")
    public void setManagedCpcBiasPct(Integer managedCpcBiasPct) {
        this.managedCpcBiasPct = managedCpcBiasPct;
    }

    @JsonProperty("managed_cpa_bias_pct")
    public Integer getManagedCpaBiasPct() {
        return managedCpaBiasPct;
    }

    @JsonProperty("managed_cpa_bias_pct")
    public void setManagedCpaBiasPct(Integer managedCpaBiasPct) {
        this.managedCpaBiasPct = managedCpaBiasPct;
    }

    @JsonProperty("external_cpc_bias_pct")
    public Integer getExternalCpcBiasPct() {
        return externalCpcBiasPct;
    }

    @JsonProperty("external_cpc_bias_pct")
    public void setExternalCpcBiasPct(Integer externalCpcBiasPct) {
        this.externalCpcBiasPct = externalCpcBiasPct;
    }

    @JsonProperty("external_cpa_bias_pct")
    public Integer getExternalCpaBiasPct() {
        return externalCpaBiasPct;
    }

    @JsonProperty("external_cpa_bias_pct")
    public void setExternalCpaBiasPct(Integer externalCpaBiasPct) {
        this.externalCpaBiasPct = externalCpaBiasPct;
    }

    @JsonProperty("is_oo")
    public Boolean getIsOo() {
        return isOo;
    }

    @JsonProperty("is_oo")
    public void setIsOo(Boolean isOo) {
        this.isOo = isOo;
    }

    @JsonProperty("base_payment_rule_id")
    public Integer getBasePaymentRuleId() {
        return basePaymentRuleId;
    }

    @JsonProperty("base_payment_rule_id")
    public void setBasePaymentRuleId(Integer basePaymentRuleId) {
        this.basePaymentRuleId = basePaymentRuleId;
    }

    @JsonProperty("base_ad_quality_rule_id")
    public Integer getBaseAdQualityRuleId() {
        return baseAdQualityRuleId;
    }

    @JsonProperty("base_ad_quality_rule_id")
    public void setBaseAdQualityRuleId(Integer baseAdQualityRuleId) {
        this.baseAdQualityRuleId = baseAdQualityRuleId;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("visibility_profile_id")
    public Integer getVisibilityProfileId() {
        return visibilityProfileId;
    }

    @JsonProperty("visibility_profile_id")
    public void setVisibilityProfileId(Integer visibilityProfileId) {
        this.visibilityProfileId = visibilityProfileId;
    }

    @JsonProperty("cpm_reselling_disabled")
    public Boolean getCpmResellingDisabled() {
        return cpmResellingDisabled;
    }

    @JsonProperty("cpm_reselling_disabled")
    public void setCpmResellingDisabled(Boolean cpmResellingDisabled) {
        this.cpmResellingDisabled = cpmResellingDisabled;
    }

    @JsonProperty("cpc_reselling_disabled")
    public Boolean getCpcResellingDisabled() {
        return cpcResellingDisabled;
    }

    @JsonProperty("cpc_reselling_disabled")
    public void setCpcResellingDisabled(Boolean cpcResellingDisabled) {
        this.cpcResellingDisabled = cpcResellingDisabled;
    }

    @JsonProperty("platform_ops_notes")
    public String getPlatformOpsNotes() {
        return platformOpsNotes;
    }

    @JsonProperty("platform_ops_notes")
    public void setPlatformOpsNotes(String platformOpsNotes) {
        this.platformOpsNotes = platformOpsNotes;
    }

    @JsonProperty("pitbull_segment_id")
    public Integer getPitbullSegmentId() {
        return pitbullSegmentId;
    }

    @JsonProperty("pitbull_segment_id")
    public void setPitbullSegmentId(Integer pitbullSegmentId) {
        this.pitbullSegmentId = pitbullSegmentId;
    }

    @JsonProperty("pitbull_segment_value")
    public Integer getPitbullSegmentValue() {
        return pitbullSegmentValue;
    }

    @JsonProperty("pitbull_segment_value")
    public void setPitbullSegmentValue(Integer pitbullSegmentValue) {
        this.pitbullSegmentValue = pitbullSegmentValue;
    }

    @JsonProperty("enable_cookie_tracking_default")
    public Boolean getEnableCookieTrackingDefault() {
        return enableCookieTrackingDefault;
    }

    @JsonProperty("enable_cookie_tracking_default")
    public void setEnableCookieTrackingDefault(Boolean enableCookieTrackingDefault) {
        this.enableCookieTrackingDefault = enableCookieTrackingDefault;
    }

    @JsonProperty("seller_page_cap_enabled")
    public Boolean getSellerPageCapEnabled() {
        return sellerPageCapEnabled;
    }

    @JsonProperty("seller_page_cap_enabled")
    public void setSellerPageCapEnabled(Boolean sellerPageCapEnabled) {
        this.sellerPageCapEnabled = sellerPageCapEnabled;
    }

    @JsonProperty("inventory_source_name")
    public String getInventorySourceName() {
        return inventorySourceName;
    }

    @JsonProperty("inventory_source_name")
    public void setInventorySourceName(String inventorySourceName) {
        this.inventorySourceName = inventorySourceName;
    }

    @JsonProperty("billing_internal_user")
    public Integer getBillingInternalUser() {
        return billingInternalUser;
    }

    @JsonProperty("billing_internal_user")
    public void setBillingInternalUser(Integer billingInternalUser) {
        this.billingInternalUser = billingInternalUser;
    }

   /* @JsonProperty("labels")
    public Object getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Object labels) {
        this.labels = labels;
    }*/

    @JsonProperty("placements")
    public List<Placement> getPlacements() {
        return placements;
    }

    @JsonProperty("placements")
    public void setPlacements(List<Placement> placements) {
        this.placements = placements;
    }

    /*@JsonProperty("external_inv_codes")
    public Object getExternalInvCodes() {
        return externalInvCodes;
    }

    @JsonProperty("external_inv_codes")
    public void setExternalInvCodes(Object externalInvCodes) {
        this.externalInvCodes = externalInvCodes;
    }

    @JsonProperty("contact_info")
    public Object getContactInfo() {
        return contactInfo;
    }

    @JsonProperty("contact_info")
    public void setContactInfo(Object contactInfo) {
        this.contactInfo = contactInfo;
    }

    @JsonProperty("publisher_brand_exceptions")
    public Object getPublisherBrandExceptions() {
        return publisherBrandExceptions;
    }

    @JsonProperty("publisher_brand_exceptions")
    public void setPublisherBrandExceptions(Object publisherBrandExceptions) {
        this.publisherBrandExceptions = publisherBrandExceptions;
    }

    @JsonProperty("contact")
    public Object getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Object contact) {
        this.contact = contact;
    }*/

}
