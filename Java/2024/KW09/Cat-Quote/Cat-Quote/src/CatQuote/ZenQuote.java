package CatQuote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ZenQuote {
    String quoteText;
    String author;

    public ZenQuote() {
    }

    private static String getValue(String json, String key){
        int startIndex = json.indexOf("\"" + key + "\":") + key.length() + 4;
        int endIndex = json.indexOf("\"", startIndex);
        return json.substring(startIndex, endIndex);
    }

    public void getQuote() throws IOException {
        URL url = new URL("https://zenquotes.io/api/random");

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


            String quoteText = getValue(json, "q");
            String author = getValue(json, "a");

        } else {
            System.out.println("Error: Unable to fetch quotes. Response code: " + responseCode);
        }
    }

    public void printQuoute(){
        System.out.println("Quote: " + quoteText);
        System.out.println("Author: " + author);
    }


    public String getQuoteText() {
        return quoteText;
    }
}
