package esnerda.keboola.ex.appnexus.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.components.configuration.IKBCParameters;
import esnerda.keboola.components.configuration.ValidationException;

/**
 * @author David Esner
 */
public class AppNexusProperties extends IKBCParameters {
	private final static String[] REQUIRED_FIELDS = { "userName", "password", "endpointUrl","reportDaysBack"};
	private final Map<String, Object> parametersMap;

	/* auth */
	@JsonProperty("userName")
	private String userName;

	@JsonProperty("#password")
	private String password;

	@JsonProperty("endpointUrl")
	private String endpointUrl;

	/* custom params */
	@JsonProperty("networkAnalyticsPars")
	private ReportPars networkAnalyticsPars;
	@JsonProperty("clickTrackersPars")
	private ReportPars clickTrackersPars;
	/* Standard Report params*/
	@JsonProperty("networkAnalyticsStandardPars")
	private ReportPars networkAnalyticsStandardPars;
	
	@JsonProperty("attributedConversionsStandardPars")
	private AtrributedConversionReportPars attributedConversionsStandardPars;

	@JsonProperty("incremental")
	private Boolean incremental;

	@JsonProperty("since")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate since;

	@JsonProperty("reportDaysBack")
	private Long reportDaysBack;

	@JsonProperty("datasets")
	private List<String> datasets;

	@JsonProperty("sinceLast")
	private Boolean sinceLast;

	@JsonProperty("debug")
	private Boolean debug;

	@JsonCreator
	public AppNexusProperties(@JsonProperty("userName") String userName, @JsonProperty("#password") String password,
			@JsonProperty("endpointUrl") String endpointUrl,
			@JsonProperty("networkAnalyticsPars") ReportPars networkAnalyticsPars,
			@JsonProperty("clickTrackersPars") ReportPars clickTrackersPars,
			@JsonProperty("incremental") Boolean incremental, @JsonProperty("since") LocalDate since,
			@JsonProperty("datasets") List<String> datasets, @JsonProperty("debug") Boolean debug,
			@JsonProperty("networkAnalyticsStandardPars") ReportPars networkAnalyticsStandardPars,
			@JsonProperty("attributedConversionsStandardPars") AtrributedConversionReportPars attributedConversionsStandardPars,
			@JsonProperty("reportDaysBack") Long reportDaysBack,
			@JsonProperty("sinceLast") Boolean sinceLast) {

		this.debug = Optional.ofNullable(debug).orElse(false);
		this.userName = userName;
		this.password = password;
		this.endpointUrl = endpointUrl;
		this.networkAnalyticsPars = networkAnalyticsPars;
		this.clickTrackersPars = clickTrackersPars;
		this.networkAnalyticsStandardPars = networkAnalyticsStandardPars;
		this.attributedConversionsStandardPars = attributedConversionsStandardPars;
		this.incremental = Optional.ofNullable(incremental).orElse(true);
		this.since = since;
		this.datasets = datasets;
		this.reportDaysBack = reportDaysBack;
		this.sinceLast = Optional.ofNullable(sinceLast).orElse(true);

		// set param map
		parametersMap = new HashMap<>();
		parametersMap.put("userName", userName);
		parametersMap.put("password", password);
		parametersMap.put("endpointUrl", endpointUrl);
		parametersMap.put("reportDaysBack", reportDaysBack);
	}

	@Override
	protected String[] getRequiredFields() {
		return REQUIRED_FIELDS;
	}

	@Override
	protected boolean validateParametres() throws ValidationException {
		// validate date format
		String error = "";

		error += this.missingFieldsMessage(parametersMap);
		error += validateDatasetList();

		if (error.equals("")) {
			return true;
		} else {
			throw new ValidationException("Invalid configuration parameters!", "Config validation error: " + error,
					null);
		}
	}

	private String validateDatasetList() throws ValidationException {
		List<String> invalidCols = new ArrayList();
		if (this.datasets != null) {
			for (String colName : this.datasets) {
				if (!Dataset.isValid(colName)) {
					invalidCols.add(colName);
				}
			}
		}
		if (!invalidCols.isEmpty()) {
			return "Some datasets are not supported: " + invalidCols.toString();
		}
		return "";
	}

	public static enum Dataset {
		Advertiser, Brand, Campaign, Category, Creative, InsertionOrder, Label, LineItem, MediaType, Placement, Publisher, Segment, Site;

		public static boolean isValid(String test) {
			for (Dataset c : Dataset.values()) {
				if (c.name().equals(test)) {
					return true;
				}
			}
			return false;
		}
	}

	public ReportPars getClickTrackersPars() {
		return clickTrackersPars;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEndpointUrl() {
		return endpointUrl;
	}

	public ReportPars getNetworkAnalyticsPars() {
		return networkAnalyticsPars;
	}

	public Boolean getIncremental() {
		return incremental;
	}

	public LocalDate getSince() {
		return since;
	}

	public List<String> getDatasets() {
		return datasets;
	}

	public Boolean getDebug() {
		return debug;
	}

	public ReportPars getNetworkAnalyticsStandardPars() {
		return networkAnalyticsStandardPars;
	}

	public Long getReportDaysBack() {
		return reportDaysBack;
	}

	public Boolean getSinceLast() {
		return sinceLast;
	}

	public AtrributedConversionReportPars getAttributedConversionsStandardPars() {
		return attributedConversionsStandardPars;
	}


	

}
