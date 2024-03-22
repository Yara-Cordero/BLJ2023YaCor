package CoordinateSystem;

import java.awt.*;
import javax.swing.JOptionPane;

public class Starter {
    public static void main(String[] args) throws IllegalAccessException {

        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addPoints(new CSPoint(12,22, Color.MAGENTA));

        cs.addLineSegment(new CSLineSegment(new CSPoint(34, 62), new CSPoint(-34,22), Color.RED));
        cs.addLineSegment(new CSLineSegment(new CSPoint(-50,-77), new CSPoint(30, -65), Color.ORANGE));

        cs.addRectangle(new CSRectangle(100, 70, Color.MAGENTA , new CSPoint(70, 100)));

        cs.addTriangle(new CSTriangle(new CSPoint(30, 20), new CSPoint(50, 20), new CSPoint(45, 40), Color.BLUE));
        cs.addCircle(new CSCircle(new CSPoint(0, 0), 70, Color.PINK));

        new CSRenderer(cs, 1, 3);
    }
}