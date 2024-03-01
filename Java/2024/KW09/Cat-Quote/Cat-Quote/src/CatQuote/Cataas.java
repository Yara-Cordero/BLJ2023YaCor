package CatQuote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cataas {

    public Cataas() {
    }

    public void getCat() throws IOException {
        URL url = new URL("https://cataas.com/cat");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String jsonString = response.toString();

            int startIndex = jsonString.indexOf("{");
            int endIndex = jsonString.lastIndexOf("}") + 1;
            String json = jsonString.substring(startIndex, endIndex);


            String cat = getValue(json, "c");


            System.out.println("Quote: " + quoteText);

        } else {
            System.out.println("Error: Unable to fetch quotes. Response code: " + responseCode);
        }
    }

    private static String getValue(String json, String key){
        int startIndex = json.indexOf("\"" + key + "\":") + key.length() + 4;
        int endIndex = json.indexOf("\"", startIndex);
        return json.substring(startIndex, endIndex);
    }
}
