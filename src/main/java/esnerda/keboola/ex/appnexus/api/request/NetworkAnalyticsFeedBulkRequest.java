package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @author David Esner
 */
public class NetworkAnalyticsFeedBulkRequest extends ReportRequest {


	public NetworkAnalyticsFeedBulkRequest() {
	}

	public NetworkAnalyticsFeedBulkRequest(LocalDateTime startDate, LocalDateTime endDate, List<String> columns) {
		super(startDate, endDate, columns);
	}

	private static final String REPORT_TYPE = "network_analytics_feed";

	public static final String[] COLUMNS = new String[] {  "hour", "day", "month", "adjustment_id",
			"advertiser_id", "advertiser_code", "advertiser_currency", "bid_type", "buyer_member_id", "buyer_type",
			"campaign_id", "creative_id", "creative_frequency_bucket", "creative_recency_bucket", "deal_id",
			"entity_member_id", "external_inv_id", "geo_country", "height", "imp_type", "insertion_order_id",
			"insertion_order_code", "line_item_id", "line_item_code", "media_type", "media_type_id", "media_subtype",
			"media_subtype_id", "pixel_id", "placement_id", "placement_code", "publisher_id", "publisher_code",
			"publisher_currency", "pub_rule_id", "pub_rule_code", "seller_member_id", "seller_type", "site_id",
			"site_code", "size", "width", "revenue_type", "payment_type" };

	public static final String[] METRIC_COLUMNS = new String[] { "booked_revenue", "booked_revenue_adv_curr", "clicks",
			"commissions", "imps", "imps_viewed", "media_cost", "media_cost_pub_curr", "network_advertiser_rpm",
			"network_advertiser_rpm_adv_curr", "network_resold_rpm", "post_click_convs", "post_click_revenue",
			"post_view_convs", "post_view_revenue", "ppm", "profit", "publisher_rpm_publisher_currency",
			"reseller_revenue", "revenue", "revenue_adv_curr", "rpm_adv_curr", "serving_fees", "total_convs",
			"total_network_rpm", "total_publisher_rpm", "view_measured_imps", "view_measurement_rate", "view_rate" };
	

	

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

	@Override
	public boolean isBulk() {
		return true;
	}

}
