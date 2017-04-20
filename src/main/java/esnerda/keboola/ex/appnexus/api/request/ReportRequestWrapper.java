package esnerda.keboola.ex.appnexus.api.request;

/**
 * @author David Esner
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "report" })
public class ReportRequestWrapper<T extends ReportRequest> {

	
	public ReportRequestWrapper(T report) {
		super();
		this.report = report;
	}

	@JsonProperty("report")
	private T report;

	@JsonProperty("report")
	public T getReport() {
		return report;
	}

	@JsonProperty("report")
	public void setReport(T report) {
		this.report = report;
	}
}
