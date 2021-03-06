/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UpdateOrAppendEntityAttributesRequest
 */
@JsonPropertyOrder({
  UpdateOrAppendEntityAttributesRequest.JSON_PROPERTY_AMBIENT_NOISE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:35:36.823283+02:00[Europe/Athens]")
public class UpdateOrAppendEntityAttributesRequest {
  public static final String JSON_PROPERTY_AMBIENT_NOISE = "ambientNoise";
  private Object ambientNoise;


  public UpdateOrAppendEntityAttributesRequest ambientNoise(Object ambientNoise) {
    
    this.ambientNoise = ambientNoise;
    return this;
  }

   /**
   * 
   * @return ambientNoise
  **/
  @ApiModelProperty(example = "{\"value\":31.5}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMBIENT_NOISE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAmbientNoise() {
    return ambientNoise;
  }


  public void setAmbientNoise(Object ambientNoise) {
    this.ambientNoise = ambientNoise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrAppendEntityAttributesRequest updateOrAppendEntityAttributesRequest = (UpdateOrAppendEntityAttributesRequest) o;
    return Objects.equals(this.ambientNoise, updateOrAppendEntityAttributesRequest.ambientNoise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ambientNoise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrAppendEntityAttributesRequest {\n");
    sb.append("    ambientNoise: ").append(toIndentedString(ambientNoise)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

