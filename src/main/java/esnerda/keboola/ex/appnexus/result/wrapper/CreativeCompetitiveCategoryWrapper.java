package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class CreativeCompetitiveCategoryWrapper {

	private Integer categoryId;
	private Integer creativeId;
	public CreativeCompetitiveCategoryWrapper(Integer categoryId, Integer creativeId) {
		super();
		this.categoryId = categoryId;
		this.creativeId = creativeId;
	}
	public CreativeCompetitiveCategoryWrapper() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getCreativeId() {
		return creativeId;
	}
	public void setCreativeId(Integer creativeId) {
		this.creativeId = creativeId;
	}
	
	
}
