package esnerda.keboola.ex.appnexus.result;

import java.util.ArrayList;
import java.util.List;

import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.entity.Brand;
import esnerda.keboola.ex.appnexus.api.entity.Category;
import esnerda.keboola.ex.appnexus.api.entity.Creative;
import esnerda.keboola.ex.appnexus.api.entity.Segment;
import esnerda.keboola.ex.appnexus.result.wrapper.CreativeCompetitiveBrandWrapper;
import esnerda.keboola.ex.appnexus.result.wrapper.CreativeCompetitiveCategoryWrapper;
import esnerda.keboola.ex.appnexus.result.wrapper.CreativeSegmentWrapper;

/**
 * @author David Esner
 */
public class CreativeWriter implements IResultWriter<Creative> {

	private IResultWriter<Creative> creativeyWriter;
	private IResultWriter<CreativeSegmentWrapper> creativeSegmWriter;
	private IResultWriter<CreativeCompetitiveBrandWrapper> creativeCBrandWriter;
	private IResultWriter<CreativeCompetitiveCategoryWrapper> creativeCCategoryWriter;

	@Override
	public List<ResultFileMetadata> closeAndRetrieveMetadata() throws Exception {
		List<ResultFileMetadata> results = new ArrayList<>();
		// collect all results
		results.addAll(creativeyWriter.closeAndRetrieveMetadata());
		results.addAll(creativeSegmWriter.closeAndRetrieveMetadata());
		results.addAll(creativeCBrandWriter.closeAndRetrieveMetadata());
		results.addAll(creativeCCategoryWriter.closeAndRetrieveMetadata());

		return results;
	}

	@Override
	public void initWriter(String path, Class<Creative> clazz) throws Exception {
		// init category writer
		creativeyWriter = new DefaultBeanResultWriter<Creative>("creative.csv", new String[] { "id" });
		creativeyWriter.initWriter(path, Creative.class);
		// init subcat writer
		creativeSegmWriter = new DefaultBeanResultWriter<CreativeSegmentWrapper>("creativeSegments.csv",
				new String[] { "creativeId", "segmentId" });
		creativeSegmWriter.initWriter(path, CreativeSegmentWrapper.class);
		creativeCBrandWriter = new DefaultBeanResultWriter<CreativeCompetitiveBrandWrapper>("creativeCompetitiveBrands.csv",
				new String[] { "creativeId", "brandId" });
		creativeCBrandWriter.initWriter(path, CreativeCompetitiveBrandWrapper.class);
		creativeCCategoryWriter = new DefaultBeanResultWriter<CreativeCompetitiveCategoryWrapper>("creativeCompetitiveCategories.csv",
				new String[] { "creativeId", "categoryId" });
		creativeCCategoryWriter.initWriter(path, CreativeCompetitiveCategoryWrapper.class);
	}

	@Override
	public void writeResult(Creative obj) throws Exception {
		creativeyWriter.writeResult(obj);
		if (obj.getSegments() != null) {
			for (Segment c : obj.getSegments()) {
				creativeSegmWriter.writeResult(new CreativeSegmentWrapper(c.getId(), obj.getId()));
			}
		}
		if (obj.getCompetitiveBrands() != null) {
			for (Brand c : obj.getCompetitiveBrands()) {
				creativeCBrandWriter.writeResult(new CreativeCompetitiveBrandWrapper(c.getId(), obj.getId()));
			}
		}
		if (obj.getCompetitiveCategories() != null) {
			for (Category c : obj.getCompetitiveCategories()) {
				creativeCCategoryWriter.writeResult(new CreativeCompetitiveCategoryWrapper(c.getId(), obj.getId()));
			}
		}
		
	}

	@Override
	public void writeAllResults(List<Creative> objs) throws Exception {
		for (Creative o : objs) {
			writeResult(o);
		}
	}

	@Override
	public List<ResultFileMetadata> writeAndRetrieveResuts(List<Creative> objs)
			throws Exception {
		writeAllResults(objs);
		return closeAndRetrieveMetadata();
	}

}
