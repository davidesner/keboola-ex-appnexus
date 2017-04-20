
package esnerda.keboola.ex.appnexus.api.response;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ApiResponse {

	private static final String KEY_OK = "OK";

	@JsonProperty("error_id")
	private String errorId;
	@JsonProperty("error")
	private String error;
	@JsonProperty("status")
	private String status;
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("start_element")
	private Integer startElement;
	@JsonProperty("num_elements")
	private Integer numElements;
	@JsonProperty("dbg_info")
	private DbgInfo dbgInfo;


	@JsonProperty("error_id")
	public String getErrorId() {
		return errorId;
	}

	@JsonProperty("error_id")
	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	@JsonProperty("error")
	public String getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(String error) {
		this.error = error;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@JsonProperty("start_element")
	public Integer getStartElement() {
		return startElement;
	}

	@JsonProperty("start_element")
	public void setStartElement(Integer startElement) {
		this.startElement = startElement;
	}

	@JsonProperty("num_elements")
	public Integer getNumElements() {
		return numElements;
	}

	@JsonProperty("num_elements")
	public void setNumElements(Integer numElements) {
		this.numElements = numElements;
	}

	@JsonProperty("dbg_info")
	public DbgInfo getDbgInfo() {
		return dbgInfo;
	}

	@JsonProperty("dbg_info")
	public void setDbgInfo(DbgInfo dbgInfo) {
		this.dbgInfo = dbgInfo;
	}


	/* -- Helper methods -- */
	@JsonIgnore
	public boolean isSuccess() {
		return KEY_OK.equals(status) && StringUtils.isBlank(errorId);
	}
}
