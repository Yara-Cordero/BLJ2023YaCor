package CatQuote;

import java.io.IOException;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cataas {

    public Cataas() {
    }

    public void getCat() throws IOException {
        try {
            // Make a request to the Cataas API to get a random cat image
            URL url = new URL("https://cataas.com/cat");
            Image catImage = ImageIO.read(url);

            // Display the image in a JFrame
            JFrame frame = new JFrame();
            frame.setSize(400, 400);
            JLabel label = new JLabel(new ImageIcon(catImage));
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
