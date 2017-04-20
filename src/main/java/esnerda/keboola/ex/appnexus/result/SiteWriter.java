package esnerda.keboola.ex.appnexus.result;

import java.util.ArrayList;
import java.util.List;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.entity.Placement;
import esnerda.keboola.ex.appnexus.api.entity.Site;
import esnerda.keboola.ex.appnexus.result.wrapper.SitePlacement;

/**
 * @author David Esner
 */
public class SiteWriter implements IResultWriter<Site> {

	private IResultWriter<Site> siteWriter;
	private IResultWriter<SitePlacement> pubPlacementWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(siteWriter.closeAndRetrieveMetadata());
		results.addAll(pubPlacementWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<Site> clazz) throws Exception {
		// init category writer
		siteWriter = new DefaultBeanResultWriter<Site>("site.csv", new String[] { "id" });
		siteWriter.initWriter(path, Site.class);
		// init subcat writer
		pubPlacementWriter = new DefaultBeanResultWriter<SitePlacement>("sitePlacements.csv",
				new String[] { "siteId", "placementId" });
		pubPlacementWriter.initWriter(path, SitePlacement.class);
	}

	@Override
	public void writeResult(Site obj) throws Exception {
					siteWriter.writeResult(obj);
			if (obj.getPlacements() != null) {
				for (Placement c : obj.getPlacements()){
					pubPlacementWriter.writeResult(new SitePlacement(obj.getId(),c.getId()));
			}
		}
	}

	@Override
	public void writeAllResults(List<Site> objs) throws Exception {
		for (Site o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<Site> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
