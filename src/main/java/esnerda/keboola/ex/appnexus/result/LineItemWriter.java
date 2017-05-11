package esnerda.keboola.ex.appnexus.result;

import java.util.ArrayList;
import java.util.List;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.entity.Campaign;
import esnerda.keboola.ex.appnexus.api.entity.InsertionOrder;
import esnerda.keboola.ex.appnexus.api.entity.Label;
import esnerda.keboola.ex.appnexus.api.entity.LineItem;
import esnerda.keboola.ex.appnexus.result.wrapper.LineItemCampaign;
import esnerda.keboola.ex.appnexus.result.wrapper.LineItemInsertionOrder;
import esnerda.keboola.ex.appnexus.result.wrapper.LineItemLabel;

/**
 * @author David Esner
 */
public class LineItemWriter implements IResultWriter<LineItem> {

	private IResultWriter<LineItem> lineItemWriter;
	private IResultWriter<LineItemCampaign> lnCampaignWriter;
	private IResultWriter<LineItemInsertionOrder> lnInsertionorderWriter;
	private IResultWriter<LineItemLabel> lnLabelWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(lineItemWriter.closeAndRetrieveMetadata());
		results.addAll(lnCampaignWriter.closeAndRetrieveMetadata());
		results.addAll(lnInsertionorderWriter.closeAndRetrieveMetadata());
		results.addAll(lnLabelWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<LineItem> clazz) throws Exception {
		// init category writer
		lineItemWriter = new DefaultBeanResultWriter<LineItem>("lineItem.csv", new String[] { "id" });
		lineItemWriter.initWriter(path, LineItem.class);
		// init subcat writer
		lnCampaignWriter = new DefaultBeanResultWriter<LineItemCampaign>("lineItemCampaigns.csv",
				new String[] { "lineItemId", "campaignId" });
		lnCampaignWriter.initWriter(path, LineItemCampaign.class);
		lnInsertionorderWriter = new DefaultBeanResultWriter<LineItemInsertionOrder>("lineItemInsertionOrders.csv",
				new String[] { "lineItemId", "insertionOrderId" });
		lnInsertionorderWriter.initWriter(path, LineItemInsertionOrder.class);
		lnLabelWriter = new DefaultBeanResultWriter<LineItemLabel>("lineItemLabels.csv",
				new String[] { "lineItemId", "labelId" });
		lnLabelWriter.initWriter(path, LineItemLabel.class);
	}

	@Override
	public void writeResult(LineItem obj) throws Exception {
		lineItemWriter.writeResult(obj);
		if (obj.getCampaigns() != null) {
			for (Campaign c : obj.getCampaigns()) {
				lnCampaignWriter.writeResult(new LineItemCampaign(obj.getId(), c.getId()));
			}
		}
		if (obj.getInsertionOrders() != null) {
			for (InsertionOrder c : obj.getInsertionOrders()) {
				lnInsertionorderWriter.writeResult(new LineItemInsertionOrder(obj.getId(), c.getId()));
			}
		}
		if (obj.getLabels() != null) {
			for (Label c : obj.getLabels()) {
				lnLabelWriter.writeResult(new LineItemLabel(obj.getId(), c.getId()));
			}
		}
	}

	@Override
	public void writeAllResults(List<LineItem> objs) throws Exception {
		for (LineItem o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<LineItem> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
