package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class PlacementSegment {

	private Integer segmentId;
	private Integer placementId;
	public PlacementSegment(Integer placementId, Integer segmentId) {
		super();
		this.segmentId = segmentId;
		this.placementId = placementId;
	}
	public PlacementSegment() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}
	public Integer getPlacementId() {
		return placementId;
	}
	public void setPlacementId(Integer placementId) {
		this.placementId = placementId;
	}
	
	
}
