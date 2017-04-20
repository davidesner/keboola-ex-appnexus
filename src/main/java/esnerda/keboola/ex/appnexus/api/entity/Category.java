
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_sensitive")
    private Boolean isSensitive;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("requires_whitelist_on_external")
    private Boolean requiresWhitelistOnExternal;
    @JsonProperty("requires_whitelist_on_managed")
    private Boolean requiresWhitelistOnManaged;
    @JsonProperty("is_brand_eligible")
    private Boolean isBrandEligible;
    @JsonProperty("requires_whitelist")
    private Boolean requiresWhitelist;

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

    @JsonProperty("is_sensitive")
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    @JsonProperty("is_sensitive")
    public void setIsSensitive(Boolean isSensitive) {
        this.isSensitive = isSensitive;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("requires_whitelist_on_external")
    public Boolean getRequiresWhitelistOnExternal() {
        return requiresWhitelistOnExternal;
    }

    @JsonProperty("requires_whitelist_on_external")
    public void setRequiresWhitelistOnExternal(Boolean requiresWhitelistOnExternal) {
        this.requiresWhitelistOnExternal = requiresWhitelistOnExternal;
    }

    @JsonProperty("requires_whitelist_on_managed")
    public Boolean getRequiresWhitelistOnManaged() {
        return requiresWhitelistOnManaged;
    }

    @JsonProperty("requires_whitelist_on_managed")
    public void setRequiresWhitelistOnManaged(Boolean requiresWhitelistOnManaged) {
        this.requiresWhitelistOnManaged = requiresWhitelistOnManaged;
    }

    @JsonProperty("is_brand_eligible")
    public Boolean getIsBrandEligible() {
        return isBrandEligible;
    }

    @JsonProperty("is_brand_eligible")
    public void setIsBrandEligible(Boolean isBrandEligible) {
        this.isBrandEligible = isBrandEligible;
    }

    @JsonProperty("requires_whitelist")
    public Boolean getRequiresWhitelist() {
        return requiresWhitelist;
    }

    @JsonProperty("requires_whitelist")
    public void setRequiresWhitelist(Boolean requiresWhitelist) {
        this.requiresWhitelist = requiresWhitelist;
    }

}
