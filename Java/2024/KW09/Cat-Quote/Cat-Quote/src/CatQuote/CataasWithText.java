package CatQuote;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class CataasWithText {

    public CataasWithText() {
    }

    public void getCatWithText() {
        try {
            ZenQuote Quote = new ZenQuote();

            String quote = Quote.getQuoteText();
            String quoteReplaced = replaceSpaces(quote);

            // Make a request to the Cataas API to get a random cat image
            URL url = new URL("https://cataas.com/cat/says/" + quoteReplaced  + "?fontSize=50&fontColor=white");
            Image catImage = ImageIO.read(url);

            // Display the image in a JFrame
            JFrame frame = new JFrame();
            frame.setSize(500, 500);
            JLabel label = new JLabel(new ImageIcon(catImage));
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String replaceSpaces (String input) {
        return input.replaceAll(" ", "%20");
    }
}
