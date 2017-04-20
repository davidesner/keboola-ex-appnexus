package esnerda.keboola.ex.appnexus.result;

import java.util.ArrayList;
import java.util.List;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.entity.MediaType;
import esnerda.keboola.ex.appnexus.api.entity.Placement;
import esnerda.keboola.ex.appnexus.api.entity.Segment;
import esnerda.keboola.ex.appnexus.result.wrapper.PlacementMediaType;
import esnerda.keboola.ex.appnexus.result.wrapper.PlacementSegment;

/**
 * @author David Esner
 */
public class PlacementWriter implements IResultWriter<Placement> {

	private IResultWriter<Placement> placementWriter;
	private IResultWriter<PlacementSegment> placementSegmWriter;
	private IResultWriter<PlacementMediaType> plMediaTypeWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(placementWriter.closeAndRetrieveMetadata());
		results.addAll(placementSegmWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<Placement> clazz) throws Exception {
		// init category writer
		placementWriter = new DefaultBeanResultWriter<Placement>("placement.csv", new String[] { "id" });
		placementWriter.initWriter(path, Placement.class);
		// init subcat writer
		placementSegmWriter = new DefaultBeanResultWriter<PlacementSegment>("placementSegments.csv",
				new String[] { "placementId", "segmentId" });
		placementSegmWriter.initWriter(path, PlacementSegment.class);
		plMediaTypeWriter = new DefaultBeanResultWriter<PlacementMediaType>("placementMediaTypes.csv",
				new String[] { "placementId", "mediaTypeId" });
		plMediaTypeWriter.initWriter(path, PlacementMediaType.class);
		
	}

	@Override
	public void writeResult(Placement obj) throws Exception {
		placementWriter.writeResult(obj);
		if (obj.getSegments() != null) {
			for (Segment c : obj.getSegments()) {
				placementSegmWriter.writeResult(new PlacementSegment(obj.getId(), c.getId()));
			}
		}
		if (obj.getSupportedMediaTypes() != null) {
			for (MediaType c : obj.getSupportedMediaTypes()) {
				plMediaTypeWriter.writeResult(new PlacementMediaType(obj.getId(), c.getId()));
			}
		}
		
	}

	@Override
	public void writeAllResults(List<Placement> objs) throws Exception {
		for (Placement o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<Placement> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
