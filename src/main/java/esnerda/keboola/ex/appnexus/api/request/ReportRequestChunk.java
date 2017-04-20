package esnerda.keboola.ex.appnexus.api.request;

import java.util.List;

/**
 * @author David Esner
 */
public class ReportRequestChunk<T extends ReportRequest> {
	public static final int MAX_CHUNK_SIZE = 5;
	private final List<ReportRequestWrapper<T>> chunkList;

	public ReportRequestChunk(List<ReportRequestWrapper<T>> c) {
		if (c.size() > MAX_CHUNK_SIZE) {
			throw new IllegalArgumentException("The reportRequest chunk size can be max " + MAX_CHUNK_SIZE);
		}
		this.chunkList = c;
	}

	public List<ReportRequestWrapper<T>> getRequestList() {
		return chunkList;
	}

	public int size() {
		return chunkList.size();
	}

	
}
