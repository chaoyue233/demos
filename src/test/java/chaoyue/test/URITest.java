package chaoyue.test;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class URITest {
    @Test
    public void test1() throws URISyntaxException {
        String url = "tcp://blog.csdn.net:8080";
        URI uri = new URI(url);
        String host = uri.getHost();
        int port = uri.getPort();
        System.out.println(host);
        System.out.println(port);
    }
}
