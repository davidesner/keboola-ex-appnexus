package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class PlacementMediaType {

	private Integer mediaTypeId;
	private Integer placementId;
	public PlacementMediaType(Integer placementId, Integer mediaTypeId) {
		super();
		this.mediaTypeId = mediaTypeId;
		this.placementId = placementId;
	}
	public PlacementMediaType() {
		// TODO Auto-generated constructor stub
	}
	public Integer getMediaTypeId() {
		return mediaTypeId;
	}
	public void setMediaTypeId(Integer mediaTypeId) {
		this.mediaTypeId = mediaTypeId;
	}
	public Integer getPlacementId() {
		return placementId;
	}
	public void setPlacementId(Integer placementId) {
		this.placementId = placementId;
	}
	
	
}
