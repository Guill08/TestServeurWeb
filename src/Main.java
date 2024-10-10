import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
//http://localhost:8001/test?name=Test
public class Main {
    public static void main(String[] args) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);

            server.createContext("/test", new  MyHttpHandler());

            server.start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}