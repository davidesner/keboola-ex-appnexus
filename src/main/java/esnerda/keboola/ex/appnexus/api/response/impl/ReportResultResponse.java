
package esnerda.keboola.ex.appnexus.api.response.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.entity.Report;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportResultResponse extends ApiResponse {
	@JsonIgnore
	private static final String STATUS_READY = "ready";

    @JsonProperty("report")
    private Report report;
    @JsonProperty("execution_status")
    private String executionStatus;

    @JsonProperty("report")
    public Report getReport() {
        return report;
    }

    @JsonProperty("report")
    public void setReport(Report report) {
        this.report = report;
    }

    @JsonProperty("execution_status")
    public String getExecutionStatus() {
        return executionStatus;
    }

    @JsonProperty("execution_status")
    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    @JsonIgnore
    public boolean isFinished() {
    	return STATUS_READY.equals(executionStatus);
    }

}
