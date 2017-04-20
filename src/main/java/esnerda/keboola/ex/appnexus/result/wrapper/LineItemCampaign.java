package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class LineItemCampaign {

	private Integer lineItemId;
	private Integer campaignId;
	public LineItemCampaign(Integer lineItemId, Integer campaignId) {
		super();
		this.lineItemId = lineItemId;
		this.campaignId = campaignId;
	}
	public LineItemCampaign() {
		// TODO Auto-generated constructor stub
	}
	public Integer getLineItemId() {
		return lineItemId;
	}
	public void setLineItemId(Integer lineItemId) {
		this.lineItemId = lineItemId;
	}
	public Integer getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Integer campaignId) {
		this.campaignId = campaignId;
	}
	
	
}
