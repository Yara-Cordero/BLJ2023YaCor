package CoordinateSystem;

import java.awt.*;

public class CSPolyline implements Drawable{

    private CSPoint[] points;
    private Color colorPolyline;

    public CSPolyline(CSPoint[] points, Color colorPolyline) {
        this.points = points;
        this.colorPolyline = colorPolyline;
    }

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorPolyline);

        for (int i = 0; i < points.length - 1; i++){
            CSPoint translatedStart = csr.translatePoint(points[i]);
            CSPoint translatedEnd = csr.translatePoint(points[i + 1]);
            g2d.drawLine(translatedStart.x, translatedStart.y, translatedEnd.x, translatedEnd.y);
        }

    }
}
