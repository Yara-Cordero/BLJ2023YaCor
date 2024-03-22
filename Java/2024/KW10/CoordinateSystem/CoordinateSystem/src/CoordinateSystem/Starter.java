package CoordinateSystem;

import java.awt.*;

public class Starter {
    public static void main(String[] args) throws IllegalAccessException {

        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addPoints(new CSPoint(0, 0, Color.MAGENTA)); // Center
        cs.addPoints(new CSPoint(-150, 150, Color.BLUE)); // Top left
        cs.addPoints(new CSPoint(150, -150, Color.GREEN)); // Bottom right

        cs.addLineSegment(new CSLineSegment(new CSPoint(-100, -150), new CSPoint(100, 150), Color.RED)); // Diagonal

        cs.addRectangle(new CSRectangle(100, 50, Color.YELLOW, new CSPoint(50, -50))); // Top left

        cs.addTriangle(new CSTriangle(new CSPoint(-150, 100), new CSPoint(-50, 100), new CSPoint(-100, 200), Color.GREEN)); // Top left

        cs.addCircle(new CSCircle(new CSPoint(-150, -150), 80, Color.MAGENTA));

        cs.addPolygon(new CSPolygon(new CSPoint[]{
                new CSPoint(-100, 50),
                new CSPoint(0, 100),
                new CSPoint(100, 50),
                new CSPoint(50, -50),
                new CSPoint(-50, -50)
        }, Color.CYAN));

        new CSRenderer(cs, 1, 3);
    }
}
