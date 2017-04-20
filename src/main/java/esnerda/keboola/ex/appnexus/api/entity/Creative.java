
package esnerda.keboola.ex.appnexus.api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Creative {

    @JsonProperty("name")
    private String name;
    @JsonProperty("brand_id")
    private Integer brandId;
    @JsonProperty("media_url")
    private String mediaUrl;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("code2")
    private String code2;
    @JsonProperty("member_id")
    private Integer memberId;
    @JsonProperty("state")
    private String state;
    @JsonProperty("click_track_result")
    private String clickTrackResult;
    @JsonProperty("advertiser_id")
    private Integer advertiserId;
    @JsonProperty("publisher_id")
    private Integer publisherId;
    @JsonProperty("format")
    private String format;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("click_url")
    private String clickUrl;
    @JsonProperty("flash_click_variable")
    private String flashClickVariable;
    @JsonProperty("no_iframes")
    private Boolean noIframes;
    @JsonProperty("content")
    private String content;
    @JsonProperty("original_content")
    private String originalContent;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("track_clicks")
    private Boolean trackClicks;
    @JsonProperty("audit_status")
    private String auditStatus;
    @JsonProperty("macros")
    private String macros;
    @JsonProperty("profile_id")
    private Integer profileId;
    @JsonProperty("audit_feedback")
    private String auditFeedback;
    @JsonProperty("is_prohibited")
    private Boolean isProhibited;
    @JsonProperty("created_on")
    private String createdOn;
    @JsonProperty("flash_backup_url")
    private String flashBackupUrl;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("is_control")
    private Boolean isControl;
    @JsonProperty("allow_audit")
    private Boolean allowAudit;
    @JsonProperty("is_expired")
    private Boolean isExpired;
    @JsonProperty("creative_upload_status")
    private String creativeUploadStatus;
    @JsonProperty("backup_upload_status")
    private String backupUploadStatus;
    @JsonProperty("use_dynamic_click_url")
    private Boolean useDynamicClickUrl;
    @JsonProperty("media_subtypes")
    private List<String> mediaSubtypes = null;
    @JsonProperty("size_in_bytes")
    private Integer sizeInBytes;
    @JsonProperty("is_self_audited")
    private Boolean isSelfAudited;
    @JsonProperty("no_adservers")
    private Boolean noAdservers;
    @JsonProperty("text_title")
    private String textTitle;
    @JsonProperty("text_description")
    private String textDescription;
    @JsonProperty("text_display_url")
    private String textDisplayUrl;
    @JsonProperty("click_action")
    private String clickAction;
    @JsonProperty("click_target")
    private String clickTarget;
    @JsonProperty("ssl_status")
    private String sslStatus;
    @JsonProperty("allow_ssl_audit")
    private Boolean allowSslAudit;
    @JsonProperty("media_url_secure")
    private String mediaUrlSecure;
    @JsonProperty("content_secure")
    private String contentSecure;
    @JsonProperty("original_content_secure")
    private String originalContentSecure;
    @JsonProperty("flash_backup_url_secure")
    private String flashBackupUrlSecure;
    @JsonProperty("is_hosted")
    private Boolean isHosted;
    @JsonProperty("content_source")
    private String contentSource;
    @JsonProperty("landing_page_url")
    private String landingPageUrl;
    @JsonProperty("thirdparty_creative_id")
    private String thirdpartyCreativeId;
    @JsonProperty("thirdparty_campaign_id")
    private String thirdpartyCampaignId;
    @JsonProperty("facebook_audit_status")
    private String facebookAuditStatus;
    @JsonProperty("facebook_audit_feedback")
    private String facebookAuditFeedback;
    /*
    @JsonProperty("custom_request_template")
    private Object customRequestTemplate;*/
    @JsonProperty("language")
    private Language language;
   
    private Integer languageId;
    /*
    @JsonProperty("pop_values")
    private Object popValues;
    @JsonProperty("brand")
    private Brand brand;
    
    @JsonProperty("template")
    private Object template;*/
 
    @JsonProperty("ios_ssl_audit")
    private IosSslAudit iosSslAudit;
    //hlp
    private String iosSslAuditStatus;
    private String iosSslAuditFeedback;
    /*@JsonProperty("adx_audit")
    private Object adxAudit;*/    
    @JsonProperty("segments")
    private List<Segment> segments = null;   
    @JsonProperty("competitive_brands")
    private List<Brand> competitiveBrands;
    @JsonProperty("competitive_categories")
    private List<Category> competitiveCategories;
    /*
    @JsonProperty("pixels")
    private List<Object> pixels = null;*/
    /*
    @JsonProperty("mobile")
    private Mobile mobile;
    */
    /*
    @JsonProperty("video_attribute")
    private Object videoAttribute;*/
    /*
    @JsonProperty("media_assets")
    private List<Object> mediaAssets = null;
    */
    @JsonProperty("sla")
    private Integer sla;
    /*
    @JsonProperty("thirdparty_pixels")
    private Object thirdpartyPixels;
    */
    /*
    @JsonProperty("native")
    private Object _native;
   
    @JsonProperty("native_attribute")
    private Object nativeAttribute;
     */
    /*
    @JsonProperty("click_trackers")
    private Object clickTrackers;
    @JsonProperty("impression_trackers")
    private Object impressionTrackers;
    
    @JsonProperty("thirdparty_viewability_providers")
    private Object thirdpartyViewabilityProviders;
    */
    @JsonProperty("status")
    private Status status;
    //hlp
    private Boolean userReady;
    private Boolean hostedAssetsAssociationComplete;
    @JsonProperty("sla_eta")
    private String slaEta;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("type")
    private String type;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("brand_id")
    public Integer getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("media_url")
    public String getMediaUrl() {
        return mediaUrl;
    }

    @JsonProperty("media_url")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("code2")
    public String getCode2() {
        return code2;
    }

    @JsonProperty("code2")
    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @JsonProperty("member_id")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("member_id")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("click_track_result")
    public String getClickTrackResult() {
        return clickTrackResult;
    }

    @JsonProperty("click_track_result")
    public void setClickTrackResult(String clickTrackResult) {
        this.clickTrackResult = clickTrackResult;
    }

    @JsonProperty("advertiser_id")
    public Integer getAdvertiserId() {
        return advertiserId;
    }

    @JsonProperty("advertiser_id")
    public void setAdvertiserId(Integer advertiserId) {
        this.advertiserId = advertiserId;
    }

    @JsonProperty("publisher_id")
    public Integer getPublisherId() {
        return publisherId;
    }

    @JsonProperty("publisher_id")
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("click_url")
    public String getClickUrl() {
        return clickUrl;
    }

    @JsonProperty("click_url")
    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    @JsonProperty("flash_click_variable")
    public String getFlashClickVariable() {
        return flashClickVariable;
    }

    @JsonProperty("flash_click_variable")
    public void setFlashClickVariable(String flashClickVariable) {
        this.flashClickVariable = flashClickVariable;
    }

    @JsonProperty("no_iframes")
    public Boolean getNoIframes() {
        return noIframes;
    }

    @JsonProperty("no_iframes")
    public void setNoIframes(Boolean noIframes) {
        this.noIframes = noIframes;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("original_content")
    public String getOriginalContent() {
        return originalContent;
    }

    @JsonProperty("original_content")
    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    @JsonProperty("file_name")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("track_clicks")
    public Boolean getTrackClicks() {
        return trackClicks;
    }

    @JsonProperty("track_clicks")
    public void setTrackClicks(Boolean trackClicks) {
        this.trackClicks = trackClicks;
    }

    @JsonProperty("audit_status")
    public String getAuditStatus() {
        return auditStatus;
    }

    @JsonProperty("audit_status")
    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @JsonProperty("macros")
    public String getMacros() {
        return macros;
    }

    @JsonProperty("macros")
    public void setMacros(String macros) {
        this.macros = macros;
    }

    @JsonProperty("profile_id")
    public Integer getProfileId() {
        return profileId;
    }

    @JsonProperty("profile_id")
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    @JsonProperty("audit_feedback")
    public String getAuditFeedback() {
        return auditFeedback;
    }

    @JsonProperty("audit_feedback")
    public void setAuditFeedback(String auditFeedback) {
        this.auditFeedback = auditFeedback;
    }

    @JsonProperty("is_prohibited")
    public Boolean getIsProhibited() {
        return isProhibited;
    }

    @JsonProperty("is_prohibited")
    public void setIsProhibited(Boolean isProhibited) {
        this.isProhibited = isProhibited;
    }

    @JsonProperty("created_on")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("created_on")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("flash_backup_url")
    public String getFlashBackupUrl() {
        return flashBackupUrl;
    }

    @JsonProperty("flash_backup_url")
    public void setFlashBackupUrl(String flashBackupUrl) {
        this.flashBackupUrl = flashBackupUrl;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("is_control")
    public Boolean getIsControl() {
        return isControl;
    }

    @JsonProperty("is_control")
    public void setIsControl(Boolean isControl) {
        this.isControl = isControl;
    }

    @JsonProperty("allow_audit")
    public Boolean getAllowAudit() {
        return allowAudit;
    }

    @JsonProperty("allow_audit")
    public void setAllowAudit(Boolean allowAudit) {
        this.allowAudit = allowAudit;
    }

    @JsonProperty("is_expired")
    public Boolean getIsExpired() {
        return isExpired;
    }

    @JsonProperty("is_expired")
    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }

    @JsonProperty("creative_upload_status")
    public String getCreativeUploadStatus() {
        return creativeUploadStatus;
    }

    @JsonProperty("creative_upload_status")
    public void setCreativeUploadStatus(String creativeUploadStatus) {
        this.creativeUploadStatus = creativeUploadStatus;
    }

    @JsonProperty("backup_upload_status")
    public String getBackupUploadStatus() {
        return backupUploadStatus;
    }

    @JsonProperty("backup_upload_status")
    public void setBackupUploadStatus(String backupUploadStatus) {
        this.backupUploadStatus = backupUploadStatus;
    }

    @JsonProperty("use_dynamic_click_url")
    public Boolean getUseDynamicClickUrl() {
        return useDynamicClickUrl;
    }

    @JsonProperty("use_dynamic_click_url")
    public void setUseDynamicClickUrl(Boolean useDynamicClickUrl) {
        this.useDynamicClickUrl = useDynamicClickUrl;
    }

    @JsonProperty("media_subtypes")
    public List<String> getMediaSubtypes() {
        return mediaSubtypes;
    }

    @JsonProperty("media_subtypes")
    public void setMediaSubtypes(List<String> mediaSubtypes) {
        this.mediaSubtypes = mediaSubtypes;
    }

    @JsonProperty("size_in_bytes")
    public Integer getSizeInBytes() {
        return sizeInBytes;
    }

    @JsonProperty("size_in_bytes")
    public void setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    @JsonProperty("is_self_audited")
    public Boolean getIsSelfAudited() {
        return isSelfAudited;
    }

    @JsonProperty("is_self_audited")
    public void setIsSelfAudited(Boolean isSelfAudited) {
        this.isSelfAudited = isSelfAudited;
    }

    @JsonProperty("no_adservers")
    public Boolean getNoAdservers() {
        return noAdservers;
    }

    @JsonProperty("no_adservers")
    public void setNoAdservers(Boolean noAdservers) {
        this.noAdservers = noAdservers;
    }

    @JsonProperty("text_title")
    public String getTextTitle() {
        return textTitle;
    }

    @JsonProperty("text_title")
    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    @JsonProperty("text_description")
    public String getTextDescription() {
        return textDescription;
    }

    @JsonProperty("text_description")
    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    @JsonProperty("text_display_url")
    public String getTextDisplayUrl() {
        return textDisplayUrl;
    }

    @JsonProperty("text_display_url")
    public void setTextDisplayUrl(String textDisplayUrl) {
        this.textDisplayUrl = textDisplayUrl;
    }

    @JsonProperty("click_action")
    public String getClickAction() {
        return clickAction;
    }

    @JsonProperty("click_action")
    public void setClickAction(String clickAction) {
        this.clickAction = clickAction;
    }

    @JsonProperty("click_target")
    public String getClickTarget() {
        return clickTarget;
    }

    @JsonProperty("click_target")
    public void setClickTarget(String clickTarget) {
        this.clickTarget = clickTarget;
    }

    @JsonProperty("ssl_status")
    public String getSslStatus() {
        return sslStatus;
    }

    @JsonProperty("ssl_status")
    public void setSslStatus(String sslStatus) {
        this.sslStatus = sslStatus;
    }

    @JsonProperty("allow_ssl_audit")
    public Boolean getAllowSslAudit() {
        return allowSslAudit;
    }

    @JsonProperty("allow_ssl_audit")
    public void setAllowSslAudit(Boolean allowSslAudit) {
        this.allowSslAudit = allowSslAudit;
    }

    @JsonProperty("media_url_secure")
    public String getMediaUrlSecure() {
        return mediaUrlSecure;
    }

    @JsonProperty("media_url_secure")
    public void setMediaUrlSecure(String mediaUrlSecure) {
        this.mediaUrlSecure = mediaUrlSecure;
    }

    @JsonProperty("content_secure")
    public String getContentSecure() {
        return contentSecure;
    }

    @JsonProperty("content_secure")
    public void setContentSecure(String contentSecure) {
        this.contentSecure = contentSecure;
    }

    @JsonProperty("original_content_secure")
    public String getOriginalContentSecure() {
        return originalContentSecure;
    }

    @JsonProperty("original_content_secure")
    public void setOriginalContentSecure(String originalContentSecure) {
        this.originalContentSecure = originalContentSecure;
    }

    @JsonProperty("flash_backup_url_secure")
    public String getFlashBackupUrlSecure() {
        return flashBackupUrlSecure;
    }

    @JsonProperty("flash_backup_url_secure")
    public void setFlashBackupUrlSecure(String flashBackupUrlSecure) {
        this.flashBackupUrlSecure = flashBackupUrlSecure;
    }

    @JsonProperty("is_hosted")
    public Boolean getIsHosted() {
        return isHosted;
    }

    @JsonProperty("is_hosted")
    public void setIsHosted(Boolean isHosted) {
        this.isHosted = isHosted;
    }

    @JsonProperty("content_source")
    public String getContentSource() {
        return contentSource;
    }

    @JsonProperty("content_source")
    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    @JsonProperty("landing_page_url")
    public String getLandingPageUrl() {
        return landingPageUrl;
    }

    @JsonProperty("landing_page_url")
    public void setLandingPageUrl(String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
    }

    @JsonProperty("thirdparty_creative_id")
    public String getThirdpartyCreativeId() {
        return thirdpartyCreativeId;
    }

    @JsonProperty("thirdparty_creative_id")
    public void setThirdpartyCreativeId(String thirdpartyCreativeId) {
        this.thirdpartyCreativeId = thirdpartyCreativeId;
    }

    @JsonProperty("thirdparty_campaign_id")
    public String getThirdpartyCampaignId() {
        return thirdpartyCampaignId;
    }

    @JsonProperty("thirdparty_campaign_id")
    public void setThirdpartyCampaignId(String thirdpartyCampaignId) {
        this.thirdpartyCampaignId = thirdpartyCampaignId;
    }

    @JsonProperty("facebook_audit_status")
    public String getFacebookAuditStatus() {
        return facebookAuditStatus;
    }

    @JsonProperty("facebook_audit_status")
    public void setFacebookAuditStatus(String facebookAuditStatus) {
        this.facebookAuditStatus = facebookAuditStatus;
    }

    @JsonProperty("facebook_audit_feedback")
    public String getFacebookAuditFeedback() {
        return facebookAuditFeedback;
    }

    @JsonProperty("facebook_audit_feedback")
    public void setFacebookAuditFeedback(String facebookAuditFeedback) {
        this.facebookAuditFeedback = facebookAuditFeedback;
    }
/*
    @JsonProperty("custom_request_template")
    public Object getCustomRequestTemplate() {
        return customRequestTemplate;
    }

    @JsonProperty("custom_request_template")
    public void setCustomRequestTemplate(Object customRequestTemplate) {
        this.customRequestTemplate = customRequestTemplate;
    }
*/
     public Integer getLanguageId() {
    	if (language != null) {
        return language.getId();
    	}
    	return null;
    }
     public Integer getLanguage() {
    	 return null;
     }

    @JsonProperty("language")
    public void setLanguage(Language language) {
        this.language = language;
    }

  /*  @JsonProperty("pop_values")
    public Object getPopValues() {
        return popValues;
    }

    @JsonProperty("pop_values")
    public void setPopValues(Object popValues) {
        this.popValues = popValues;
    }
*/
   /* @JsonProperty("brand")
    public Brand getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(Brand brand) {
        this.brand = brand;
    }*/

    @JsonProperty("template")
    public Object getTemplate() {
    	// not imeplemented yet
        return null;
    }

    @JsonProperty("template")
    public void setTemplate(Object template) {
    	// not imeplemented yet
    }

    public String getIosSslAuditStatus() {
    	if (iosSslAudit != null) {
    		return iosSslAudit.getAuditStatus();
    	}
    	return "";
    }
    public String getIosSslAuditFeedback() {
    	if (iosSslAudit != null) {
    		return iosSslAudit.getAuditFeedback();
    	}
    	return "";
    }
    public IosSslAudit getIosSslAudit() {
    	return null;
    }

    @JsonProperty("ios_ssl_audit")
    public void setIosSslAudit(IosSslAudit iosSslAudit) {
        this.iosSslAudit = iosSslAudit;
    }
/*
    @JsonProperty("adx_audit")
    public Object getAdxAudit() {
        return adxAudit;
    }

    @JsonProperty("adx_audit")
    public void setAdxAudit(Object adxAudit) {
        this.adxAudit = adxAudit;
    }

    @JsonProperty("thirdparty_page")
    public Object getThirdpartyPage() {
        return thirdpartyPage;
    }

    @JsonProperty("thirdparty_page")
    public void setThirdpartyPage(Object thirdpartyPage) {
        this.thirdpartyPage = thirdpartyPage;
    }

    @JsonProperty("custom_macros")
    public Object getCustomMacros() {
        return customMacros;
    }

    @JsonProperty("custom_macros")
    public void setCustomMacros(Object customMacros) {
        this.customMacros = customMacros;
    }
*/
    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

   /* @JsonProperty("line_items")
    public Object getLineItems() {
        return lineItems;
    }

    @JsonProperty("line_items")
    public void setLineItems(Object lineItems) {
        this.lineItems = lineItems;
    }*/

    @JsonProperty("competitive_brands")
    public  List<Brand> getCompetitiveBrands() {
        return competitiveBrands;
    }

    @JsonProperty("competitive_brands")
    public void setCompetitiveBrands( List<Brand> competitiveBrands) {
        this.competitiveBrands = competitiveBrands;
    }

    @JsonProperty("competitive_categories")
    public  List<Category> getCompetitiveCategories() {
        return competitiveCategories;
    }

    @JsonProperty("competitive_categories")
    public void setCompetitiveCategories( List<Category> competitiveCategories) {
        this.competitiveCategories = competitiveCategories;
    }

    @JsonProperty("pixels")
    public List<Object> getPixels() {
    	// not imeplemented yet
        return null;
    }

    @JsonProperty("pixels")
    public void setPixels(List<Object> pixels) {
    	// not imeplemented yet
    }

  /*  @JsonProperty("mobile")
    public Mobile getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("video_attribute")
    public Object getVideoAttribute() {
        return videoAttribute;
    }

    @JsonProperty("video_attribute")
    public void setVideoAttribute(Object videoAttribute) {
        this.videoAttribute = videoAttribute;
    }
*/
    @JsonProperty("media_assets")
    public List<Object> getMediaAssets() {
    	// not imeplemented yet
        return null;
    }

    @JsonProperty("media_assets")
    public void setMediaAssets(List<Object> mediaAssets) {
    	// not imeplemented yet
       
    }

    @JsonProperty("sla")
    public Integer getSla() {
        return sla;
    }

    @JsonProperty("sla")
    public void setSla(Integer sla) {
        this.sla = sla;
    }
/*
    @JsonProperty("thirdparty_pixels")
    public Object getThirdpartyPixels() {
        return thirdpartyPixels;
    }

    @JsonProperty("thirdparty_pixels")
    public void setThirdpartyPixels(Object thirdpartyPixels) {
        this.thirdpartyPixels = thirdpartyPixels;
    }

    @JsonProperty("native")
    public Object getNative() {
        return _native;
    }

    @JsonProperty("native")
    public void setNative(Object _native) {
        this._native = _native;
    }

    @JsonProperty("native_attribute")
    public Object getNativeAttribute() {
        return nativeAttribute;
    }

    @JsonProperty("native_attribute")
    public void setNativeAttribute(Object nativeAttribute) {
        this.nativeAttribute = nativeAttribute;
    }

    @JsonProperty("click_trackers")
    public Object getClickTrackers() {
        return clickTrackers;
    }

    @JsonProperty("click_trackers")
    public void setClickTrackers(Object clickTrackers) {
        this.clickTrackers = clickTrackers;
    }

    @JsonProperty("impression_trackers")
    public Object getImpressionTrackers() {
        return impressionTrackers;
    }

    @JsonProperty("impression_trackers")
    public void setImpressionTrackers(Object impressionTrackers) {
        this.impressionTrackers = impressionTrackers;
    }

    @JsonProperty("thirdparty_viewability_providers")
    public Object getThirdpartyViewabilityProviders() {
        return thirdpartyViewabilityProviders;
    }

    @JsonProperty("thirdparty_viewability_providers")
    public void setThirdpartyViewabilityProviders(Object thirdpartyViewabilityProviders) {
        this.thirdpartyViewabilityProviders = thirdpartyViewabilityProviders;
    }
*/
    
	public Boolean getHostedAssetsAssociationComplete() {
		if (status != null) {
			return status.getHostedAssetsAssociationComplete();
		}
		return false;
	}

	public Boolean getUserReady() {
		if (status != null) {
			return status.getUserReady();
		}
		return false;
	}
	//temp hack beacause of parser
	public Status getStatus() {
		return null;
	}

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("sla_eta")
    public String getSlaEta() {
        return slaEta;
    }

    @JsonProperty("sla_eta")
    public void setSlaEta(String slaEta) {
        this.slaEta = slaEta;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

}
