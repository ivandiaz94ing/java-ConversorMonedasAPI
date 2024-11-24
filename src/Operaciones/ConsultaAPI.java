package Operaciones;

import javax.print.attribute.standard.PresentationDirection;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    private String baseUrl = "https://v6.exchangerate-api.com/v6/4b92a535f0c31a6dfc314d2f/pair/";

    public void convertirModeda(String meneda, String cambio, double valor){
        String direccion = baseUrl+meneda+"/"+cambio+"/";
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion+valor))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
