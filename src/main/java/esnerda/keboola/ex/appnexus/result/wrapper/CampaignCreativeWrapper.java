package esnerda.keboola.ex.appnexus.result.wrapper;
/**
 * @author David Esner
 */
public class CampaignCreativeWrapper {

	private Integer campaignId;
	private Integer creativeId;
	public CampaignCreativeWrapper(Integer campaignId, Integer creativeId) {
		super();
		this.campaignId = campaignId;
		this.creativeId = creativeId;
	}
	public CampaignCreativeWrapper() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Integer campaignId) {
		this.campaignId = campaignId;
	}
	public Integer getCreativeId() {
		return creativeId;
	}
	public void setCreativeId(Integer creativeId) {
		this.creativeId = creativeId;
	}
	
	
}
