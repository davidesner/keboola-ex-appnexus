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
	public static final String[] COLUMNS = new String[] {  "hour", "day", "month", "advertiser_currency", "advertiser_id",
			"booked_revenue_adv_curr", "buyer_member_id", "clicks", "creative_id", "geo_country", "imps", "imp_type",
			"insertion_order_id", "line_item_id", "media_cost", "media_type", "pixel_id", "placement_id",
			"post_click_convs", "post_view_convs", "ppm", "profit", "publisher_currency", "publisher_id", "pub_rule_id",
			"seller_member_id", "seller_type", "site_id", "size", "total_convs", "total_network_rpm",
			"total_publisher_rpm" };

	

	@Override
	public String getReportType() {
		return REPORT_TYPE;
	}

	@Override
	public List<String> getAllSupportedColumns() {
		return Arrays.asList(COLUMNS);
	}

}
