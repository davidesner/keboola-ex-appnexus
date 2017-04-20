
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Brand {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("created_on")
    private String createdOn;
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("company_id")
    private Integer companyId;
    @JsonProperty("is_premium")
    private Boolean isPremium;
    @JsonProperty("facebook_pixel_allowed")
    private Boolean facebookPixelAllowed;
    @JsonProperty("integration_domain")
    private String integrationDomain;
    @JsonProperty("urls")
    private List<String> urls = null;
    @JsonProperty("num_creatives")
    private Integer numCreatives;

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

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("created_on")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("created_on")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("company_id")
    public Integer getCompanyId() {
        return companyId;
    }

    @JsonProperty("company_id")
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("is_premium")
    public Boolean getIsPremium() {
        return isPremium;
    }

    @JsonProperty("is_premium")
    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    @JsonProperty("facebook_pixel_allowed")
    public Boolean getFacebookPixelAllowed() {
        return facebookPixelAllowed;
    }

    @JsonProperty("facebook_pixel_allowed")
    public void setFacebookPixelAllowed(Boolean facebookPixelAllowed) {
        this.facebookPixelAllowed = facebookPixelAllowed;
    }

    @JsonProperty("integration_domain")
    public String getIntegrationDomain() {
        return integrationDomain;
    }

    @JsonProperty("integration_domain")
    public void setIntegrationDomain(String integrationDomain) {
        this.integrationDomain = integrationDomain;
    }

    
    public String getUrls() {
    	if (urls == null) {
    		return "";
    	}
        return String.join(";", urls);
    }

    @JsonProperty("urls")
    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    @JsonProperty("num_creatives")
    public Integer getNumCreatives() {
        return numCreatives;
    }

    @JsonProperty("num_creatives")
    public void setNumCreatives(Integer numCreatives) {
        this.numCreatives = numCreatives;
    }

}
