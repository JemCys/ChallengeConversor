import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CheckCurrency {

    public Currency searchCurrency(String baseCurrency, String targetCurrency, String currencyAmount) {
        String url = "https://v6.exchangerate-api.com/v6/414abad678264087bd9387a6/pair/" + baseCurrency + "/" + targetCurrency + "/" + currencyAmount;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);
        } catch (Exception e) {
            throw new RuntimeException("Invalid Currency " + e.getMessage());
        }
    }
}