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
 * RetrieveEntityAttributesResponse
 */
@JsonPropertyOrder({
  RetrieveEntityAttributesResponse.JSON_PROPERTY_TEMPERATURE,
  RetrieveEntityAttributesResponse.JSON_PROPERTY_HUMIDITY,
  RetrieveEntityAttributesResponse.JSON_PROPERTY_LOCATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:35:36.823283+02:00[Europe/Athens]")
public class RetrieveEntityAttributesResponse {
  public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
  private Object temperature;

  public static final String JSON_PROPERTY_HUMIDITY = "humidity";
  private Object humidity;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private Object location;


  public RetrieveEntityAttributesResponse temperature(Object temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * 
   * @return temperature
  **/
  @ApiModelProperty(example = "{\"value\":21.7,\"type\":\"Number\"}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TEMPERATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getTemperature() {
    return temperature;
  }


  public void setTemperature(Object temperature) {
    this.temperature = temperature;
  }


  public RetrieveEntityAttributesResponse humidity(Object humidity) {
    
    this.humidity = humidity;
    return this;
  }

   /**
   * 
   * @return humidity
  **/
  @ApiModelProperty(example = "{\"value\":60,\"type\":\"Number\"}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HUMIDITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getHumidity() {
    return humidity;
  }


  public void setHumidity(Object humidity) {
    this.humidity = humidity;
  }


  public RetrieveEntityAttributesResponse location(Object location) {
    
    this.location = location;
    return this;
  }

   /**
   * 
   * @return location
  **/
  @ApiModelProperty(example = "{\"value\":\"41.3763726, 2.1864475\",\"type\":\"geo:point\",\"metadata\":{\"crs\":{\"value\":\"WGS84\",\"type\":\"Text\"}}}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getLocation() {
    return location;
  }


  public void setLocation(Object location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEntityAttributesResponse retrieveEntityAttributesResponse = (RetrieveEntityAttributesResponse) o;
    return Objects.equals(this.temperature, retrieveEntityAttributesResponse.temperature) &&
        Objects.equals(this.humidity, retrieveEntityAttributesResponse.humidity) &&
        Objects.equals(this.location, retrieveEntityAttributesResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature, humidity, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityAttributesResponse {\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
