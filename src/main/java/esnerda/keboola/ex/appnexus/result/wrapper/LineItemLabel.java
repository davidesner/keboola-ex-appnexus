package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class LineItemLabel {

	private Integer lineItemId;
	private Integer labelId;
	public LineItemLabel(Integer lineItemId, Integer labelId) {
		super();
		this.lineItemId = lineItemId;
		this.labelId = labelId;
	}
	public LineItemLabel() {
		// TODO Auto-generated constructor stub
	}
	public Integer getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}
	public Integer getLabelId() {
		return labelId;
	}
	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}
	
	
}
