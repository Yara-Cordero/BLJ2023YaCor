package CoordinateSystem;

import java.awt.*;


public class CSPoint extends Point implements Drawable{

    private static int count = 0;
    private final int id;
    private Color colorPoint;

    public CSPoint(int x, int y) {
            super(x, y);
            this.id = count++;
    }

    public CSPoint(int x, int y, Color colorPoint) {
            super(x, y);
            this.id = count++;
            this.colorPoint = colorPoint;
    }

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorPoint);
        CSPoint translatedPoint = csr.translatePoint(this);

        g2d.drawLine(translatedPoint.x, translatedPoint.y, translatedPoint.x, translatedPoint.y);
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
