package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class LineItemInsertionOrder {

	private Integer lineItemId;
	private Integer insertionOrderId;
	public LineItemInsertionOrder(Integer lineItemId, Integer insertionOrderId) {
		super();
		this.lineItemId = lineItemId;
		this.insertionOrderId = insertionOrderId;
	}
	public LineItemInsertionOrder() {
		// TODO Auto-generated constructor stub
	}
	public Integer getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}
	public Integer getInsertionOrderId() {
		return insertionOrderId;
	}
	public void setInsertionOrderId(Integer insertionOrderId) {
		this.insertionOrderId = insertionOrderId;
	}
	
	
}
