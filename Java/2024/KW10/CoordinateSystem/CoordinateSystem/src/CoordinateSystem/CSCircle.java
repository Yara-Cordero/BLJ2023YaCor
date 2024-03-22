package CoordinateSystem;

import java.awt.*;

public class CSCircle implements Drawable{

    private CSPoint center;
    private int radius;
    private Color colorCircle;

    public CSCircle(CSPoint center, int radius, Color colorCircle) {
        this.center = center;
        this.radius = radius;
        this.colorCircle = colorCircle;
    }

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorCircle);
        CSPoint translatedCenter = csr.translatePoint(center);

        g2d.drawOval(translatedCenter.x - radius, translatedCenter.y - radius, radius * 2, radius * 2);
    }
}
