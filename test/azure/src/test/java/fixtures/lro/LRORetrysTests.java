package fixtures.lro;

import com.microsoft.azure.AzureProxy;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.LogLevel;
import com.microsoft.rest.RestClient;
import fixtures.lro.implementation.AutoRestLongRunningOperationTestServiceImpl;
import fixtures.lro.models.Product;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LRORetrysTests {
    private static AutoRestLongRunningOperationTestServiceImpl client;

    @BeforeClass
    public static void setup() {
        RestClient restClient = new RestClient.Builder()
                .withBaseUrl("http://localhost:3000")
                .withLogLevel(LogLevel.BODY_AND_HEADERS)
                .withSerializerAdapter(new AzureJacksonAdapter())
                .build();
        AzureProxy.setDefaultDelayInMilliseconds(0);
        client = new AutoRestLongRunningOperationTestServiceImpl(restClient)
            .withLongRunningOperationRetryTimeout(0);
    }

    @Test
    public void put201CreatingSucceeded200() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lRORetrys().put201CreatingSucceeded200(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void putAsyncRelativeRetrySucceeded() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lRORetrys().putAsyncRelativeRetrySucceeded(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void deleteProvisioning202Accepted200Succeeded() throws Exception {
        Product response = client.lRORetrys().deleteProvisioning202Accepted200Succeeded();
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void delete202Retry200() throws Exception {
        client.lRORetrys().delete202Retry200();
    }

    @Test
    public void deleteAsyncRelativeRetrySucceeded() throws Exception {
        client.lRORetrys().deleteAsyncRelativeRetrySucceeded();
    }

    @Test
    public void post202Retry200() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        client.lRORetrys().post202Retry200(product);
    }

    @Test
    public void postAsyncRelativeRetrySucceeded() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        client.lRORetrys().postAsyncRelativeRetrySucceeded(product);
    }
}
