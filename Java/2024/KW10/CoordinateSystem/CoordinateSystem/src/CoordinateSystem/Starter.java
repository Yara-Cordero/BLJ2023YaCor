package CoordinateSystem;

import java.util.concurrent.ThreadLocalRandom;

public class Starter {
    public static void main(String[] args) throws IllegalAccessException {
        CoordinateSystem cs = new CoordinateSystem(500);

        cs.addLineSegment(new CSLineSegment(new CSPoint(34, 62), new CSPoint(-34,22)));

        new CSRenderer(cs, 1, 3);
    }
}