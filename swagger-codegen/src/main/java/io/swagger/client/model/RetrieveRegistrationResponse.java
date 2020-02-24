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
 * RetrieveRegistrationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:28:19.559+02:00")
public class RetrieveRegistrationResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("dataProvided")
  private Object dataProvided = null;

  @SerializedName("provider")
  private Object provider = null;

  @SerializedName("expires")
  private String expires = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("forwardingInformation")
  private Object forwardingInformation = null;

  public RetrieveRegistrationResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "abcdefg", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RetrieveRegistrationResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "Example Context Source", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RetrieveRegistrationResponse dataProvided(Object dataProvided) {
    this.dataProvided = dataProvided;
    return this;
  }

   /**
   * 
   * @return dataProvided
  **/
  @ApiModelProperty(example = "{\"entities\":[{\"id\":\"Bcn_Welt\",\"type\":\"Room\"}],\"attrs\":[\"temperature\"]}", required = true, value = "")
  public Object getDataProvided() {
    return dataProvided;
  }

  public void setDataProvided(Object dataProvided) {
    this.dataProvided = dataProvided;
  }

  public RetrieveRegistrationResponse provider(Object provider) {
    this.provider = provider;
    return this;
  }

   /**
   * 
   * @return provider
  **/
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://contextsource.example.org\"},\"supportedForwardingMode\":\"all\"}", required = true, value = "")
  public Object getProvider() {
    return provider;
  }

  public void setProvider(Object provider) {
    this.provider = provider;
  }

  public RetrieveRegistrationResponse expires(String expires) {
    this.expires = expires;
    return this;
  }

   /**
   * 
   * @return expires
  **/
  @ApiModelProperty(example = "10/31/2017 12:00:00 PM", required = true, value = "")
  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public RetrieveRegistrationResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(example = "failed", required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RetrieveRegistrationResponse forwardingInformation(Object forwardingInformation) {
    this.forwardingInformation = forwardingInformation;
    return this;
  }

   /**
   * 
   * @return forwardingInformation
  **/
  @ApiModelProperty(example = "{\"timesSent\":12,\"lastForwarding\":\"2017-10-06T16:00:00Z\",\"lastFailure\":\"2017-10-06T16:00:00Z\",\"lastSuccess\":\"2017-10-05T18:25:00Z\"}", required = true, value = "")
  public Object getForwardingInformation() {
    return forwardingInformation;
  }

  public void setForwardingInformation(Object forwardingInformation) {
    this.forwardingInformation = forwardingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveRegistrationResponse retrieveRegistrationResponse = (RetrieveRegistrationResponse) o;
    return Objects.equals(this.id, retrieveRegistrationResponse.id) &&
        Objects.equals(this.description, retrieveRegistrationResponse.description) &&
        Objects.equals(this.dataProvided, retrieveRegistrationResponse.dataProvided) &&
        Objects.equals(this.provider, retrieveRegistrationResponse.provider) &&
        Objects.equals(this.expires, retrieveRegistrationResponse.expires) &&
        Objects.equals(this.status, retrieveRegistrationResponse.status) &&
        Objects.equals(this.forwardingInformation, retrieveRegistrationResponse.forwardingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, dataProvided, provider, expires, status, forwardingInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveRegistrationResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataProvided: ").append(toIndentedString(dataProvided)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    forwardingInformation: ").append(toIndentedString(forwardingInformation)).append("\n");
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

