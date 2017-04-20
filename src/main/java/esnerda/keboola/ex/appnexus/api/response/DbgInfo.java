package esnerda.keboola.ex.appnexus.api.response;




import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DbgInfo {

    @JsonProperty("instance")
    private String instance;
    @JsonProperty("slave_hit")
    private Boolean slaveHit;
    @JsonProperty("db")
    private String db;
    @JsonProperty("user::reads")
    private Integer userReads;
    @JsonProperty("user::read_limit")
    private Integer userReadLimit;
    @JsonProperty("user::read_limit_seconds")
    private Integer userReadLimitSeconds;
    @JsonProperty("user::writes")
    private Integer userWrites;
    @JsonProperty("user::write_limit")
    private Integer userWriteLimit;
    @JsonProperty("user::write_limit_seconds")
    private Integer userWriteLimitSeconds;
    @JsonProperty("reads")
    private Integer reads;
    @JsonProperty("read_limit")
    private Integer readLimit;
    @JsonProperty("read_limit_seconds")
    private Integer readLimitSeconds;
    @JsonProperty("writes")
    private Integer writes;
    @JsonProperty("write_limit")
    private Integer writeLimit;
    @JsonProperty("write_limit_seconds")
    private Integer writeLimitSeconds;
    @JsonProperty("awesomesauce_cache_used")
    private Boolean awesomesauceCacheUsed;
    @JsonProperty("count_cache_used")
    private Boolean countCacheUsed;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("warnings")
    private List<Object> warnings = null;
    @JsonProperty("time")
    private Double time;
    @JsonProperty("start_microtime")
    private Double startMicrotime;
    @JsonProperty("version")
    private String version;
    @JsonProperty("slave_miss")
    private String slaveMiss;
    @JsonProperty("slave_lag")
    private Integer slaveLag;
    @JsonProperty("member_last_modified_age")
    private Integer memberLastModifiedAge;
    @JsonProperty("output_term")
    private String outputTerm;

    @JsonProperty("instance")
    public String getInstance() {
        return instance;
    }

    @JsonProperty("instance")
    public void setInstance(String instance) {
        this.instance = instance;
    }

    @JsonProperty("slave_hit")
    public Boolean getSlaveHit() {
        return slaveHit;
    }

    @JsonProperty("slave_hit")
    public void setSlaveHit(Boolean slaveHit) {
        this.slaveHit = slaveHit;
    }

    @JsonProperty("db")
    public String getDb() {
        return db;
    }

    @JsonProperty("db")
    public void setDb(String db) {
        this.db = db;
    }

    @JsonProperty("user::reads")
    public Integer getUserReads() {
        return userReads;
    }

    @JsonProperty("user::reads")
    public void setUserReads(Integer userReads) {
        this.userReads = userReads;
    }

    @JsonProperty("user::read_limit")
    public Integer getUserReadLimit() {
        return userReadLimit;
    }

    @JsonProperty("user::read_limit")
    public void setUserReadLimit(Integer userReadLimit) {
        this.userReadLimit = userReadLimit;
    }

    @JsonProperty("user::read_limit_seconds")
    public Integer getUserReadLimitSeconds() {
        return userReadLimitSeconds;
    }

    @JsonProperty("user::read_limit_seconds")
    public void setUserReadLimitSeconds(Integer userReadLimitSeconds) {
        this.userReadLimitSeconds = userReadLimitSeconds;
    }

    @JsonProperty("user::writes")
    public Integer getUserWrites() {
        return userWrites;
    }

    @JsonProperty("user::writes")
    public void setUserWrites(Integer userWrites) {
        this.userWrites = userWrites;
    }

    @JsonProperty("user::write_limit")
    public Integer getUserWriteLimit() {
        return userWriteLimit;
    }

    @JsonProperty("user::write_limit")
    public void setUserWriteLimit(Integer userWriteLimit) {
        this.userWriteLimit = userWriteLimit;
    }

    @JsonProperty("user::write_limit_seconds")
    public Integer getUserWriteLimitSeconds() {
        return userWriteLimitSeconds;
    }

    @JsonProperty("user::write_limit_seconds")
    public void setUserWriteLimitSeconds(Integer userWriteLimitSeconds) {
        this.userWriteLimitSeconds = userWriteLimitSeconds;
    }

    @JsonProperty("reads")
    public Integer getReads() {
        return reads;
    }

    @JsonProperty("reads")
    public void setReads(Integer reads) {
        this.reads = reads;
    }

    @JsonProperty("read_limit")
    public Integer getReadLimit() {
        return readLimit;
    }

    @JsonProperty("read_limit")
    public void setReadLimit(Integer readLimit) {
        this.readLimit = readLimit;
    }

    @JsonProperty("read_limit_seconds")
    public Integer getReadLimitSeconds() {
        return readLimitSeconds;
    }

    @JsonProperty("read_limit_seconds")
    public void setReadLimitSeconds(Integer readLimitSeconds) {
        this.readLimitSeconds = readLimitSeconds;
    }

    @JsonProperty("writes")
    public Integer getWrites() {
        return writes;
    }

    @JsonProperty("writes")
    public void setWrites(Integer writes) {
        this.writes = writes;
    }

    @JsonProperty("write_limit")
    public Integer getWriteLimit() {
        return writeLimit;
    }

    @JsonProperty("write_limit")
    public void setWriteLimit(Integer writeLimit) {
        this.writeLimit = writeLimit;
    }

    @JsonProperty("write_limit_seconds")
    public Integer getWriteLimitSeconds() {
        return writeLimitSeconds;
    }

    @JsonProperty("write_limit_seconds")
    public void setWriteLimitSeconds(Integer writeLimitSeconds) {
        this.writeLimitSeconds = writeLimitSeconds;
    }

    @JsonProperty("awesomesauce_cache_used")
    public Boolean getAwesomesauceCacheUsed() {
        return awesomesauceCacheUsed;
    }

    @JsonProperty("awesomesauce_cache_used")
    public void setAwesomesauceCacheUsed(Boolean awesomesauceCacheUsed) {
        this.awesomesauceCacheUsed = awesomesauceCacheUsed;
    }

    @JsonProperty("count_cache_used")
    public Boolean getCountCacheUsed() {
        return countCacheUsed;
    }

    @JsonProperty("count_cache_used")
    public void setCountCacheUsed(Boolean countCacheUsed) {
        this.countCacheUsed = countCacheUsed;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("warnings")
    public List<Object> getWarnings() {
        return warnings;
    }

    @JsonProperty("warnings")
    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    @JsonProperty("time")
    public Double getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Double time) {
        this.time = time;
    }

    @JsonProperty("start_microtime")
    public Double getStartMicrotime() {
        return startMicrotime;
    }

    @JsonProperty("start_microtime")
    public void setStartMicrotime(Double startMicrotime) {
        this.startMicrotime = startMicrotime;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("slave_miss")
    public String getSlaveMiss() {
        return slaveMiss;
    }

    @JsonProperty("slave_miss")
    public void setSlaveMiss(String slaveMiss) {
        this.slaveMiss = slaveMiss;
    }

    @JsonProperty("slave_lag")
    public Integer getSlaveLag() {
        return slaveLag;
    }

    @JsonProperty("slave_lag")
    public void setSlaveLag(Integer slaveLag) {
        this.slaveLag = slaveLag;
    }

    @JsonProperty("member_last_modified_age")
    public Integer getMemberLastModifiedAge() {
        return memberLastModifiedAge;
    }

    @JsonProperty("member_last_modified_age")
    public void setMemberLastModifiedAge(Integer memberLastModifiedAge) {
        this.memberLastModifiedAge = memberLastModifiedAge;
    }

    @JsonProperty("output_term")
    public String getOutputTerm() {
        return outputTerm;
    }

    @JsonProperty("output_term")
    public void setOutputTerm(String outputTerm) {
        this.outputTerm = outputTerm;
    }

}
