package CoordinateSystem;

import java.awt.*;

public class CSRectangle {

    private final int sideA;
    private final int sideB;

    private final Color colorRectangle;
    private final CSPoint basePoint;

    public CSRectangle(int sideA, int sideB, Color colorRectangle, CSPoint basePoint) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.colorRectangle = colorRectangle;
        this.basePoint = basePoint;
    }

    public CSPoint getBasePoint() {
        return basePoint;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public Color getColorRectangle() {
        return colorRectangle;
    }


}
