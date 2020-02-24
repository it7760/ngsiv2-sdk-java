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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.NotifyRequest;
import io.swagger.client.model.QueryRequest;
import io.swagger.client.model.QueryResponse;
import io.swagger.client.model.UpdateRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchOperationsApi {
    private ApiClient apiClient;

    public BatchOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for notify
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call notifyCall(String contentType, NotifyRequest body, String options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/op/notify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (options != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("options", options));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call notifyValidateBeforeCall(String contentType, NotifyRequest body, String options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling notify(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling notify(Async)");
        }
        

        com.squareup.okhttp.Call call = notifyCall(contentType, body, options, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void notify(String contentType, NotifyRequest body, String options) throws ApiException {
        notifyWithHttpInfo(contentType, body, options);
    }

    /**
     * Notify
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> notifyWithHttpInfo(String contentType, NotifyRequest body, String options) throws ApiException {
        com.squareup.okhttp.Call call = notifyValidateBeforeCall(contentType, body, options, null, null);
        return apiClient.execute(call);
    }

    /**
     * Notify (asynchronously)
     * This operation is intended to consume a notification payload so that all the entity data included by such notification is persisted, overwriting if necessary. This operation is useful when one NGSIv2 endpoint is subscribed to another NGSIv2 endpoint (federation scenarios).  The request payload must be an NGSIv2 notification payload.  The behaviour must be exactly the same as &#x60;POST /v2/op/update&#x60; with &#x60;actionType&#x60; equal to &#x60;append&#x60;. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call notifyAsync(String contentType, NotifyRequest body, String options, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = notifyValidateBeforeCall(contentType, body, options, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for query
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryCall(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/op/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderBy", orderBy));
        if (options != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("options", options));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryValidateBeforeCall(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling query(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling query(Async)");
        }
        

        com.squareup.okhttp.Call call = queryCall(contentType, body, limit, offset, orderBy, options, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @return List&lt;QueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<QueryResponse> query(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws ApiException {
        ApiResponse<List<QueryResponse>> resp = queryWithHttpInfo(contentType, body, limit, offset, orderBy, options);
        return resp.getData();
    }

    /**
     * Query
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @return ApiResponse&lt;List&lt;QueryResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<QueryResponse>> queryWithHttpInfo(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options) throws ApiException {
        com.squareup.okhttp.Call call = queryValidateBeforeCall(contentType, body, limit, offset, orderBy, options, null, null);
        Type localVarReturnType = new TypeToken<List<QueryResponse>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Query (asynchronously)
     * The response payload is an Array containing one object per matching entity, or an empty array &#x60;[]&#x60; if  no entities are found. The entities follow the JSON entity representation format (described in the section \&quot;JSON Entity Representation\&quot;). The payload may contain the following elements (all of them optional): + &#x60;entities&#x60;: a list of entites to search for. Each element is represented by a JSON object with the   following elements:     + &#x60;id&#x60; or &#x60;idPattern&#x60;: Id or pattern of the affected entities. Both cannot be used at the same       time, but one of them must be present.     + &#x60;type&#x60; or &#x60;typePattern&#x60;: Type or type pattern of the entities to search for. Both cannot be used at       the same time. If omitted, it means \&quot;any entity type\&quot;. + &#x60;attrs&#x60;: List of attributes to be provided (if not specified, all attributes). + &#x60;expression&#x60;: an expression composed of &#x60;q&#x60;, &#x60;mq&#x60;, &#x60;georel&#x60;, &#x60;geometry&#x60; and &#x60;coords&#x60; (see \&quot;List    entities\&quot; operation above about this field). + &#x60;metadata&#x60;: a list of metadata names to include in the response.    See \&quot;Filtering out attributes and metadata\&quot; section for more detail. Response code: * Successful operation uses 200 OK * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param limit Limit the number of entities to be retrieved. (optional)
     * @param offset Skip a number of records. (optional)
     * @param orderBy Criteria for ordering results. See \&quot;Ordering Results\&quot; section for details. (optional)
     * @param options Options dictionary (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryAsync(String contentType, QueryRequest body, Double limit, Double offset, String orderBy, String options, final ApiCallback<List<QueryResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = queryValidateBeforeCall(contentType, body, limit, offset, orderBy, options, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<QueryResponse>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(String contentType, UpdateRequest body, String options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v2/op/update";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (options != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("options", options));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateValidateBeforeCall(String contentType, UpdateRequest body, String options, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling update(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(contentType, body, options, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void update(String contentType, UpdateRequest body, String options) throws ApiException {
        updateWithHttpInfo(contentType, body, options);
    }

    /**
     * Update
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWithHttpInfo(String contentType, UpdateRequest body, String options) throws ApiException {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(contentType, body, options, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update (asynchronously)
     * This operation allows to create, update and/or delete several entities in a single batch operation. The payload is an object with two properties: + &#x60;actionType&#x60;, to specify the kind of update action to do: either &#x60;append&#x60;, &#x60;appendStrict&#x60;, &#x60;update&#x60;,   &#x60;delete&#x60;, or &#x60;replace&#x60;. + &#x60;entities&#x60;, an array of entities, each entity specified using the JSON entity representation format   (described in the section \&quot;JSON Entity Representation\&quot;). This operation is split in as many individual operations as entities in the &#x60;entities&#x60; vector, so the &#x60;actionType&#x60; is executed for each one of them. Depending on the &#x60;actionType&#x60;, a mapping with regular non-batch operations can be done: * &#x60;append&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or &#x60;POST /v2/entities/&lt;id&gt;/attrs&#x60;   (if the entity already exists). * &#x60;appendStrict&#x60;: maps to &#x60;POST /v2/entities&#x60; (if the entity does not already exist) or   &#x60;POST /v2/entities/&lt;id&gt;/attrs?options&#x3D;append&#x60; (if the entity already exists). * &#x60;update&#x60;: maps to &#x60;PATCH /v2/entities/&lt;id&gt;/attrs&#x60;. * &#x60;delete&#x60;: maps to &#x60;DELETE /v2/entities/&lt;id&gt;/attrs/&lt;attrName&gt;&#x60; on every attribute included in the entity or   to &#x60;DELETE /v2/entities/&lt;id&gt;&#x60; if no attribute were included in the entity. * &#x60;replace&#x60;: maps to &#x60;PUT /v2/entities/&lt;id&gt;/attrs&#x60;. Response: * Successful operation uses 204 No Content. * Errors use a non-2xx and (optionally) an error payload. See subsection on \&quot;Error Responses\&quot; for   more details.
     * @param contentType  (required)
     * @param body  (required)
     * @param options Options dictionary (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(String contentType, UpdateRequest body, String options, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateValidateBeforeCall(contentType, body, options, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}