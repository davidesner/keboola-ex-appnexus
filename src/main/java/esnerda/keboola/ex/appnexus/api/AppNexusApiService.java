package esnerda.keboola.ex.appnexus.api;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import esnerda.keboola.ex.appnexus.api.AppNexusApiRestClient.NexusApiException;
import esnerda.keboola.ex.appnexus.api.entity.Advertiser;
import esnerda.keboola.ex.appnexus.api.entity.Brand;
import esnerda.keboola.ex.appnexus.api.entity.Campaign;
import esnerda.keboola.ex.appnexus.api.entity.Category;
import esnerda.keboola.ex.appnexus.api.entity.Creative;
import esnerda.keboola.ex.appnexus.api.entity.InsertionOrder;
import esnerda.keboola.ex.appnexus.api.entity.Label;
import esnerda.keboola.ex.appnexus.api.entity.LineItem;
import esnerda.keboola.ex.appnexus.api.entity.MediaType;
import esnerda.keboola.ex.appnexus.api.entity.Placement;
import esnerda.keboola.ex.appnexus.api.entity.Publisher;
import esnerda.keboola.ex.appnexus.api.entity.Report;
import esnerda.keboola.ex.appnexus.api.entity.Segment;
import esnerda.keboola.ex.appnexus.api.entity.Site;
import esnerda.keboola.ex.appnexus.api.filters.ErrorResponseFilter.RatelimitExceededException;
import esnerda.keboola.ex.appnexus.api.request.ReportRequestWrapper;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;
import esnerda.keboola.ex.appnexus.api.response.ApiResponseWrapper;
import esnerda.keboola.ex.appnexus.api.response.DbgInfo;
import esnerda.keboola.ex.appnexus.api.response.impl.AdvertiserApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.BrandApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.CampaignResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.CategoryApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.CreativeApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.InsertionOrderApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.LabelApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.LineItemApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.LookupApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.MediaTypeApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.PlacementResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.PublisherApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.ReportJobResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.ReportResultResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.SegmentApiResponse;
import esnerda.keboola.ex.appnexus.api.response.impl.SiteApiResponse;
import esnerda.keboola.ex.appnexus.util.SimpleTimer;

/**
 * @author David Esner
 */
public class AppNexusApiService {

	private static final String DATE_PATTERN = "yyyy-MM-dd+HH:mm:ss";
	private static final String KEY_MIN_LAST_MOD = "min_last_modified";
	//entity keys
	private static final String KEY_ID = "id";
	private static final String KEY_REPORT = "report";
	private static final String KEY_REPORT_DOWNLOAD = "report-download";
	private static final String KEY_CAMPAIGN = "campaign";
	private static final String KEY_ADVERTISOR = "advertiser";
	private static final String KEY_CATEGORY = "category";
	private static final String KEY_CREATIVE = "creative";
	private static final String KEY_INSERTION_ORDERS = "insertion-order";
	private static final String KEY_LABEL = "label";
	private static final String KEY_LINE_ITEM = "line-item";
	private static final String KEY_MEDIA_TYPE = "media-type";
	private static final String KEY_PLACEMENT = "placement";
	private static final String KEY_PUBLISHER = "publisher";
	private static final String KEY_SEGMENT = "segment";
	private static final String KEY_SITE = "site";
	private static final String KEY_BRAND = "brand";

	private static final String KEY_PATH_LOOKUP = "lookup";
	private static final String KEY_SART_EL = "start_element";
	private static final String KEY_EL_COUNT = "num_elements";
	
	private static final String FILE_PART_NAME = "part";
	// wait between status check reqs
	private static final long JOB_CHECK_WAIT_INTERVAL = 10000L;
	// wait hour for jobs chunk to finish
	private static final long WAIT_TIMEOUT = 3600000L; // 1 hour
	
	private static final int RETRY_LIMIT = 5;

	private final Logger log;
	private final AppNexusApiRestClient apiClient;
	private long startTime;

	public AppNexusApiService(AppNexusApiRestClient client, Logger logger) {
		this.log = logger;
		this.apiClient = client;
	}

	/**
	 * Returns all Advertisers modified since, all Advertisers when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Advertiser> getAllAdvertisers(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Advertiser> result = new ArrayList<>();
		List<AdvertiserApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<AdvertiserApiResponse>>() {}, KEY_ADVERTISOR,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getAdvertisers()));
		return result;
	}

	/**
	 * Returns all Categories modified since, all Categories when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Category> getAllCategories(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Category> result = new ArrayList<>();
		List<CategoryApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<CategoryApiResponse>>() {}, KEY_CATEGORY,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getCategories()));
		return result;
	}

	/**
	 * Returns all campaigns modified since, all campaigns when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Campaign> getAllCampaigns(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Campaign> result = new ArrayList<>();
		List<CampaignResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<CampaignResponse>>() {}, KEY_CAMPAIGN,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getCampaigns()));
		return result;
	}
	
	/**
	 * Returns all creatives modified since, all creatives when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Creative> getAllCreatives(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Creative> result = new ArrayList<>();
		List<CreativeApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<CreativeApiResponse>>() {}, KEY_CREATIVE,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getCreatives()));
		return result;
	}

	/**
	 * Returns all insertion orders modified since, all in orders when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<InsertionOrder> getAllInsertionOrders(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<InsertionOrder> result = new ArrayList<>();
		List<InsertionOrderApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<InsertionOrderApiResponse>>() {}, KEY_INSERTION_ORDERS,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getInsertionOrders()));
		return result;
	}

	/**
	 * Returns all Labels modified since, all Labels when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Label> getAllLabels(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Label> result = new ArrayList<>();
		List<LabelApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<LabelApiResponse>>() {}, KEY_LABEL,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getLabels()));
		return result;
	}

	/**
	 * Returns all LineItems modified since, all LineItems when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<LineItem> getAllLineItems(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<LineItem> result = new ArrayList<>();
		List<LineItemApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<LineItemApiResponse>>() {}, KEY_LINE_ITEM,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getLineItems()));
		return result;
	}

	/**
	 * Returns all MediaTypes modified since, all MediaTypes when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<MediaType> getAllMediaTypes(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<MediaType> result = new ArrayList<>();
		List<MediaTypeApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<MediaTypeApiResponse>>() {}, KEY_MEDIA_TYPE,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getMediaTypes()));
		return result;
	}

	/**
	 * Returns all Placements modified since, all Placements when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Placement> getAllPlacements(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Placement> result = new ArrayList<>();
		List<PlacementResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<PlacementResponse>>() {}, KEY_PLACEMENT,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getPlacements()));
		return result;
	}

	/**
	 * Returns all Publishers modified since, all Publishers when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Publisher> getAllPublishers(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Publisher> result = new ArrayList<>();
		List<PublisherApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<PublisherApiResponse>>() {}, KEY_PUBLISHER,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getPublishers()));
		return result;
	}

	/**
	 * Returns all Segments modified since, all Segments when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Segment> getAllSegments(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Segment> result = new ArrayList<>();
		List<SegmentApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<SegmentApiResponse>>() {}, KEY_SEGMENT,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getSegments()));
		return result;
	}

	/**
	 * Returns all Segments modified since, all Segments when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Site> getAllSites(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Site> result = new ArrayList<>();
		List<SiteApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<SiteApiResponse>>() {}, KEY_SITE,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getSites()));
		return result;
	}
	
	/**
	 * Returns all Brands modified since, all Brands when the parameter is null.
	 * @param modifiedSince 
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Brand> getAllBrands(LocalDateTime modifiedSince) throws NexusApiException, Exception{
		
		List<Brand> result = new ArrayList<>();
		List<BrandApiResponse> results =  getAllPages(new GenericType<ApiResponseWrapper<BrandApiResponse>>() {}, KEY_BRAND,  getModifiedSincePar(modifiedSince));
		results.stream().forEach(r -> result.addAll(r.getBrands()));
		return result;
	}

	/* internal helper methods*/
	private Map<String, String> getModifiedSincePar(LocalDateTime since) {
		Map<String, String> params = null;
		if (since != null) {
			params = new HashMap<>();
			params.put(KEY_MIN_LAST_MOD, getLocalDateTimeString(since));

		}
		return params;
	}

	private String getLocalDateTimeString(LocalDateTime date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
		return formatter.format(date);
	}

	/* internal API methods */
	@SuppressWarnings("unchecked")
	private <T extends ApiResponse>  List<T> getAllPages (GenericType<ApiResponseWrapper<T>> type, String path, Map<String, String> params) throws NexusApiException, Exception {
		List<T> results = new ArrayList<>();
		T response = (T) trySendGetRequest(type, path, params);
		results.add(response);
		//init iterator
		PageIterator pageIter = new PageIterator(response.getCount(), response.getNumElements());
		Page currPage = null;
		if (pageIter.hasNext()) {
			//move to next chunk, first has been already retrieved
			currPage = pageIter.next();
		}
		if (params == null) {
			params = new HashMap<>();
		}
		//get all pages
		while (pageIter.hasNext()) {
			params.put(KEY_SART_EL,String.valueOf(currPage.getStartIndex()));
			params.put(KEY_EL_COUNT,String.valueOf(pageIter.getNumElements()));
			results.add(trySendGetRequest(type, path, params));
			currPage = pageIter.next();
		}

		return results;
	}

	/**
	 * Try send get request
	 * @param path
	 * @param params
	 * @return
	 * @throws NexusApiException after fallback fails
	 * @throws Exception
	 */
	private <T extends ApiResponse> T trySendGetRequest(GenericType<ApiResponseWrapper<T>> type, String path, Map<String, String> params) throws NexusApiException, Exception {
		apiClient.authenticateIfFirst();
		boolean flag = false;
		int retries = 0;
		ApiResponseWrapper<T> result = null;
		do {
			retries++;
			try {
			Response resp = apiClient.sendGetRequest(path, params);
			
			result = resp.readEntity(type);
			setClientRateLimits(result);
			if (!result.getResponse().isSuccess()) {
				flag = true;
				NexusApiException ex = new NexusApiException(result.getResponse().getError(),
						result.getResponse().getErrorId());
				if (!ex.isRecoverable()) {
					throw ex;
				}
				if (ex.getErrorId().equals(NexusApiException.ErrorID.NOAUTH_EXPIRED.name())) {
					apiClient.authenticate();
				}
			}
			} catch(RatelimitExceededException e) {
				//logger.warn(e.getMessage()
			}	
			
		} while (flag && retries <= RETRY_LIMIT);
		return result.getResponse();
	}

	private <T extends ApiResponse> void setClientRateLimits(ApiResponseWrapper<T> response) {
		DbgInfo inf;
		if ((inf = response.getResponse().getDbgInfo()) != null) {
			apiClient.setRateLimitDetails(inf.getReadLimit(), inf.getReads(), inf.getReadLimitSeconds());
		}
	}
	/**
	 * Try send get Lookup request
	 * @param path
	 * @param params
	 * @return
	 * @throws NexusApiException after fallback fails
	 * @throws Exception
	 */
	public <T> T trySendGetLookupRequest(GenericType<ApiResponseWrapper<LookupApiResponse<T>>> type, String path, Map<String, String> params) throws NexusApiException, Exception {
		apiClient.authenticateIfFirst();
		boolean flag = false;
		int retries = 0;
		ApiResponseWrapper<LookupApiResponse<T>> result = null;
		do {
			retries++;
			Response resp = apiClient.sendGetRequest(path, params);
			result = resp.readEntity(type);
			if (!result.getResponse().isSuccess()) {
				flag = true;
				NexusApiException ex = new NexusApiException(result.getResponse().getError(),
						result.getResponse().getErrorId());
				if (!ex.isRecoverable()) {
					throw ex;
				}
				if (ex.getErrorId().equals(NexusApiException.ErrorID.NOAUTH_EXPIRED.name())) {
					apiClient.authenticate();
				}
			}
			
		} while (flag && retries <= RETRY_LIMIT);
		return result.getResponse().getResults();
	}
	/**
	 * Submits job requests.
	 * 
	 * @param requests
	 * @return map where key is resulting report_id and value is the original
	 *         request object
	 * @throws Exception 
	 */
	public Map<String, ReportRequestWrapper> submitReportRequests(List<ReportRequestWrapper> requests)
			throws Exception {
		Map<String, ReportRequestWrapper> result = new HashMap<String, ReportRequestWrapper>();
		for (ReportRequestWrapper rq : requests) {
			ApiResponseWrapper<ReportJobResponse> res = trySendReportRequest(rq);
			result.put(res.getResponse().getReportId(), rq);
		}
		return result;
	}

	/**
	 * 
	 * Try submit bulk report request
	 * @param req
	 * @return
	 * @throws NexusApiException
	 * @throws Exception
	 */
	private ApiResponseWrapper<ReportJobResponse> trySendReportRequest(ReportRequestWrapper req) throws NexusApiException, Exception {	
		apiClient.authenticateIfFirst();
		ApiResponseWrapper<ReportJobResponse> result = null;
		boolean flag = false;
		int retries = 0;
		do {
			retries++;
			try {
				Response resp = apiClient.sendPostRequest(KEY_REPORT, req);
				result = resp.readEntity(new GenericType<ApiResponseWrapper<ReportJobResponse>>() {});
				setClientRateLimits(result);
				if (!result.getResponse().isSuccess()) {
					flag = true;
					NexusApiException ex = new NexusApiException(result.getResponse().getError(),
							result.getResponse().getErrorId());
					if (!ex.isRecoverable()) {
						ObjectMapper mapper = new ObjectMapper();
						
						//display name only
						String jsonInString = mapper.writerWithView(ReportRequestWrapper.class).writeValueAsString(req);
						throw ex;
					}
					if (ex.getErrorId().equals(NexusApiException.ErrorID.NOAUTH_EXPIRED.name())) {
						apiClient.authenticate();
					}
				}
			} catch (RatelimitExceededException e) {
				// logger.warn(e.getMessage()
			}
		} while (flag && retries <= RETRY_LIMIT);
		return result;
	}

	/**
	 * Waits for all jobs to finish. If runtime exceedes predefined timeout, only finished reports are returned.
	 * @param jobIds
	 * @return finished reports
	 * @throws NexusApiException
	 * @throws Exception
	 */
	public List<Report> waitForAllJobsToFinish(List<String> jobIds) throws NexusApiException, Exception {
		Set<Report> results = new HashSet<Report>();
		SimpleTimer timer = new SimpleTimer(WAIT_TIMEOUT);
		timer.startTimer();
		boolean flag = false;
		do {
			flag = false;
			for (String reportId : jobIds) {
				ReportResultResponse resp = trySendGetRequest(
						new GenericType<ApiResponseWrapper<ReportResultResponse>>() {}, 
						KEY_REPORT, 
						Collections.singletonMap(KEY_ID, reportId)
						);
				if (resp.isFinished()) {
					results.add(resp.getReport());
				} else {
					flag = true;
				}
				SimpleTimer.reallySleep(10000);
			}
		} while (flag && !timer.isTimedOut());
		return new ArrayList<Report>(results);
	}

	public List<File> downloadReports(List<Report> reports, String path) throws NexusApiException, Exception {
		int count = getNextPartIndex(path);
		List<File> results = new ArrayList<>();		
		for (Report report : reports) {
			try {
				Response resp = apiClient.sendGetRequest(KEY_REPORT_DOWNLOAD, Collections.singletonMap(KEY_ID, report.getId()));
				File res = saveFile((InputStream) resp.getEntity(), path, FILE_PART_NAME + count);				
				results.add(res);
				count++;
			} catch (RatelimitExceededException e) {
				// logger.warn(e.getMessage()
			}
		}
		return results;
	}

	private int getNextPartIndex(String path) {
		File folder = new File(path);
		if (folder.exists()) {
			File[] files = folder.listFiles();
			return getLargestFileIndex(files) + 1;
		}
		return 0;
	}

	private int getLargestFileIndex(File[] files) {
		int max = 0;
		for (File f : files) {
			int curr = Integer.valueOf(f.getName().substring(FILE_PART_NAME.length()));
			if (curr > max) {
				max = curr;
			}
		}
		return max;
	}

	private File saveFile(InputStream is, String path, String name) throws IOException {
	    File targetFile = new File(path + File.separator + name);
	    
	    FileUtils.copyInputStreamToFile(is, targetFile);
	    return targetFile;
	}
	/* Helper classes */
	class  PageIterator implements Iterator<Page>{
		private final int maxChunkSize;
		private final int totalcount;
		private final int maxChunksCount;
		private int cursor = 0;

		public PageIterator(int totalcount, int maxChunkSize) {
			super();
			this.maxChunkSize=maxChunkSize;
			this.totalcount = totalcount;
			this.maxChunksCount = (int) Math.ceil((double) totalcount / (double) maxChunkSize);
		}

		public boolean hasNext() {
			return cursor < getNumberOfChunks();
		}		

		private long getNumberOfChunks() {
			return maxChunksCount;
		}

		@Override
		public Page next() {
			cursor ++;
			return new Page(getNextStart(), getNextEnd());
		}

		private int getNextStart() {
			int candid = cursor * this.maxChunkSize;
			return candid > totalcount ? (cursor-1) * this.maxChunkSize : candid;
		}

		private int getNextEnd() {
			int candid = (cursor+1) * this.maxChunkSize;			
			return candid > totalcount ? totalcount : candid;
		}

		public int getNumElements() {
			return maxChunkSize;
		}
	}
	
	class Page {
		private final int startIndex;
		private final int endIndex;

		public Page(int startIndex, int endIndex) {
			super();
			this.startIndex = startIndex;
			this.endIndex = endIndex;
		}

		public int getStartIndex() {
			return startIndex;
		}

		public int getEndIndex() {
			return endIndex;
		}

	}

}
