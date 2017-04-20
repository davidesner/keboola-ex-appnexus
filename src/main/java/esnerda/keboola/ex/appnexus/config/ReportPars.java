package esnerda.keboola.ex.appnexus.config;

import java.util.Arrays;
import java.util.List;

/**
 * @author David Esner
 */
public class ReportPars {

	private List<String> dimensions;
	private List<String> ids;

	
	public ReportPars() {
		// TODO Auto-generated constructor stub
	}

	public ReportPars(List<String> dimensions, List<String> ids) {
		super();
		this.dimensions = dimensions;
		this.ids = ids;
	}

	public List<String> getDimensions() {
		return dimensions;
	}

	public void setDimensions(List<String> dimensions) {
		this.dimensions = dimensions;
	}

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public boolean isValid(String[] allowedPars) {
		List<String> allowed = Arrays.asList(allowedPars);
		for (String d : dimensions) {
			if (!allowed.contains(d)) {
				return false;
			}
		}
		for (String d : ids) {
			if (!allowed.contains(d)) {
				return false;
			}
		}
		return true;
	}
}
