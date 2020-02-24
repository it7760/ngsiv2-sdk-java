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
 * RetrieveApiResourcesResponse
 */
@JsonPropertyOrder({
  RetrieveApiResourcesResponse.JSON_PROPERTY_ENTITIES_URL,
  RetrieveApiResourcesResponse.JSON_PROPERTY_TYPES_URL,
  RetrieveApiResourcesResponse.JSON_PROPERTY_SUBSCRIPTIONS_URL,
  RetrieveApiResourcesResponse.JSON_PROPERTY_REGISTRATIONS_URL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:35:36.823283+02:00[Europe/Athens]")
public class RetrieveApiResourcesResponse {
  public static final String JSON_PROPERTY_ENTITIES_URL = "entities_url";
  private String entitiesUrl;

  public static final String JSON_PROPERTY_TYPES_URL = "types_url";
  private String typesUrl;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS_URL = "subscriptions_url";
  private String subscriptionsUrl;

  public static final String JSON_PROPERTY_REGISTRATIONS_URL = "registrations_url";
  private String registrationsUrl;


  public RetrieveApiResourcesResponse entitiesUrl(String entitiesUrl) {
    
    this.entitiesUrl = entitiesUrl;
    return this;
  }

   /**
   * URL which points to the entities resource
   * @return entitiesUrl
  **/
  @ApiModelProperty(example = "/v2/entities", required = true, value = "URL which points to the entities resource")
  @JsonProperty(JSON_PROPERTY_ENTITIES_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntitiesUrl() {
    return entitiesUrl;
  }


  public void setEntitiesUrl(String entitiesUrl) {
    this.entitiesUrl = entitiesUrl;
  }


  public RetrieveApiResourcesResponse typesUrl(String typesUrl) {
    
    this.typesUrl = typesUrl;
    return this;
  }

   /**
   * URL which points to the types resource
   * @return typesUrl
  **/
  @ApiModelProperty(example = "/v2/types", required = true, value = "URL which points to the types resource")
  @JsonProperty(JSON_PROPERTY_TYPES_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTypesUrl() {
    return typesUrl;
  }


  public void setTypesUrl(String typesUrl) {
    this.typesUrl = typesUrl;
  }


  public RetrieveApiResourcesResponse subscriptionsUrl(String subscriptionsUrl) {
    
    this.subscriptionsUrl = subscriptionsUrl;
    return this;
  }

   /**
   * URL which points to the subscriptions resource
   * @return subscriptionsUrl
  **/
  @ApiModelProperty(example = "/v2/subscriptions", required = true, value = "URL which points to the subscriptions resource")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionsUrl() {
    return subscriptionsUrl;
  }


  public void setSubscriptionsUrl(String subscriptionsUrl) {
    this.subscriptionsUrl = subscriptionsUrl;
  }


  public RetrieveApiResourcesResponse registrationsUrl(String registrationsUrl) {
    
    this.registrationsUrl = registrationsUrl;
    return this;
  }

   /**
   * URL which points to the registrations resource
   * @return registrationsUrl
  **/
  @ApiModelProperty(example = "/v2/registrations", required = true, value = "URL which points to the registrations resource")
  @JsonProperty(JSON_PROPERTY_REGISTRATIONS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegistrationsUrl() {
    return registrationsUrl;
  }


  public void setRegistrationsUrl(String registrationsUrl) {
    this.registrationsUrl = registrationsUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveApiResourcesResponse retrieveApiResourcesResponse = (RetrieveApiResourcesResponse) o;
    return Objects.equals(this.entitiesUrl, retrieveApiResourcesResponse.entitiesUrl) &&
        Objects.equals(this.typesUrl, retrieveApiResourcesResponse.typesUrl) &&
        Objects.equals(this.subscriptionsUrl, retrieveApiResourcesResponse.subscriptionsUrl) &&
        Objects.equals(this.registrationsUrl, retrieveApiResourcesResponse.registrationsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesUrl, typesUrl, subscriptionsUrl, registrationsUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveApiResourcesResponse {\n");
    sb.append("    entitiesUrl: ").append(toIndentedString(entitiesUrl)).append("\n");
    sb.append("    typesUrl: ").append(toIndentedString(typesUrl)).append("\n");
    sb.append("    subscriptionsUrl: ").append(toIndentedString(subscriptionsUrl)).append("\n");
    sb.append("    registrationsUrl: ").append(toIndentedString(registrationsUrl)).append("\n");
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

