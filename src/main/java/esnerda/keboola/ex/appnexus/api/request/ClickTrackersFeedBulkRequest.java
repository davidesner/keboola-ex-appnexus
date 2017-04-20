package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * @author David Esner
 */
public class ClickTrackersFeedBulkRequest extends ReportRequest {

	public ClickTrackersFeedBulkRequest() {
	}

	public ClickTrackersFeedBulkRequest(LocalDateTime startDate, LocalDateTime endDate, List<String> columns) {
		super(startDate, endDate, columns);
	}

	private static final String REPORT_TYPE = "clicktrackers_feed";

	public static final String[] COLUMNS = new String[] { "hour", "day", "month", "datetime", "advertiser_id", "auction_id", "line_item_id",
			"insertion_order_id", "member_id", "pricing_type", "publisher_id", "site_domain",
			"tag_id", "tracker_id", "user_id" };

	@Override
	public String getReportType() {
		return REPORT_TYPE;
	}

	@Override
	public List<String> getAllSupportedColumns() {
		return Arrays.asList(COLUMNS);
	}

}
