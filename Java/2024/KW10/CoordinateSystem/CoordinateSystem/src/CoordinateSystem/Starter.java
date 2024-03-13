package CoordinateSystem;

import java.awt.*;

public class Starter {
    public static void main(String[] args) throws IllegalAccessException {
        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addPoints(new CSPoint(12,22));
        cs.addLineSegment(new CSLineSegment(new CSPoint(34, 62), new CSPoint(-34,22)));
        cs.addLineSegment(new CSLineSegment(new CSPoint(-50,-77), new CSPoint(30, -65)));

        new CSRenderer(cs, 1, 3, Color.MAGENTA, Color.ORANGE);
    }
}