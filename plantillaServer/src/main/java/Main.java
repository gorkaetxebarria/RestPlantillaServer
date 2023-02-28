
import java.io.IOException;
import java.net.URI;


import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import jakarta.ws.rs.core.UriBuilder;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Starting Embedded Jersey HTTPServer...\n");
        ResourceConfig resourceConfig = new ResourceConfig();
        resourceConfig.packages("controller");
        URI uri = UriBuilder.fromUri("http://localhost/").port(8080).build();

        JdkHttpServerFactory.createHttpServer(uri, resourceConfig);
    }
}
