package fixtures.http;

import com.microsoft.rest.v2.http.HttpPipeline;
import com.microsoft.rest.v2.policy.PortPolicy;
import fixtures.http.implementation.AutoRestHttpInfrastructureTestServiceImpl;
import fixtures.http.models.ErrorException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HttpServerFailureTests {
    private static AutoRestHttpInfrastructureTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestHttpInfrastructureTestServiceImpl(HttpPipeline.build(new PortPolicy.Factory(3000)));
    }

    @Test
    public void head501() throws Exception {
        try {
            client.httpServerFailures().head501();
        } catch (ErrorException ex) {
            Assert.assertEquals(501, ex.response().statusCode());
        }
    }

    @Test
    public void get501() throws Exception {
        try {
            client.httpServerFailures().get501();
        } catch (ErrorException ex) {
            Assert.assertEquals(501, ex.response().statusCode());
        }
    }

    @Test
    public void post505() throws Exception {
        try {
            client.httpServerFailures().post505(true);
        } catch (ErrorException ex) {
            Assert.assertEquals(505, ex.response().statusCode());
        }
    }

    @Test
    public void delete505() throws Exception {
        try {
            client.httpServerFailures().delete505(true);
        } catch (ErrorException ex) {
            Assert.assertEquals(505, ex.response().statusCode());
        }
    }
}
