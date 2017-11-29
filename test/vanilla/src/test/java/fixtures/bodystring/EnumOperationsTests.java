package fixtures.bodystring;

import com.microsoft.rest.v2.http.HttpPipeline;
import com.microsoft.rest.v2.policy.PortPolicy;
import fixtures.bodystring.implementation.AutoRestSwaggerBATServiceImpl;
import fixtures.bodystring.models.Colors;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class EnumOperationsTests {
    private static AutoRestSwaggerBATService client;
    private CountDownLatch lock = new CountDownLatch(1);

    @BeforeClass
    public static void setup() {
        client = new AutoRestSwaggerBATServiceImpl(HttpPipeline.build(new PortPolicy.Factory(3000)));
    }

    @Test
    public void getNotExpandable() throws Exception {
        Colors result = client.enums().getNotExpandable();
        Assert.assertEquals(Colors.RED_COLOR, result);
    }

    @Test
    public void putNotExpandable() throws Exception {
        client.enums().putNotExpandable(Colors.RED_COLOR);
    }
}
