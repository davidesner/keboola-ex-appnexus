package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class PublisherPlacement {

	private Integer publisherId;
	private Integer placementId;
	public PublisherPlacement(Integer publisherId, Integer placementId) {
		super();
		this.publisherId = publisherId;
		this.placementId = placementId;
	}
	public PublisherPlacement() {
		// TODO Auto-generated constructor stub
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public Integer getPlacementId() {
		return placementId;
	}
	public void setPlacementId(Integer placementId) {
		this.placementId = placementId;
	}
	
	
}
