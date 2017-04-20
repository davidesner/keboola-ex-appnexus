package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class SitePlacement {

	private Integer siteId;
	private Integer placementId;
	public SitePlacement(Integer siteId, Integer placementId) {
		super();
		this.siteId = siteId;
		this.placementId = placementId;
	}
	public SitePlacement() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public Integer getPlacementId() {
		return placementId;
	}
	public void setPlacementId(Integer placementId) {
		this.placementId = placementId;
	}
	
	
}
