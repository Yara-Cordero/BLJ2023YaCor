package CoordinateSystem;

import java.awt.*;

public class CSRectangle implements Drawable{

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

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorRectangle);
        CSPoint translatedBasePoint = csr.translatePoint(this.getBasePoint());
        int translatedWidth = this.getSideA() * csr.getFieldScale();
        int translatedHeight = this.getSideB() * csr.getFieldScale();

        g2d.drawRect(translatedBasePoint.x, translatedBasePoint.y, translatedWidth, translatedHeight );
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
