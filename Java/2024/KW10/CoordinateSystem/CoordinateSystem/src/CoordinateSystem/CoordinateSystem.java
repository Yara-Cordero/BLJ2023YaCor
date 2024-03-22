package CoordinateSystem;

import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {
    private int coordinateSystemSize;
    private List<CSPoint> points;
    private List<CSLineSegment> lineSegments;
    private List<CSRectangle> rectangles;
    private List<CSTriangle> triangles;
    private List<CSCircle> circles;
    private List<CSPolygon> polygons;
    private List<Drawable> drawables;


    public CoordinateSystem(int coordinateSystemSize) throws IllegalAccessException {
        if(coordinateSystemSize <= 0 || coordinateSystemSize % 20 != 0){
            throw new IllegalAccessException();
        }
        this.coordinateSystemSize = coordinateSystemSize;
        this.points = new ArrayList<>();
        this.lineSegments = new ArrayList<>();
        this.rectangles = new ArrayList<>();
        this.triangles = new ArrayList<>();
        this.circles = new ArrayList<>();
        this.polygons = new ArrayList<>();
        this.drawables = new ArrayList<>();
    }

    public void addPoints(CSPoint csPoint){
        points.add(csPoint);
        drawables.add(csPoint);
    }

    public void addLineSegment(CSLineSegment lineSegment){
        lineSegments.add(lineSegment);
        drawables.add(lineSegment);
    }

    public void addRectangle(CSRectangle rectangle){
        rectangles.add(rectangle);
        drawables.add(rectangle);
    }

    public void addTriangle(CSTriangle triangle){
        triangles.add(triangle);
        drawables.add(triangle);
    }

    public void addCircle(CSCircle circle){
        circles.add(circle);
        drawables.add(circle);
    }

    public void addPolygon(CSPolygon polygon){
        polygons.add(polygon);
        drawables.add(polygon);
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

    public List<CSTriangle> getTriangles(){
        return triangles;
    }

    public List<CSCircle> getCircles() {
        return circles;
    }

    public List<CSPolygon> getPolygons() {
        return polygons;
    }

    public List<Drawable> getDrawables() {
        return drawables;
    }

    public int getCoordinateSystemSize() {
        return coordinateSystemSize;
    }

    public void setCoordinateSystemSize(int coordinateSystemSize) {
        this.coordinateSystemSize = coordinateSystemSize;
    }
}
