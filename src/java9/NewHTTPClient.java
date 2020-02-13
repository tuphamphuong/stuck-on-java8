package java9;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class NewHTTPClient {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.google.com"))
                        .header("User-Agent","Java")
                        .GET()
                        .build();
    }
}
