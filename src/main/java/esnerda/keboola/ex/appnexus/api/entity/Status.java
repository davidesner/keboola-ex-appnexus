
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user_ready",
    "hosted_assets_association_complete"
})
public class Status {

    @JsonProperty("user_ready")
    private Boolean userReady;
    @JsonProperty("hosted_assets_association_complete")
    private Boolean hostedAssetsAssociationComplete;

    @JsonProperty("user_ready")
    public Boolean getUserReady() {
        return userReady;
    }

    @JsonProperty("user_ready")
    public void setUserReady(Boolean userReady) {
        this.userReady = userReady;
    }

    @JsonProperty("hosted_assets_association_complete")
    public Boolean getHostedAssetsAssociationComplete() {
        return hostedAssetsAssociationComplete;
    }

    @JsonProperty("hosted_assets_association_complete")
    public void setHostedAssetsAssociationComplete(Boolean hostedAssetsAssociationComplete) {
        this.hostedAssetsAssociationComplete = hostedAssetsAssociationComplete;
    }

}
