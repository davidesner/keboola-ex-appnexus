package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class CreativeSegmentWrapper {

	private Integer segmentId;
	private Integer creativeId;
	public CreativeSegmentWrapper(Integer segmentId, Integer creativeId) {
		super();
		this.segmentId = segmentId;
		this.creativeId = creativeId;
	}
	public CreativeSegmentWrapper() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSegmentId() {
		return segmentId;
	}
	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}
	public Integer getCreativeId() {
		return creativeId;
	}
	public void setCreativeId(Integer creativeId) {
		this.creativeId = creativeId;
	}
	
	
}
