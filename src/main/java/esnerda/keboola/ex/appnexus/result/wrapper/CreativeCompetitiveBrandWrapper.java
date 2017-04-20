package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class CreativeCompetitiveBrandWrapper {

	private Integer brandId;
	private Integer creativeId;
	public CreativeCompetitiveBrandWrapper(Integer brandId, Integer creativeId) {
		super();
		this.brandId = brandId;
		this.creativeId = creativeId;
	}
	public CreativeCompetitiveBrandWrapper() {
		// TODO Auto-generated constructor stub
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getCreativeId() {
		return creativeId;
	}
	public void setCreativeId(Integer creativeId) {
		this.creativeId = creativeId;
	}
	
	
}
