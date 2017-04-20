package esnerda.keboola.ex.appnexus.api.request;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;



/**
 * @author David Esner
 */
public class ReportRequestBuilder<T extends ReportRequest> {

	private static final int MAX_DAY_INTERVAL = 30;
	private static final int MAX_WINDOW_SIZE = 23;
	private final Class<T> type;
	
	

	public ReportRequestBuilder(Class<T> type) {
		super();
		this.type = type;
	}

	public List<ReportRequestChunk<T>> buildAdRequestChunks(LocalDateTime startTime, LocalDateTime endTime, List<String> columns) throws Exception {
		LocalDateTime maxStartTime = endTime.minus(new Long(MAX_DAY_INTERVAL), ChronoUnit.DAYS);
		if (startTime == null || startTime.isBefore(endTime.minus(new Long(MAX_DAY_INTERVAL), ChronoUnit.DAYS))) {
			startTime = endTime.minus(new Long(MAX_DAY_INTERVAL), ChronoUnit.DAYS);
		}
		List<ReportRequestWrapper<T>> requests = new ArrayList<>();
		TimeWindowIterator tIt = new TimeWindowIterator(startTime, endTime);
			//iterate over time windows
			while (tIt.hasNext()) {
				TimeWindow tw = tIt.next();
				requests.add(buildRequest(tw, columns));
			}

		return buildChunkList(requests);
	}

	/**
	 * Split requests into allowed chunks
	 * @param requests
	 * @return
	 */
	private List<ReportRequestChunk<T>> buildChunkList(List<ReportRequestWrapper<T>> requests) {
		List<List<ReportRequestWrapper<T>>> chunks = Lists.partition(requests, ReportRequestChunk.MAX_CHUNK_SIZE);
		return chunks.stream().map(c -> new ReportRequestChunk<T>(c)).collect(Collectors.toList());
	}

	/**
	 * Build request entity
	 * @param accountId
	 * @param eIds
	 * @param window
	 * @return
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	private ReportRequestWrapper<T> buildRequest(TimeWindow window, List<String> columns) throws Exception {
		 Constructor<T> constructorStr = type.getConstructor(LocalDateTime.class, LocalDateTime.class, List.class);
		T req =  (T) constructorStr.newInstance(window.getStartTime(),window.getEndTime(),columns);
		return (ReportRequestWrapper<T>) new ReportRequestWrapper<T>(req);
	}



	/* Helper classes */
	class  TimeWindowIterator implements Iterator<TimeWindow>{
		private final LocalDateTime startTime;
		private final LocalDateTime endTime;
		private long cursor = 0;
		private final long totalChunks;

		public TimeWindowIterator(LocalDateTime startTime, LocalDateTime endTime) {
			super();
			this.startTime = startTime;
			this.endTime = endTime;
			this.totalChunks = getNumberOfChunks();
		}

		public boolean hasNext() {
			return cursor < totalChunks;
		}		

		private long getNumberOfChunks() {
			return (int) Math.ceil((double)ChronoUnit.HOURS.between(startTime, endTime)/(double)MAX_WINDOW_SIZE);
		}

		@Override
		public TimeWindow next() {
			LocalDateTime startWindow = getNextStart();
			LocalDateTime endWindow = getNextEnd();
			cursor ++;
			return new TimeWindow(startWindow, endWindow);
		}

		private LocalDateTime getNextStart() {
			LocalDateTime candid = startTime.plus(cursor * MAX_WINDOW_SIZE, ChronoUnit.HOURS);
			return candid.isAfter(endTime) ? startTime.plus((cursor-1) * MAX_WINDOW_SIZE, ChronoUnit.HOURS) : candid;
		}

		private LocalDateTime getNextEnd() {
			LocalDateTime candid = startTime.plus((cursor+1) * MAX_WINDOW_SIZE, ChronoUnit.HOURS);
			return candid.isAfter(endTime) ? endTime : candid;
		}
	}
	
	class TimeWindow {
		private final LocalDateTime startTime;
		private final LocalDateTime endTime;

		public TimeWindow(LocalDateTime startTime, LocalDateTime endTime) {
			super();
			this.startTime = startTime;
			this.endTime = endTime;
		}

		public LocalDateTime getStartTime() {
			return startTime;
		}

		public LocalDateTime getEndTime() {
			return endTime;
		}

	}

}
