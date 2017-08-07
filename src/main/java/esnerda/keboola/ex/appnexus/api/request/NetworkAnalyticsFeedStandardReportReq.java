package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @author David Esner
 */
public class NetworkAnalyticsFeedStandardReportReq extends ReportRequest {

	public NetworkAnalyticsFeedStandardReportReq() {
	}

	public NetworkAnalyticsFeedStandardReportReq(LocalDateTime startDate, LocalDateTime endDate, List<String> columns) {
		super(startDate, endDate, columns);
	}

	private static final String REPORT_TYPE = "network_analytics";

	public static final String[] COLUMNS = new String[] { "hour", "day", "month", "entity_member_id", "buyer_member_id",
			"buyer_member_name", "buyer_member", "seller_member_id", "seller_member_name", "seller_member",
			"advertiser_id", "advertiser_name", "advertiser", "advertiser_code", "advertiser_currency", "adjustment_id",
			"adjustment_day", "adjustment_hour", "publisher_id", "publisher_name", "publisher", "publisher_code",
			"pub_rule_id", "pub_rule_name", "pub_rule", "pub_rule_code", "publisher_currency", "site_id", "site_name",
			"site", "site_code", "pixel_id", "placement_id", "placement_name", "placement", "placement_code",
			"insertion_order_id", "insertion_order_name", "insertion_order", "insertion_order_code", "line_item_id",
			"line_item_name", "line_item", "line_item_code", "campaign_id", "campaign_name", "campaign",
			"campaign_code", "campaign_priority", "creative_id", "creative_name", "creative_code", "creative", "size",
			"brand_id", "brand_name", "brand", "billing_period_start_date", "billing_period_end_date", "geo_country",
			"geo_country_name", "inventory_class", "bid_type", "imp_type_id", "imp_type", "buyer_type", "seller_type",
			"revenue_type", "revenue_type_id", "supply_type", "payment_type", "deal_id", "deal_name", "deal",
			"deal_code", "media_type", "media_type_id", "media_subtype", "media_subtype_id",
			"salesperson_for_advertiser", "account_manager_for_advertiser", "advertiser_type",
			"salesperson_for_publisher", "account_manager_for_publisher", "trafficker_for_line_item",
			"salesrep_for_line_item", "user_group_for_campaign", "line_item_type", "insertion_order_type",
			"buying_currency", "selling_currency" };

	public static final String[] METRIC_COLUMNS = new String[] { "imps", "imp_requests", "imps_blank", "imps_psa",
			"imps_psa_error", "imps_default_error", "imps_default_bidder", "imps_kept", "imps_resold", "imps_rtb",
			"external_impression", "clicks", "click_thru_pct", "external_click", "cost", "cost_including_fees",
			"revenue", "revenue_including_fees", "booked_revenue", "booked_revenue_adv_curr", "reseller_revenue",
			"profit", "profit_including_fees", "commissions", "cpm", "cpm_including_fees", "post_click_convs",
			"post_click_revenue", "post_view_convs", "post_view_revenue", "total_convs", "convs_per_mm", "convs_rate",
			"ctr", "rpm", "rpm_including_fees", "total_network_rpm", "total_publisher_rpm", "sold_network_rpm",
			"sold_publisher_rpm", "media_cost_pub_curr", "ppm", "ppm_including_fees", "serving_fees", "imps_viewed",
			"view_measured_imps", "view_rate", "view_measurement_rate", "cpvm", "data_costs", "revenue_buying_currency",
			"revenue_selling_currency", "booked_revenue_buying_currency", "booked_revenue_selling_currency",
			"reseller_revenue_buying_currency", "reseller_revenue_selling_currency", "cost_buying_currency",
			"cost_selling_currency", "profit_buying_currency", "profit_selling_currency",
			"total_network_rpm_buying_currency", "total_network_rpm_selling_currency", "cpm_buying_currency",
			"cpm_selling_currency", "rpm_buying_currency", "rpm_selling_currency", "ppm_buying_currency",
			"ppm_selling_currency", "sold_network_rpm_buying_currency", "sold_network_rpm_selling_currency",
			"commissions_buying_currency", "commissions_selling_currency", "serving_fees_buying_currency",
			"serving_fees_selling_currency", "data_costs_buying_currency", "data_costs_selling_currency" };

	@Override
	public String getReportType() {
		return REPORT_TYPE;
	}

	@Override
	public List<String> getAllSupportedColumns() {
		return Arrays.asList(COLUMNS);
	}

	@Override
	public List<String> getAllSupportedMetricColumns() {
		return Arrays.asList(METRIC_COLUMNS);
	}

}
