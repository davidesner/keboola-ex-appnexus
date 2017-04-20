
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InsertionOrder {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("code")
	private String code;
	@JsonProperty("state")
	private String state;
	@JsonProperty("advertiser_id")
	private Integer advertiserId;
	@JsonProperty("member_id")
	private Integer memberId;
	@JsonProperty("start_date")
	private String startDate;
	@JsonProperty("end_date")
	private String endDate;
	@JsonProperty("last_modified")
	private String lastModified;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("comments")
	private String comments;
	@JsonProperty("billing_code")
	private String billingCode;
	/*
	 * @JsonProperty("line_items") private List<LineItem> lineItems = null;
	 */
	/*
	 * @JsonProperty("spend_protection_pixels") private Object
	 * spendProtectionPixels;
	 */
	@JsonProperty("labels")
	private List<Label> labels;
	/*
	 * @JsonProperty("broker_fees") private Object brokerFees;
	 */
	/*@JsonProperty("budget_intervals")
	private List<BudgetInterval> budgetIntervals = null;*/

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
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

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("advertiser_id")
	public Integer getAdvertiserId() {
		return advertiserId;
	}

	@JsonProperty("advertiser_id")
	public void setAdvertiserId(Integer advertiserId) {
		this.advertiserId = advertiserId;
	}

	@JsonProperty("member_id")
	public Integer getMemberId() {
		return memberId;
	}

	@JsonProperty("member_id")
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@JsonProperty("start_date")
	public String getStartDate() {
		return startDate;
	}

	@JsonProperty("start_date")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("end_date")
	public String getEndDate() {
		return endDate;
	}

	@JsonProperty("end_date")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("last_modified")
	public String getLastModified() {
		return lastModified;
	}

	@JsonProperty("last_modified")
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("billing_code")
	public String getBillingCode() {
		return billingCode;
	}

	@JsonProperty("billing_code")
	public void setBillingCode(String billingCode) {
		this.billingCode = billingCode;
	}

	/*
	 * in Line Item object @JsonProperty("line_items") public List<LineItem>
	 * getLineItems() { return lineItems; }
	 * 
	 * @JsonProperty("line_items") public void setLineItems(List<LineItem>
	 * lineItems) { this.lineItems = lineItems; }
	 */

	/*
	 * @JsonProperty("spend_protection_pixels") public Object
	 * getSpendProtectionPixels() { return spendProtectionPixels; }
	 * 
	 * @JsonProperty("spend_protection_pixels") public void
	 * setSpendProtectionPixels(Object spendProtectionPixels) {
	 * this.spendProtectionPixels = spendProtectionPixels; }
	 */

	@JsonProperty("labels")
	public List<Label> getLabels() {
		return labels;
	}

	@JsonProperty("labels")
	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	/*
	 * @JsonProperty("broker_fees") public Object getBrokerFees() { return
	 * brokerFees; }
	 * 
	 * @JsonProperty("broker_fees") public void setBrokerFees(Object brokerFees)
	 * { this.brokerFees = brokerFees; }
	 */
	/*@JsonProperty("budget_intervals")
	public List<BudgetInterval> getBudgetIntervals() {
		return budgetIntervals;
	}

	@JsonProperty("budget_intervals")
	public void setBudgetIntervals(List<BudgetInterval> budgetIntervals) {
		this.budgetIntervals = budgetIntervals;
	}*/

}
