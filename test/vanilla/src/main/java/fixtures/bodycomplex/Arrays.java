/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodycomplex.models.ArrayWrapper;
import fixtures.bodycomplex.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Arrays.
 */
public interface Arrays {
    /**
     * Get complex types with array property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ArrayWrapper object if successful.
     */
    ArrayWrapper getValid();

    /**
     * Get complex types with array property.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;ArrayWrapper&gt;} object
     */
    ServiceFuture<ArrayWrapper> getValidAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Get complex types with array property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;ArrayWrapper&gt;} object if successful.
     */
    Maybe<ArrayWrapper> getValidAsync();

    /**
     * Get complex types with array property.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, ArrayWrapper&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, ArrayWrapper>> getValidWithRestResponseAsync();

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putValid(ArrayWrapper complexBody);

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putValidAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putValidAsync(ArrayWrapper complexBody);

    /**
     * Put complex types with array property.
     *
     * @param complexBody Please put an array with 4 items: "1, 2, 3, 4", "", null, "&amp;S#$(*Y", "The quick brown fox jumps over the lazy dog"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(ArrayWrapper complexBody);

    /**
     * Get complex types with array property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ArrayWrapper object if successful.
     */
    ArrayWrapper getEmpty();

    /**
     * Get complex types with array property which is empty.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;ArrayWrapper&gt;} object
     */
    ServiceFuture<ArrayWrapper> getEmptyAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Get complex types with array property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;ArrayWrapper&gt;} object if successful.
     */
    Maybe<ArrayWrapper> getEmptyAsync();

    /**
     * Get complex types with array property which is empty.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, ArrayWrapper&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, ArrayWrapper>> getEmptyWithRestResponseAsync();

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putEmpty(ArrayWrapper complexBody);

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putEmptyAsync(ArrayWrapper complexBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putEmptyAsync(ArrayWrapper complexBody);

    /**
     * Put complex types with array property which is empty.
     *
     * @param complexBody Please put an empty array
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(ArrayWrapper complexBody);

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ArrayWrapper object if successful.
     */
    ArrayWrapper getNotProvided();

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;ArrayWrapper&gt;} object
     */
    ServiceFuture<ArrayWrapper> getNotProvidedAsync(final ServiceCallback<ArrayWrapper> serviceCallback);

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;ArrayWrapper&gt;} object if successful.
     */
    Maybe<ArrayWrapper> getNotProvidedAsync();

    /**
     * Get complex types with array property while server doesn't provide a response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, ArrayWrapper&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, ArrayWrapper>> getNotProvidedWithRestResponseAsync();
}
