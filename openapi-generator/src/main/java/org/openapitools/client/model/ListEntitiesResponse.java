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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ListEntitiesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:34:10.584388+02:00[Europe/Athens]")
public class ListEntitiesResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Object temperature;

  public static final String SERIALIZED_NAME_SPEED = "speed";
  @SerializedName(SERIALIZED_NAME_SPEED)
  private Object speed;


  public ListEntitiesResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(example = "Room", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListEntitiesResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "DC_S1-D41", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ListEntitiesResponse temperature(Object temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * 
   * @return temperature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"value\":35.6,\"type\":\"Number\",\"metadata\":{}}", value = "")

  public Object getTemperature() {
    return temperature;
  }


  public void setTemperature(Object temperature) {
    this.temperature = temperature;
  }


  public ListEntitiesResponse speed(Object speed) {
    
    this.speed = speed;
    return this;
  }

   /**
   * 
   * @return speed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"value\":100,\"type\":\"number\",\"metadata\":{\"accuracy\":{\"value\":2,\"type\":\"Number\"},\"timestamp\":{\"value\":\"2015-06-04T07:20:27.378Z\",\"type\":\"DateTime\"}}}", value = "")

  public Object getSpeed() {
    return speed;
  }


  public void setSpeed(Object speed) {
    this.speed = speed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEntitiesResponse listEntitiesResponse = (ListEntitiesResponse) o;
    return Objects.equals(this.type, listEntitiesResponse.type) &&
        Objects.equals(this.id, listEntitiesResponse.id) &&
        Objects.equals(this.temperature, listEntitiesResponse.temperature) &&
        Objects.equals(this.speed, listEntitiesResponse.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, temperature, speed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntitiesResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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

