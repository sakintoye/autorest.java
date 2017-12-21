/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyformdata.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodyformdata.Formdatas;
import fixtures.bodyformdata.models.ErrorException;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.InputStream;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Formdatas.
 */
public class FormdatasImpl implements Formdatas {
    /**
     * The RestProxy service to perform REST calls.
     */
    private FormdatasService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATFormDataServiceImpl client;

    /**
     * Initializes an instance of Formdatas.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public public FormdatasImpl(AutoRestSwaggerBATFormDataServiceImpl client) {
        this.service = RestProxy.create(FormdatasService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Formdatas to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface FormdatasService {
        // @Multipart not supported by RestProxy
        @POST("formdata/stream/uploadfile")
        // @Streaming not supported by RestProxy
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, InputStream>> uploadFile(/* @Part("fileContent") not supported by RestProxy */byte[] fileContent, /* @Part("fileName") not supported by RestProxy */String fileName);

        @Headers({ "x-ms-logging-context: fixtures.bodyformdata.Formdatas uploadFileViaBody" })
        @PUT("formdata/stream/uploadfile")
        // @Streaming not supported by RestProxy
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, InputStream>> uploadFileViaBody(@BodyParam("application/octet-stream") byte[] fileContent);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    public InputStream uploadFile(byte[] fileContent, String fileName) {
        return uploadFileAsync(fileContent, fileName).blockingGet();
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InputStream> uploadFileAsync(byte[] fileContent, String fileName, ServiceCallback<InputStream> serviceCallback) {
        return ServiceFuture.fromBody(uploadFileAsync(fileContent, fileName), serviceCallback);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<RestResponse<Void, InputStream>> uploadFileWithRestResponseAsync(byte[] fileContent, String fileName) {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        if (fileName == null) {
            throw new IllegalArgumentException("Parameter fileName is required and cannot be null.");
        }
        return service.uploadFile(fileContent, fileName);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param fileName File name to upload. Name has to be spelled exactly as written here.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Maybe<InputStream> uploadFileAsync(byte[] fileContent, String fileName) {
        return uploadFileWithRestResponseAsync(fileContent, fileName)
            .flatMapMaybe(new Function<RestResponse<Void, InputStream>, Maybe<InputStream>>() {
                public Maybe<InputStream> apply(RestResponse<Void, InputStream> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    public InputStream uploadFileViaBody(byte[] fileContent) {
        return uploadFileViaBodyAsync(fileContent).blockingGet();
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InputStream> uploadFileViaBodyAsync(byte[] fileContent, ServiceCallback<InputStream> serviceCallback) {
        return ServiceFuture.fromBody(uploadFileViaBodyAsync(fileContent), serviceCallback);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Single<RestResponse<Void, InputStream>> uploadFileViaBodyWithRestResponseAsync(byte[] fileContent) {
        if (fileContent == null) {
            throw new IllegalArgumentException("Parameter fileContent is required and cannot be null.");
        }
        return service.uploadFileViaBody(fileContent);
    }

    /**
     * Upload file.
     *
     * @param fileContent File to upload.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, InputStream> object
     */
    public Maybe<InputStream> uploadFileViaBodyAsync(byte[] fileContent) {
        return uploadFileViaBodyWithRestResponseAsync(fileContent)
            .flatMapMaybe(new Function<RestResponse<Void, InputStream>, Maybe<InputStream>>() {
                public Maybe<InputStream> apply(RestResponse<Void, InputStream> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
