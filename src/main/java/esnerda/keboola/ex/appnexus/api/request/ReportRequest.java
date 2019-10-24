package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

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

	public static enum ReportInterval {
		current_hour, last_hour, today, yesterday, last_48_hours, last_7_days, last_30_days, month_to_date, month_to_yesterday, last_2_days, quarter_to_date, last_month, lifetime;

		public static boolean isValid(String test) {
			for (ReportInterval c : ReportInterval.values()) {
				if (c.name().equals(test)) {
					return true;
				}
			}
			return false;
		}
	}

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
	@JsonProperty("report_interval")
	private String reportInterval;
	@JsonIgnore
	private Map<String, String> params;
	@JsonIgnore
	private static final String DEFAULT_FORMAT = "csv";

	public ReportRequest() {
	}

	public ReportRequest(LocalDateTime startDate, LocalDateTime endDate, List<String> columns,
			Map<String, String> params) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.columns = columns;
		this.params = params;
	}

	public ReportRequest(String reportInterval, List<String> columns, Map<String, String> params) {
		super();
		this.reportInterval = reportInterval;
		this.columns = columns;
		this.params = params;
	}

	@JsonProperty("report_type")
	public abstract String getReportType();

	@JsonIgnore
	public abstract List<String> getAllSupportedMetricColumns();

	@JsonIgnore
	public abstract List<String> getAllSupportedColumns();

	@JsonIgnore
	public abstract boolean isBulk();

	@JsonProperty("columns")
	public List<String> getColumns() {
		return this.columns;
	}

	public void setColumns(List<String> columns) {
		this.columns = columns;
	}

	@JsonProperty("start_date")
	public String getStartDate() {
		if (this.startDate == null) {
			return null;
		}
		return getLocalDateTimeString(startDate);
	}

	@JsonProperty("start_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:MM:ss")
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("end_date")
	public String getEndDate() {
		if (this.endDate == null) {
			return null;
		}
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

	@JsonProperty("report_interval")
	public String getReportInterval() {
		return this.reportInterval;
	}

	@JsonIgnore
	private String getLocalDateTimeString(LocalDateTime date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
		return formatter.format(date);
	}

	@JsonIgnore
	public Map<String, String> getParams() {
		return params;
	}

	@JsonIgnore
	public Map<String, String> setParams(Map<String, String> params) {
		return this.params = params;
	}

}
