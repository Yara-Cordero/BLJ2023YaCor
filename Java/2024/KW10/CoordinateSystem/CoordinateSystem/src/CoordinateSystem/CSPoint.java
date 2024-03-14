package CoordinateSystem;

import java.awt.Point;
import java.awt.Color;


public class CSPoint extends Point {

    private static int count = 0;
    private int id;
    private Color colorPoint;

    public CSPoint() {
        this(0,0);
    }

    public CSPoint(int x, int y) {
        super(x, y);
        this.id = count++;
    }

    public CSPoint(int x, int y, Color colorPoint) {
        super(x, y);
        this.id = count++;
        this.colorPoint = colorPoint;
    }

    public Color getColorPoint() {
        return colorPoint;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "CSPoint{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
