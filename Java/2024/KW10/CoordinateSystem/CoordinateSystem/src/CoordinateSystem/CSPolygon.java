package CoordinateSystem;

import java.awt.*;

public class CSPolygon implements Drawable{

    private CSPoint[] points;
    private Color colorPolygon;

    public CSPolygon(CSPoint[] points, Color colorPolygon) {
        this.points = points;
        this.colorPolygon = colorPolygon;
    }

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorPolygon);

        int[] xPoints = new int[points.length];
        int[] yPoints = new int[points.length];
        for (int i = 0; i < points.length; i++){
            CSPoint translatedPoint = csr.translatePoint(points[i]);

            xPoints[i] = translatedPoint.x;
            yPoints[i] = translatedPoint.y;;
        }

        g2d.drawPolygon(xPoints, yPoints, points.length);
    }
}
