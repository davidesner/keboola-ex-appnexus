package esnerda.keboola.ex.appnexus.config;

import java.util.Collections;
import java.util.List;

/**
 * @author David Esner
 */
public class AtrributedConversionReportPars extends ReportPars {

	private List<String> advertisers;

	public AtrributedConversionReportPars() {
		// TODO Auto-generated constructor stub
	}

	public AtrributedConversionReportPars(List<String> dimensions, List<String> ids,
			List<String> advertisers) {
		super(dimensions, ids);
		this.advertisers = advertisers;

	}

	public List<String> getAdvertisers() {
		if (advertisers == null) {
			advertisers = Collections.emptyList();
		}
		return advertisers;
	}

	public void setAdvertisers(List<String> advertisers) {
		this.advertisers = advertisers;
	}



}
