package CoordinateSystem;

import java.awt.*;

public class CSTriangle implements Drawable{

    private CSPoint point1;
    private CSPoint point2;
    private CSPoint point3;
    private Color colorTriangle;


    public CSTriangle(CSPoint point1, CSPoint point2, CSPoint point3, Color colorTriangle) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.colorTriangle = colorTriangle;
    }

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorTriangle);
        CSPoint translatedPoint1 = csr.translatePoint(point1);
        CSPoint translatedPoint2 = csr.translatePoint(point2);
        CSPoint translatedPoint3 = csr.translatePoint(point3);

        int[] xPoints = {translatedPoint1.x, translatedPoint2.x, translatedPoint3.x};
        int[] yPoints = {translatedPoint1.y, translatedPoint2.y, translatedPoint3.y};
        g2d.drawPolygon(xPoints, yPoints, 3);
    }
}
