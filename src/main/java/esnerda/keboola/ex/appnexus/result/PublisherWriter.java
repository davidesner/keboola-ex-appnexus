package esnerda.keboola.ex.appnexus.result;

import java.util.ArrayList;
import java.util.List;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.entity.Placement;
import esnerda.keboola.ex.appnexus.api.entity.Publisher;
import esnerda.keboola.ex.appnexus.result.wrapper.PublisherPlacement;

/**
 * @author David Esner
 */
public class PublisherWriter implements IResultWriter<Publisher> {

	private IResultWriter<Publisher> publisherWriter;
	private IResultWriter<PublisherPlacement> pubPlacementWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(publisherWriter.closeAndRetrieveMetadata());
		results.addAll(pubPlacementWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<Publisher> clazz) throws Exception {
		// init category writer
		publisherWriter = new DefaultBeanResultWriter<Publisher>("publisher.csv", new String[] { "id" });
		publisherWriter.initWriter(path, Publisher.class);
		// init subcat writer
		pubPlacementWriter = new DefaultBeanResultWriter<PublisherPlacement>("publisherPlacements.csv",
				new String[] { "publisherId", "placementId" });
		pubPlacementWriter.initWriter(path, PublisherPlacement.class);
	}

	@Override
	public void writeResult(Publisher obj) throws Exception {
					publisherWriter.writeResult(obj);
			if (obj.getPlacements() != null) {
				for (Placement c : obj.getPlacements()){
					pubPlacementWriter.writeResult(new PublisherPlacement(obj.getId(),c.getId()));
			}
		}
	}

	@Override
	public void writeAllResults(List<Publisher> objs) throws Exception {
		for (Publisher o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<Publisher> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
