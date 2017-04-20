
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IosSslAudit {

    @JsonProperty("audit_status")
    private String auditStatus;
    @JsonProperty("audit_feedback")
    private String auditFeedback;

    @JsonProperty("audit_status")
    public String getAuditStatus() {
        return auditStatus;
    }

    @JsonProperty("audit_status")
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @JsonProperty("audit_feedback")
    public String getAuditFeedback() {
        return auditFeedback;
    }

    @JsonProperty("audit_feedback")
    public void setAuditFeedback(String auditFeedback) {
        this.auditFeedback = auditFeedback;
    }

}
