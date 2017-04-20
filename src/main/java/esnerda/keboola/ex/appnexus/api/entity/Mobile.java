
package esnerda.keboola.ex.appnexus.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mobile {

    @JsonProperty("alternative_landing_page_url")
    private String alternativeLandingPageUrl;

    @JsonProperty("alternative_landing_page_url")
    public String getAlternativeLandingPageUrl() {
        return alternativeLandingPageUrl;
    }

    @JsonProperty("alternative_landing_page_url")
    public void setAlternativeLandingPageUrl(String alternativeLandingPageUrl) {
        this.alternativeLandingPageUrl = alternativeLandingPageUrl;
    }

}
