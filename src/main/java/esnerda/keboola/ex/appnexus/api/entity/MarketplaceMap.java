
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarketplaceMap {

    @JsonProperty("performance")
    private Boolean performance;
    @JsonProperty("rtb")
    private Boolean rtb;
    @JsonProperty("an_audit_perf_only")
    private Boolean anAuditPerfOnly;
    @JsonProperty("rtb_suspended")
    private Boolean rtbSuspended;
    @JsonProperty("deals_allowed")
    private Boolean dealsAllowed;
    @JsonProperty("deals_suspended")
    private Boolean dealsSuspended;

    @JsonProperty("performance")
    public Boolean getPerformance() {
        return performance;
    }

    @JsonProperty("performance")
    public void setPerformance(Boolean performance) {
        this.performance = performance;
    }

    @JsonProperty("rtb")
    public Boolean getRtb() {
        return rtb;
    }

    @JsonProperty("rtb")
    public void setRtb(Boolean rtb) {
        this.rtb = rtb;
    }

    @JsonProperty("an_audit_perf_only")
    public Boolean getAnAuditPerfOnly() {
        return anAuditPerfOnly;
    }

    @JsonProperty("an_audit_perf_only")
    public void setAnAuditPerfOnly(Boolean anAuditPerfOnly) {
        this.anAuditPerfOnly = anAuditPerfOnly;
    }

    @JsonProperty("rtb_suspended")
    public Boolean getRtbSuspended() {
        return rtbSuspended;
    }

    @JsonProperty("rtb_suspended")
    public void setRtbSuspended(Boolean rtbSuspended) {
        this.rtbSuspended = rtbSuspended;
    }

    @JsonProperty("deals_allowed")
    public Boolean getDealsAllowed() {
        return dealsAllowed;
    }

    @JsonProperty("deals_allowed")
    public void setDealsAllowed(Boolean dealsAllowed) {
        this.dealsAllowed = dealsAllowed;
    }

    @JsonProperty("deals_suspended")
    public Boolean getDealsSuspended() {
        return dealsSuspended;
    }

    @JsonProperty("deals_suspended")
    public void setDealsSuspended(Boolean dealsSuspended) {
        this.dealsSuspended = dealsSuspended;
    }

}
