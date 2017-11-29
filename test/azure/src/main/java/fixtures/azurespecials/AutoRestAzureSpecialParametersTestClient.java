/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

/**
 * The interface for AutoRestAzureSpecialParametersTestClient class.
 */
public interface AutoRestAzureSpecialParametersTestClient {
    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'.
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Sets The subscription id, which appears in the path, always modeled in credentials. The value is always '1234-5678-9012-3456'.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    AutoRestAzureSpecialParametersTestClient withSubscriptionId(String subscriptionId);

    /**
     * Gets The api version, which appears in the query, the value is always '2015-07-01-preview'.
     *
     * @return the apiVersion value.
     */
    String apiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    AutoRestAzureSpecialParametersTestClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    AutoRestAzureSpecialParametersTestClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    AutoRestAzureSpecialParametersTestClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the XMsClientRequestIds object to access its operations.
     * @return the XMsClientRequestIds object.
     */
    XMsClientRequestIds xMsClientRequestIds();

    /**
     * Gets the SubscriptionInCredentials object to access its operations.
     * @return the SubscriptionInCredentials object.
     */
    SubscriptionInCredentials subscriptionInCredentials();

    /**
     * Gets the SubscriptionInMethods object to access its operations.
     * @return the SubscriptionInMethods object.
     */
    SubscriptionInMethods subscriptionInMethods();

    /**
     * Gets the ApiVersionDefaults object to access its operations.
     * @return the ApiVersionDefaults object.
     */
    ApiVersionDefaults apiVersionDefaults();

    /**
     * Gets the ApiVersionLocals object to access its operations.
     * @return the ApiVersionLocals object.
     */
    ApiVersionLocals apiVersionLocals();

    /**
     * Gets the SkipUrlEncodings object to access its operations.
     * @return the SkipUrlEncodings object.
     */
    SkipUrlEncodings skipUrlEncodings();

    /**
     * Gets the Odatas object to access its operations.
     * @return the Odatas object.
     */
    Odatas odatas();

    /**
     * Gets the Headers object to access its operations.
     * @return the Headers object.
     */
    Headers headers();

}
