package esnerda.keboola.ex.appnexus.result;

import java.util.ArrayList;
import java.util.List;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.entity.Campaign;
import esnerda.keboola.ex.appnexus.api.entity.Creative;
import esnerda.keboola.ex.appnexus.result.wrapper.CampaignCreativeWrapper;

/**
 * @author David Esner
 */
public class CampaignWriter implements IResultWriter<Campaign> {

	private IResultWriter<Campaign> campaignyWriter;
	private IResultWriter<CampaignCreativeWrapper> campCreativeWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(campaignyWriter.closeAndRetrieveMetadata());
		results.addAll(campCreativeWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<Campaign> clazz) throws Exception {
		// init category writer
		campaignyWriter = new DefaultBeanResultWriter<Campaign>("campaign.csv", new String[] { "id" });
		campaignyWriter.initWriter(path, Campaign.class);
		// init subcat writer
		campCreativeWriter = new DefaultBeanResultWriter<CampaignCreativeWrapper>("campaignCreatives.csv",
				new String[] { "campaignId", "creativeId" });
		campCreativeWriter.initWriter(path, CampaignCreativeWrapper.class);
	}

	@Override
	public void writeResult(Campaign obj) throws Exception {
					campaignyWriter.writeResult(obj);
			if (obj.getCreatives() != null) {
				for (Creative c : obj.getCreatives()){
					campCreativeWriter.writeResult(new CampaignCreativeWrapper(obj.getId(),c.getId()));
			}
		}
	}

	@Override
	public void writeAllResults(List<Campaign> objs) throws Exception {
		for (Campaign o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<Campaign> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
