package esnerda.keboola.ex.appnexus;

import java.io.File;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import esnerda.keboola.components.KBCException;
import esnerda.keboola.components.configuration.handler.ConfigHandlerBuilder;
import esnerda.keboola.components.configuration.handler.KBCConfigurationEnvHandler;
import esnerda.keboola.components.configuration.tableconfig.ManifestFile;
import esnerda.keboola.components.logging.DefaultLogger;
import esnerda.keboola.components.logging.KBCLogger;
import esnerda.keboola.components.result.IResultWriter;
import esnerda.keboola.components.result.ResultFileMetadata;
import esnerda.keboola.components.result.impl.DefaultBeanResultWriter;
import esnerda.keboola.ex.appnexus.api.AppNexusApiRestClient;
import esnerda.keboola.ex.appnexus.api.AppNexusApiRestClient.NexusApiException;
import esnerda.keboola.ex.appnexus.api.AppNexusApiService;
import esnerda.keboola.ex.appnexus.api.entity.Advertiser;
import esnerda.keboola.ex.appnexus.api.entity.Brand;
import esnerda.keboola.ex.appnexus.api.entity.Campaign;
import esnerda.keboola.ex.appnexus.api.entity.Category;
import esnerda.keboola.ex.appnexus.api.entity.Creative;
import esnerda.keboola.ex.appnexus.api.entity.InsertionOrder;
import esnerda.keboola.ex.appnexus.api.entity.Label;
import esnerda.keboola.ex.appnexus.api.entity.MediaType;
import esnerda.keboola.ex.appnexus.api.entity.Report;
import esnerda.keboola.ex.appnexus.api.entity.Segment;
import esnerda.keboola.ex.appnexus.api.request.ClickTrackersFeedBulkRequest;
import esnerda.keboola.ex.appnexus.api.request.NetworkAnalyticsFeedBulkRequest;
import esnerda.keboola.ex.appnexus.api.request.ReportRequestBuilder;
import esnerda.keboola.ex.appnexus.api.request.ReportRequestChunk;
import esnerda.keboola.ex.appnexus.api.request.ReportRequestWrapper;
import esnerda.keboola.ex.appnexus.config.AppNexusProperties;
import esnerda.keboola.ex.appnexus.config.AppNexusProperties.Dataset;
import esnerda.keboola.ex.appnexus.config.AppNexusState;
import esnerda.keboola.ex.appnexus.result.CampaignWriter;
import esnerda.keboola.ex.appnexus.result.CreativeWriter;
import esnerda.keboola.ex.appnexus.result.LineItemWriter;
import esnerda.keboola.ex.appnexus.result.PlacementWriter;
import esnerda.keboola.ex.appnexus.result.PublisherWriter;
import esnerda.keboola.ex.appnexus.result.SiteWriter;
import esnerda.keboola.ex.appnexus.util.CsvUtil;

/**
 * @author David Esner
 */
public class AppNexusRunner extends ComponentRunner {

	private static final long TIMEOUT = 9900000L; // 3 hrs
	private static final String FILE_NETWORK_ANALYTICS = "networkAnalytics.csv";
	private static final String FILE_CLICK_TRACKERS = "clickTrackers.csv";

	private KBCLogger log;

	private KBCConfigurationEnvHandler handler;
	private AppNexusApiService apiService;
	private AppNexusProperties config;

	/* writers */
	private static IResultWriter<Advertiser> advertiserWriter;
	private static IResultWriter<Brand> brandWriter;
	private static IResultWriter<Campaign> campaignWriter;
	private static IResultWriter<Category> catWriter;
	private static IResultWriter<Creative> crWriter;
	private static IResultWriter<InsertionOrder> iOrderWriter;
	private static IResultWriter<Label> labelWriter;
	private static IResultWriter<MediaType> mediaTypeWriter;
	private static IResultWriter<Segment> segmentWriter;
	private static IResultWriter lineItemWriter;
	private static IResultWriter placemetnWriter;
	private static IResultWriter publisherWriter;
	private static IResultWriter siteWriter;

	public AppNexusRunner(String[] args) {
		log = new DefaultLogger(AppNexusRunner.class);
		handler = initHandler(args, log);
		config = (AppNexusProperties) handler.getParameters();
		log.info("Configuring environment...");
		try {
			AppNexusApiRestClient client = new AppNexusApiRestClient(config.getEndpointUrl(), config.getUserName(),
					config.getPassword());
			apiService = new AppNexusApiService(client, log.getLogger());
			initWriters();

		} catch (Exception e) {
			handleException(new KBCException("Failed to init web service!", e.getMessage(), e, 2));
		}
	}

	@Override
	protected void run(){

		LocalDateTime now = LocalDateTime.now();

		LocalDateTime since = getSinceDate();

		log.info("Retrieving entities...");
		if(since != null){
			log.info("Loading results since " + since.toString());
		}
		List<ResultFileMetadata> results = new ArrayList<>();
		try {
			results.addAll(writeAllEntities(since));

			// NetworkAnalytics Report
			if (config.getNetworkAnalyticsPars() != null) {
				log.info("Retrieving Network Analytics reports...");
				results.addAll(downloadNetworkAnalyticsReports(since));
			}

			// ClickTrackers Report
			if (config.getClickTrackersPars() != null) {
				log.info("Retrieving Click Trackers reports...");
				results.addAll(downloadClickTrackersReports(since));
			}
		} catch (Exception ex) {
			handleException(new KBCException("Extraction failed!", 2, ex));
		}

		finalize(results, new AppNexusState(now, null));
		log.info("Extraction finished successfuly!");
	}

	private List<ResultFileMetadata> downloadNetworkAnalyticsReports(LocalDateTime since) throws Exception {
		LocalDateTime sinceInst = since != null ? since : null;
		List<File> resultReports = new ArrayList<>();
		try {
			ReportRequestBuilder<NetworkAnalyticsFeedBulkRequest> builder = new ReportRequestBuilder<NetworkAnalyticsFeedBulkRequest>(
					NetworkAnalyticsFeedBulkRequest.class);

			List<ReportRequestChunk<NetworkAnalyticsFeedBulkRequest>> reqs = builder.buildAdRequestChunks(sinceInst, LocalDateTime.now(),
					Arrays.asList(config.getNetworkAnalyticsPars().getDimensions().toArray(new String[0])));

			for (ReportRequestChunk chunk : reqs) {
				Map<String, ReportRequestWrapper> resJobs = new HashMap<>();
				resJobs.putAll(apiService.submitReportRequests(chunk.getRequestList()));
				List<Report> reports = apiService.waitForAllJobsToFinish(new ArrayList<String>(resJobs.keySet()));

				if (reports.size() != chunk.getRequestList().size()) {
					log.error(reports.size() + " reports out of " + chunk.getRequestList().size() + " were downloaded. "
							+ (chunk.getRequestList().size() - reports.size())
							+ " timed out and will be collected on next run.", null);
				}
				resultReports.addAll(apiService.downloadReports(reports,
						handler.getOutputTablesPath() + File.separator + FILE_NETWORK_ANALYTICS));
			}
		} catch (NexusApiException e) {
			log.error("Failed to retrieve Network analytics report! " + e.getMessage() + " errorId: " + e.getErrorId(),	e);
		}
		return processReportFiles(resultReports, config.getNetworkAnalyticsPars().getIds().toArray(new String[0]));
	}

	private List<ResultFileMetadata> downloadClickTrackersReports(LocalDateTime since) throws Exception {
		LocalDateTime sinceInst = since != null ? since : null;
		List<File> resultReports = new ArrayList<>();
		try {
			ReportRequestBuilder<ClickTrackersFeedBulkRequest> builder = new ReportRequestBuilder<ClickTrackersFeedBulkRequest>(
					ClickTrackersFeedBulkRequest.class);

			List<ReportRequestChunk<ClickTrackersFeedBulkRequest>> reqs = builder.buildAdRequestChunks(sinceInst, LocalDateTime.now(),
					Arrays.asList(config.getClickTrackersPars().getDimensions().toArray(new String[0])));

			for (ReportRequestChunk chunk : reqs) {
				Map<String, ReportRequestWrapper> resJobs = new HashMap<>();
				resJobs.putAll(apiService.submitReportRequests(chunk.getRequestList()));
				List<Report> reports = apiService.waitForAllJobsToFinish(new ArrayList<String>(resJobs.keySet()));
				if (reports.size() != chunk.getRequestList().size()) {
					log.error("Some reports were not generated and timed out!", null);
				}
				resultReports.addAll(apiService.downloadReports(reports,
						handler.getOutputTablesPath() + File.separator + FILE_CLICK_TRACKERS));
			}
		} catch (NexusApiException e) {
			log.error("Failed to retrieve Click Trackers report! " + e.getMessage() + " errorId: " + e.getErrorId(), e);
			if (!e.isTerminal()) {
				System.exit(1);
			}
		}
		return processReportFiles(resultReports, config.getClickTrackersPars().getIds().toArray(new String[0]));
	}

	/**
	 * Process result report files of a same type
	 * 
	 * @param reports
	 * @return
	 * @throws Exception
	 */
	private List<ResultFileMetadata> processReportFiles(List<File> reports, String [] ids) throws Exception {

		if (reports.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		// get colums
		String[] headerCols = CsvUtil.readHeader(reports.get(0), ',', '"', '\\', false, false);
		// remove headers and create results
		for (File r : reports) {
			CsvUtil.removeHeaderFromCsv(r);
		}
		return Collections.singletonList(
				new ResultFileMetadata(new File(reports.get(0).getParentFile().getAbsolutePath()), ids, headerCols));
	}

	private List<ResultFileMetadata> writeAllEntities(LocalDateTime since) throws NexusApiException, Exception {
		List<ResultFileMetadata> result = new ArrayList<>();
		try {
			if (config.getDatasets().contains(Dataset.Advertiser.name())) {
				log.info("Retrieving advetisers...");
				advertiserWriter.initWriter(handler.getOutputTablesPath(), Advertiser.class);
				result.addAll(advertiserWriter.writeAndRetrieveResuts(apiService.getAllAdvertisers(since)));
			}
			if (config.getDatasets().contains(Dataset.Brand.name())) {
				log.info("Retrieving brands...");
				brandWriter.initWriter(handler.getOutputTablesPath(), Brand.class);
				result.addAll(brandWriter.writeAndRetrieveResuts(apiService.getAllBrands(since)));
			}
			if (config.getDatasets().contains(Dataset.Campaign.name())) {
				log.info("Retrieving campaigns...");
				campaignWriter.initWriter(handler.getOutputTablesPath(), null);
				result.addAll(campaignWriter.writeAndRetrieveResuts(apiService.getAllCampaigns(since)));
			}
			if (config.getDatasets().contains(Dataset.LineItem.name())) {
				log.info("Retrieving line items...");
				lineItemWriter.initWriter(handler.getOutputTablesPath(), null);
				result.addAll(lineItemWriter.writeAndRetrieveResuts(apiService.getAllLineItems(since)));
			}
			if (config.getDatasets().contains(Dataset.Category.name())) {
				log.info("Retrieving categories...");
				catWriter.initWriter(handler.getOutputTablesPath(), Category.class);
				result.addAll(catWriter.writeAndRetrieveResuts(apiService.getAllCategories(since)));
			}
			if (config.getDatasets().contains(Dataset.Creative.name())) {
				log.info("Retrieving creatives...");
				crWriter.initWriter(handler.getOutputTablesPath(), Creative.class);
				result.addAll(crWriter.writeAndRetrieveResuts(apiService.getAllCreatives(since)));
			}
			if (config.getDatasets().contains(Dataset.InsertionOrder.name())) {
				log.info("Retrieving insertion orders...");
				iOrderWriter.initWriter(handler.getOutputTablesPath(), InsertionOrder.class);
				result.addAll(iOrderWriter.writeAndRetrieveResuts(apiService.getAllInsertionOrders(since)));
			}
			if (config.getDatasets().contains(Dataset.MediaType.name())) {
				log.info("Retrieving media types...");
				mediaTypeWriter.initWriter(handler.getOutputTablesPath(), MediaType.class);
				result.addAll(mediaTypeWriter.writeAndRetrieveResuts(apiService.getAllMediaTypes(since)));
			}
			if (config.getDatasets().contains(Dataset.Placement.name())) {
				log.info("Retrieving placements...");
				placemetnWriter.initWriter(handler.getOutputTablesPath(), null);
				result.addAll(placemetnWriter.writeAndRetrieveResuts(apiService.getAllPlacements(since)));
			}
			if (config.getDatasets().contains(Dataset.Publisher.name())) {
				log.info("Retrieving publishers...");
				publisherWriter.initWriter(handler.getOutputTablesPath(), null);
				result.addAll(publisherWriter.writeAndRetrieveResuts(apiService.getAllPublishers(since)));
			}
			if (config.getDatasets().contains(Dataset.Segment.name())) {
				log.info("Retrieving segments...");
				segmentWriter.initWriter(handler.getOutputTablesPath(), Segment.class);
				result.addAll(segmentWriter.writeAndRetrieveResuts(apiService.getAllSegments(since)));
			}
			if (config.getDatasets().contains(Dataset.Site.name())) {
				log.info("Retrieving sites...");
				siteWriter.initWriter(handler.getOutputTablesPath(), null);
				result.addAll(siteWriter.writeAndRetrieveResuts(apiService.getAllSites(since)));
			}
			if (config.getDatasets().contains(Dataset.Label.name())) {
				log.info("Retrieving labels...");
				labelWriter.initWriter(handler.getOutputTablesPath(), Label.class);
				result.addAll(labelWriter.writeAndRetrieveResuts(apiService.getAllLabels(since)));
			}
		} catch (NexusApiException e) {
			log.error("Failed to retrieve entities! " + e.getMessage() + " errorId: " + e.getErrorId(),	e);
			if (!e.isTerminal()) {
				System.exit(1);
			}
		}
		return result;
	}

	/* internal methods*/	

	@Override
	protected KBCConfigurationEnvHandler initHandler(String[] args, KBCLogger log) {
		KBCConfigurationEnvHandler handler = null;
		try {
			handler = ConfigHandlerBuilder.create(AppNexusProperties.class).setStateFileType(AppNexusState.class)
					.build();
			// process the configuration
			handler.processConfigFile(args);
		} catch (KBCException ex) {
			log.log(ex);
			System.exit(1);
		}
		setHandler(handler);
		return handler;
	}

	@Override
	protected void initWriters() throws Exception {
		advertiserWriter = new DefaultBeanResultWriter<>("advertiser.csv", new String[] { "id" });
		brandWriter = new DefaultBeanResultWriter<>("brand.csv", new String[] { "id" });
		campaignWriter = new CampaignWriter();
		catWriter = new DefaultBeanResultWriter<>("category.csv", new String[] { "id" });
		crWriter = new CreativeWriter();
		lineItemWriter = new LineItemWriter();
		placemetnWriter = new PlacementWriter();
		publisherWriter = new PublisherWriter();
		siteWriter = new SiteWriter();
		iOrderWriter = new DefaultBeanResultWriter<>("insertionOrder.csv", new String[] { "id" });
		labelWriter = new DefaultBeanResultWriter<>("label.csv", new String[] { "id" });
		mediaTypeWriter = new DefaultBeanResultWriter<>("mediaType.csv", new String[] { "id" });
		segmentWriter = new DefaultBeanResultWriter<>("segmetn.csv", new String[] { "id" });

	}

	@Override
	public KBCLogger getLogger() {
		return log;
	}

	@Override
	protected long getTimeout() {
		return TIMEOUT;
	}

	@Override
	protected ManifestFile generateManifestFile(ResultFileMetadata result) throws KBCException {
		return ManifestFile.Builder.buildDefaultFromResult(result, null, config.getIncremental()).setColumns(result.getColumns()).build();
	}

	private LocalDateTime getSinceDate() {
		AppNexusState lastState = null;
		try {
			lastState = (AppNexusState) handler.getStateFile();
		} catch (KBCException e) {
			handleException(e);
		}
		if (lastState == null || lastState.getLastRun() == null) {			
			return config.getSince() != null ? config.getSince().atStartOfDay() : null;
		}
		return lastState.getLastRun();
	}

}
