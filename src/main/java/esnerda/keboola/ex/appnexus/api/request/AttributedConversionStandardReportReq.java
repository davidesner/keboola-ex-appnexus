package esnerda.keboola.ex.appnexus.api.request;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author David Esner
 */
public class AttributedConversionStandardReportReq extends ReportRequest {

	public AttributedConversionStandardReportReq() {
	}

	public AttributedConversionStandardReportReq(String advertiserId) {
		super();
		this.setParams(new HashMap<String, String>() {
			{
				put("advertiser_id", advertiserId);
			}
		});
	}

	public AttributedConversionStandardReportReq(HashMap<String, String> advertiserId) {
		super();
		this.setParams(advertiserId);
	}

	public AttributedConversionStandardReportReq(LocalDateTime startDate, LocalDateTime endDate,
			List<String> columns, HashMap<String, String> params) {
		super(startDate, endDate, columns, params);
	}

	private static final String REPORT_TYPE = "attributed_conversions";

	public static final String[] COLUMNS = new String[] { "month", "day", "hour", "datetime",
			"pixel_id", "pixel_name", "order_id", "external_data", "post_click_or_post_view_conv",
			"line_item_id", "line_item_name", "creative_id", "creative_name", "campaign_id",
			"campaign_name", "imp_time", "imp_type_id", "imp_type", "advertiser_id",
			"advertiser_name", "buyer_member_id", "auction_id" };

	public static final String[] METRIC_COLUMNS = new String[] {
			"post_click_or_post_view_revenue" };

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
		return false;
	}

}
