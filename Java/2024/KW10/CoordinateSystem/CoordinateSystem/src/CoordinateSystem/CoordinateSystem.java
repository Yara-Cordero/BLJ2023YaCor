package CoordinateSystem;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class CoordinateSystem {
    private int coordinateSystemSize;
    private final List<CSPoint> points;
    private final List<CSLineSegment> lineSegments;
    private final List<CSRectangle> rectangles;

    public CoordinateSystem(int coordinateSystemSize) throws IllegalAccessException {
        if(coordinateSystemSize <= 0 || coordinateSystemSize % 20 != 0){
            throw new IllegalAccessException();
        }
        this.coordinateSystemSize = coordinateSystemSize;
        this.points = new ArrayList<>();
        this.lineSegments = new ArrayList<>();
        this.rectangles = new ArrayList<>();
    }

    public void addPoints(CSPoint csPoint){
        points.add(csPoint);
    }

    public void addLineSegment(CSLineSegment lineSegment){
        lineSegments.add(lineSegment);
    }

    public void addRectangle(CSRectangle rectangle){
        rectangles.add(rectangle);
    }

    public List<CSPoint> getPoints() {
        return points;
    }

    public CSPoint[] getAllPoints(){
        return points.toArray(new CSPoint[0]);
    }

    public List<CSLineSegment> getLineSegments(){
        return lineSegments;
    }

    public List<CSRectangle> getRectangles(){
        return rectangles;
    }

    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }

    public void setCoordinateSystemSize(int coordinateSystemSize) {
        this.coordinateSystemSize = coordinateSystemSize;
    }
}
