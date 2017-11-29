/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureresource.implementation;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.Manager;
import com.microsoft.azure.v2.AzureEnvironment;
import com.microsoft.azure.v2.credentials.AzureTokenCredentials;
import com.microsoft.azure.v2.serializer.AzureJacksonAdapter;

/**
 * Entry point to Azure MissingService resource management.
 */
@Beta(SinceVersion.V1_2_0)
public final class MissingServiceManager extends Manager<MissingServiceManager, AutoRestResourceFlatteningTestServiceImpl> {
    /**
     * Get a Configurable instance that can be used to create MissingServiceManager with optional configuration.
     *
     * @return the instance allowing configurations
     */
    public static Configurable configure() {
        return new MissingServiceManager.ConfigurableImpl();
    }

    /**
     * Creates an instance of MissingServiceManager that exposes MissingService resource management API entry points.
     *
     * @param credentials the credentials to use
     * @param subscriptionId the subscription UUID
     * @return the MissingServiceManager
     */
    public static MissingServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new MissingServiceManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .withInterceptor(new ProviderRegistrationInterceptor(credentials))
            .build(), subscriptionId);
    }

    /**
     * Creates an instance of MissingServiceManager that exposes MissingService resource management API entry points.
     *
     * @param restClient the RestClient to be used for API calls.
     * @param subscriptionId the subscription UUID
     * @return the MissingServiceManager
     */
    public static MissingServiceManager authenticate(RestClient restClient, String subscriptionId) {
        return new MissingServiceManager(restClient, subscriptionId);
    }

    /**
     * The interface allowing configurations to be set.
     */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of MissingServiceManager that exposes MissingService management API entry points.
         *
         * @param credentials the credentials to use
         * @param subscriptionId the subscription UUID
         * @return the interface exposing MissingService management API entry points that work across subscriptions
         */
        MissingServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * The implementation for Configurable interface.
     */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        public MissingServiceManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
            return MissingServiceManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
    }

    private MissingServiceManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new AutoRestResourceFlatteningTestServiceImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
