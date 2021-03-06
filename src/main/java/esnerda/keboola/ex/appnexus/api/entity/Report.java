
package esnerda.keboola.ex.appnexus.api.entity;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Report {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created_on")
    private String createdOn;
    @JsonProperty("cache_hit")
    private Boolean cacheHit;
    @JsonProperty("fact_cache_hit")
    private Boolean factCacheHit;
    @JsonProperty("fact_cache_error")
    private String factCacheError;
    @JsonProperty("json_request")
    private String jsonRequest;
    @JsonProperty("header_info")
    private String headerInfo;
    @JsonProperty("row_count")
    private Long rowCount;
    @JsonProperty("report_size")
    private Long reportSize;
    @JsonProperty("user_id")
    private Long userId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("file")
    private String file;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
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

    @JsonProperty("created_on")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("created_on")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("cache_hit")
    public Boolean getCacheHit() {
        return cacheHit;
    }

    @JsonProperty("cache_hit")
    public void setCacheHit(Boolean cacheHit) {
        this.cacheHit = cacheHit;
    }

    @JsonProperty("fact_cache_hit")
    public Boolean getFactCacheHit() {
        return factCacheHit;
    }

    @JsonProperty("fact_cache_hit")
    public void setFactCacheHit(Boolean factCacheHit) {
        this.factCacheHit = factCacheHit;
    }

    @JsonProperty("fact_cache_error")
    public String getFactCacheError() {
        return factCacheError;
    }

    @JsonProperty("fact_cache_error")
    public void setFactCacheError(String factCacheError) {
        this.factCacheError = factCacheError;
    }

    @JsonProperty("json_request")
    public String getJsonRequest() {
        return jsonRequest;
    }

    @JsonProperty("json_request")
    public void setJsonRequest(String jsonRequest) {
        this.jsonRequest = jsonRequest;
    }

    @JsonProperty("header_info")
    public String getHeaderInfo() {
        return headerInfo;
    }

    @JsonProperty("header_info")
    public void setHeaderInfo(String headerInfo) {
        this.headerInfo = headerInfo;
    }

    @JsonProperty("row_count")
    public Long getRowCount() {
        return rowCount;
    }

    @JsonProperty("row_count")
    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    @JsonProperty("report_size")
    public Long getReportSize() {
        return reportSize;
    }

    @JsonProperty("report_size")
    public void setReportSize(Long reportSize) {
        this.reportSize = reportSize;
    }

    @JsonProperty("user_id")
    public Long getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(userId).append(url).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || this.id == null) {
			return false;
		}		
        if (!(obj instanceof Report)) {
            return false;
        }
        Report r = (Report) obj;
		return this.id.equals(r.getId());
	}

}
