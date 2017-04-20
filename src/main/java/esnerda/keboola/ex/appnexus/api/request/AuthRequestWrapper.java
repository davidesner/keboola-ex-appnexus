
package esnerda.keboola.ex.appnexus.api.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "auth"
})
public class AuthRequestWrapper {

    public AuthRequestWrapper(String username, String password) {
		super();
		this.auth = new AuthRequest(username, password);
	}

	@JsonProperty("auth")
    private AuthRequest auth;

    @JsonProperty("auth")
    public AuthRequest getAuth() {
        return auth;
    }

    @JsonProperty("auth")
    public void setAuth(AuthRequest auth) {
        this.auth = auth;
    }

}
