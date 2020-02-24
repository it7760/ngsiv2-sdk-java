/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateOrAppendEntityAttributesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:28:19.559+02:00")
public class UpdateOrAppendEntityAttributesRequest {
  @SerializedName("ambientNoise")
  private Object ambientNoise = null;

  public UpdateOrAppendEntityAttributesRequest ambientNoise(Object ambientNoise) {
    this.ambientNoise = ambientNoise;
    return this;
  }

   /**
   * 
   * @return ambientNoise
  **/
  @ApiModelProperty(example = "{\"value\":31.5}", required = true, value = "")
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

