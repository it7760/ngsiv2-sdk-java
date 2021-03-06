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

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.GetAttributeDataResponse;
import org.openapitools.client.model.UpdateAttributeDataRequest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-24T16:35:36.823283+02:00[Europe/Athens]")
public class AttributesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;

  public AttributesApi() {
    this(new ApiClient());
  }

  public AttributesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
  }

  /**
   * Get attribute data
   * Returns a JSON object with the attribute data of the attribute. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 200 OK. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param entityId Id of the entity (required)
   * @param attrName Name of the attribute to be retrieved. (required)
   * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
   * @param metadata A list of metadata names to include in the response. See \&quot;Filtering out attributes and metadata\&quot; section for more detail. (optional)
   * @return GetAttributeDataResponse
   * @throws ApiException if fails to make API call
   */
  public GetAttributeDataResponse getAttributeData(String entityId, String attrName, String type, String metadata) throws ApiException {
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling getAttributeData");
    }
    // verify the required parameter 'attrName' is set
    if (attrName == null) {
      throw new ApiException(400, "Missing the required parameter 'attrName' when calling getAttributeData");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/entities/{entityId}/attrs/{attrName}"
        .replace("{entityId}", ApiClient.urlEncode(entityId.toString()))
        .replace("{attrName}", ApiClient.urlEncode(attrName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("metadata", metadata));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "getAttributeData call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetAttributeDataResponse>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Remove a Single Attribute
   * Removes an entity attribute. Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param entityId Id of the entity. (required)
   * @param attrName Attribute name. (required)
   * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
   * @throws ApiException if fails to make API call
   */
  public void removeASingleAttribute(String entityId, String attrName, String type) throws ApiException {
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling removeASingleAttribute");
    }
    // verify the required parameter 'attrName' is set
    if (attrName == null) {
      throw new ApiException(400, "Missing the required parameter 'attrName' when calling removeASingleAttribute");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/entities/{entityId}/attrs/{attrName}"
        .replace("{entityId}", ApiClient.urlEncode(entityId.toString()))
        .replace("{attrName}", ApiClient.urlEncode(attrName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "removeASingleAttribute call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update Attribute Data
   * The request payload is an object representing the new attribute data. Previous attribute data is replaced by the one in the request. The object follows the JSON representation for attributes (described in \&quot;JSON Attribute Representation\&quot; section). Response: * Successful operation uses 204 No Content * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
   * @param entityId Id of the entity to update (required)
   * @param attrName Attribute name (required)
   * @param contentType  (required)
   * @param body  (required)
   * @param type Entity type, to avoid ambiguity in case there are several entities with the same entity id. (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateAttributeData(String entityId, String attrName, String contentType, UpdateAttributeDataRequest body, String type) throws ApiException {
    // verify the required parameter 'entityId' is set
    if (entityId == null) {
      throw new ApiException(400, "Missing the required parameter 'entityId' when calling updateAttributeData");
    }
    // verify the required parameter 'attrName' is set
    if (attrName == null) {
      throw new ApiException(400, "Missing the required parameter 'attrName' when calling updateAttributeData");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling updateAttributeData");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAttributeData");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v2/entities/{entityId}/attrs/{attrName}"
        .replace("{entityId}", ApiClient.urlEncode(entityId.toString()))
        .replace("{attrName}", ApiClient.urlEncode(attrName.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("type", type));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }

      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (localVarResponse.statusCode()/ 100 != 2) {
        throw new ApiException(localVarResponse.statusCode(),
            "updateAttributeData call received non-success response",
            localVarResponse.headers(),
            localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }

    } catch (IOException e) {
      throw new ApiException(e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
