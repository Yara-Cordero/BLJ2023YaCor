package CoordinateSystem;

import java.awt.*;

public class CSLineSegment implements Drawable {

    private static int count = 0;
    private final int id;
    private CSPoint start;
    private CSPoint end;
    private final Color colorLine;

    public CSLineSegment(CSPoint start, CSPoint end, Color colorLine) {
        this.id = count++;
        this.start = start;
        this.end = end;
        this.colorLine = colorLine;
    }

    @Override
    public void draw(Graphics2D g2d, CSRenderer csr) {
        g2d.setColor(colorLine);
        CSPoint translatedStart = csr.translatePoint(this.lineStart());
        CSPoint translatedEnd = csr.translatePoint(this.lineEnd());

        g2d.drawLine(translatedStart.x, translatedStart.y, translatedEnd.x, translatedEnd.y);
    }

    public CSPoint lineStart(){
        return start;
    }

    public CSPoint lineEnd(){
        return end;
    }

    public Color getColorLine() {
        return colorLine;
    }

    public int getId() {
        return id;}

    public void setLineStart(CSPoint start) {
        this.start = start;
    }

    public void setLineEnd(CSPoint end) {
        this.end = end;
    }
}
