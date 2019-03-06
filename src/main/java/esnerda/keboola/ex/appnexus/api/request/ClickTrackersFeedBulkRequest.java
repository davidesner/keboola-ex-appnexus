package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author David Esner
 */
public class ClickTrackersFeedBulkRequest extends ReportRequest {

	public ClickTrackersFeedBulkRequest() {
	}

	public ClickTrackersFeedBulkRequest(LocalDateTime startDate, LocalDateTime endDate,
			List<String> columns, HashMap<String, String> params) {
		super(startDate, endDate, columns, params);
	}

	private static final String REPORT_TYPE = "clicktrackers";

	public static final String[] COLUMNS = new String[] { "hour", "day", "month", "datetime",
			"advertiser_id", "auction_id", "line_item_id", "insertion_order_id", "member_id",
			"pricing_type", "publisher_id", "site_domain", "tag_id", "tracker_id", "user_id" };

	public static final String[] METRIC_COLUMNS = new String[] { "commission_cpm",
			"commission_revshare", "media_buy_cost", "media_buy_rev_share_pct", "revenue_value" };

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
