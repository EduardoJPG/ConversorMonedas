import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Monedas buscarMonedas(String monedaBase, String monedaTarget){
        URI direccion = URI.create
                ("https://v6.exchangerate-api.com/v6/51349c6f94b448c2fac7a963/pair/"+monedaBase+"/"+monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion).build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("No se encontro la moneda que desea convertir");
        }
    }
}
