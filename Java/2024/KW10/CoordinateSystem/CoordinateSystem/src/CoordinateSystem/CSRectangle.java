package CoordinateSystem;

import java.awt.*;

public class CSRectangle {

    private int sideA;
    private int sideB;

    private Color colorRectangle;
    private CSPoint basePoint;

    public CSRectangle(int sideA, int sideB, Color colorRectangle, CSPoint basePoint) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.colorRectangle = colorRectangle;
        this.basePoint = basePoint;
    }

    public CSPoint getBasePoint() {
        return basePoint;
    }

    public int getX(){
        return basePoint.getX();
    }

    private int getY(){
        return basePoint.getY();
    }


    public void draw(Graphics2D g2d){
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(colorRectangle);

        g2d.drawRect(getX(), getY(), sideA, sideB);
    }
}
