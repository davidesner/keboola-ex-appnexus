package esnerda.keboola.ex.appnexus.api.response.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

/**
 * @author David Esner
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportJobResponse extends ApiResponse{
	

	@JsonProperty("report_id")
	private String reportId;

	public ReportJobResponse() {
		super();
	}	

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	
	

}
