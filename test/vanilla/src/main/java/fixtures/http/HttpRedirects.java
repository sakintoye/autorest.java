/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.http.models.ErrorException;
import fixtures.http.models.HttpRedirectsDelete307Headers;
import fixtures.http.models.HttpRedirectsGet300Headers;
import fixtures.http.models.HttpRedirectsGet301Headers;
import fixtures.http.models.HttpRedirectsGet302Headers;
import fixtures.http.models.HttpRedirectsGet307Headers;
import fixtures.http.models.HttpRedirectsHead300Headers;
import fixtures.http.models.HttpRedirectsHead301Headers;
import fixtures.http.models.HttpRedirectsHead302Headers;
import fixtures.http.models.HttpRedirectsHead307Headers;
import fixtures.http.models.HttpRedirectsPatch302Headers;
import fixtures.http.models.HttpRedirectsPatch307Headers;
import fixtures.http.models.HttpRedirectsPost303Headers;
import fixtures.http.models.HttpRedirectsPost307Headers;
import fixtures.http.models.HttpRedirectsPut301Headers;
import fixtures.http.models.HttpRedirectsPut307Headers;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpRedirects.
 */
public interface HttpRedirects {
    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void head300();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> head300Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable head300Async();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsHead300Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsHead300Headers, Void>> head300WithRestResponseAsync();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> get300();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;List&lt;String&gt;&gt;} object
     */
    ServiceFuture<List<String>> get300Async(final ServiceCallback<List<String>> serviceCallback);

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;List&lt;String&gt;&gt;} object if successful.
     */
    Maybe<List<String>> get300Async();

    /**
     * Return 300 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsGet300Headers, List&lt;String&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsGet300Headers, List<String>>> get300WithRestResponseAsync();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void head301();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> head301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable head301Async();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsHead301Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsHead301Headers, Void>> head301WithRestResponseAsync();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void get301();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> get301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable get301Async();

    /**
     * Return 301 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsGet301Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsGet301Headers, Void>> get301WithRestResponseAsync();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void put301();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> put301Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable put301Async();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPut301Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPut301Headers, Void>> put301WithRestResponseAsync();

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void put301(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> put301Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable put301Async(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 301.  This request should not be automatically redirected, but should return the received 301 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPut301Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPut301Headers, Void>> put301WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void head302();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> head302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable head302Async();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsHead302Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsHead302Headers, Void>> head302WithRestResponseAsync();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void get302();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> get302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable get302Async();

    /**
     * Return 302 status code and redirect to /http/success/200.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsGet302Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsGet302Headers, Void>> get302WithRestResponseAsync();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void patch302();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> patch302Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable patch302Async();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPatch302Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPatch302Headers, Void>> patch302WithRestResponseAsync();

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void patch302(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> patch302Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable patch302Async(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 302.  This request should not be automatically redirected, but should return the received 302 to the caller for evaluation.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPatch302Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPatch302Headers, Void>> patch302WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void post303();

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> post303Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable post303Async();

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPost303Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPost303Headers, Void>> post303WithRestResponseAsync();

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void post303(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> post303Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable post303Async(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 303.  This request should be automatically redirected usign a get, ultimately returning a 200 status code.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPost303Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPost303Headers, Void>> post303WithRestResponseAsync(Boolean booleanValue);

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void head307();

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> head307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable head307Async();

    /**
     * Redirect with 307, resulting in a 200 success.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsHead307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsHead307Headers, Void>> head307WithRestResponseAsync();

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void get307();

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> get307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable get307Async();

    /**
     * Redirect get with 307, resulting in a 200 success.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsGet307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsGet307Headers, Void>> get307WithRestResponseAsync();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void put307();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> put307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable put307Async();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPut307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPut307Headers, Void>> put307WithRestResponseAsync();

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void put307(Boolean booleanValue);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> put307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable put307Async(Boolean booleanValue);

    /**
     * Put redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPut307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPut307Headers, Void>> put307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void patch307();

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> patch307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable patch307Async();

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPatch307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPatch307Headers, Void>> patch307WithRestResponseAsync();

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void patch307(Boolean booleanValue);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> patch307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable patch307Async(Boolean booleanValue);

    /**
     * Patch redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPatch307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPatch307Headers, Void>> patch307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void post307();

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> post307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable post307Async();

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPost307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPost307Headers, Void>> post307WithRestResponseAsync();

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void post307(Boolean booleanValue);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> post307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable post307Async(Boolean booleanValue);

    /**
     * Post redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsPost307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsPost307Headers, Void>> post307WithRestResponseAsync(Boolean booleanValue);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete307();

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> delete307Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable delete307Async();

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsDelete307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsDelete307Headers, Void>> delete307WithRestResponseAsync();

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete307(Boolean booleanValue);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> delete307Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable delete307Async(Boolean booleanValue);

    /**
     * Delete redirected with 307, resulting in a 200 after redirect.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;HttpRedirectsDelete307Headers, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<HttpRedirectsDelete307Headers, Void>> delete307WithRestResponseAsync(Boolean booleanValue);
}
