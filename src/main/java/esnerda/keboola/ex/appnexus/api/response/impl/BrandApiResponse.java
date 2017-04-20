
package esnerda.keboola.ex.appnexus.api.response.impl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.ex.appnexus.api.entity.Brand;
import esnerda.keboola.ex.appnexus.api.response.ApiResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandApiResponse extends ApiResponse {

	@JsonProperty("brands")
	private List<Brand> brands = null;

	@JsonProperty("brands")
	public List<Brand> getBrands() {
		return brands;
	}

	@JsonProperty("brands")
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

}
