
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Label {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("member_id")
    private Long memberId;
    @JsonProperty("is_user_associated")
    private Boolean isUserAssociated;
    @JsonProperty("is_reporting_enabled")
    private Boolean isReportingEnabled;
    @JsonProperty("object_type")
    private String objectType;
    @JsonProperty("report_field")
    private String reportField;
    @JsonProperty("last_modified")
    private String lastModified;

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

    @JsonProperty("member_id")
    public Long getMemberId() {
        return memberId;
    }

    @JsonProperty("member_id")
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("is_user_associated")
    public Boolean getIsUserAssociated() {
        return isUserAssociated;
    }

    @JsonProperty("is_user_associated")
    public void setIsUserAssociated(Boolean isUserAssociated) {
        this.isUserAssociated = isUserAssociated;
    }

    @JsonProperty("is_reporting_enabled")
    public Boolean getIsReportingEnabled() {
        return isReportingEnabled;
    }

    @JsonProperty("is_reporting_enabled")
    public void setIsReportingEnabled(Boolean isReportingEnabled) {
        this.isReportingEnabled = isReportingEnabled;
    }

    @JsonProperty("object_type")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("object_type")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("report_field")
    public String getReportField() {
        return reportField;
    }

    @JsonProperty("report_field")
    public void setReportField(String reportField) {
        this.reportField = reportField;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

}
