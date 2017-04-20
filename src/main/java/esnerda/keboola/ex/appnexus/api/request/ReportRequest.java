package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author David Esner
 */
@JsonInclude(Include.NON_NULL)
public abstract class ReportRequest {

	@JsonIgnore
	private static final String DATE_PATTERN = "yyyy-MM-dd HH:MM:ss";

	@JsonProperty("report_type")
	private String reportType;
	@JsonProperty("columns")
	private List<String> columns = null;
	@JsonProperty("row_per")
	private List<String> rowPer = null;
	@JsonProperty("start_date")
	private LocalDateTime startDate;
	@JsonProperty("end_date")
	private LocalDateTime endDate;
	@JsonIgnore
	private static final String DEFAULT_FORMAT ="csv";
	
	

	public ReportRequest() {
	}

	public ReportRequest(LocalDateTime startDate, LocalDateTime endDate, List<String> columns) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.columns = columns;
	}

	@JsonProperty("report_type")
	public abstract String getReportType();

	@JsonIgnore
	public abstract List<String> getAllSupportedColumns();

	@JsonProperty("columns")
	public List<String> getColumns() {
		return this.columns;
	}
	
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	@JsonProperty("start_date")	
	public String getStartDate() {
		return getLocalDateTimeString(startDate);
	}

	@JsonProperty("start_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:MM:ss")
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("end_date")
	public String getEndDate() {
		return getLocalDateTimeString(endDate);
	}

	@JsonProperty("end_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:MM:ss")
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("format")
	public String getFormat() {
		return DEFAULT_FORMAT;
	}
	@JsonIgnore
	private String getLocalDateTimeString(LocalDateTime date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
		return formatter.format(date);
	}


}
