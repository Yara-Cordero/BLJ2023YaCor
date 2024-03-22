package CoordinateSystem;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * This class is responsible for visualising a given coordinate system in a
 * halfway pleasing way.
 *
 * @author surber
 *
 */
public class CSRenderer extends JPanel {

  private final CoordinateSystem cs;
  private final JFrame mainFrame;

  private final int size;
  private final int fieldScale;
  private final int pointSize;

  private final int OFFSET_MID;
  private final int OFFSET_END;

  private ArrayList<Drawable> drawables = new ArrayList<>();

  /**
   * This constructor sets up the window where the coordinate system will be
   * drawn.
   *
   * @param cs         The coordinate system (including all points) to draw.
   * @param fieldScale The scaling of the coordinate system.
   * @param pointSize  The size which will determine how large points will appear
   *                   in the coordinate system.
   */
  public CSRenderer(CoordinateSystem cs, int fieldScale, int pointSize) {
    this.cs = cs;
    this.size = cs.getCoordinateSystemSize() * fieldScale;
    this.fieldScale = fieldScale;
    this.pointSize = pointSize;

    this.initDrawables();

    OFFSET_MID = (size + fieldScale) / 2;
    OFFSET_END = size + (fieldScale / 2);

    this.setPreferredSize(new Dimension(size + fieldScale, size + fieldScale));
    this.setupMouseMotionListener(2);

    mainFrame = new JFrame();
    mainFrame.setResizable(true);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    mainFrame.add(this);
    mainFrame.pack();
    mainFrame.setLocationRelativeTo(null);

    mainFrame.setVisible(true);
  }

  /**
   * This constructor sets up the window where the coordinate system will be
   * drawn. Default values of 1 and 3 will be assumed for
   * {@link CSRenderer#fieldScale} and {@link CSRenderer#pointSize} respectively.
   * 
   * @param cs The coordinate system (including all points) to draw.
   */
  public CSRenderer(CoordinateSystem cs) {
    this(cs, 1, 3);

  }

  private void initDrawables(){
    drawables.addAll(cs.getTriangles());
    drawables.addAll(cs.getCircles());
  }

  /**
   * This method gets called automagically once the panel, where the coordinate
   * system will be drawn, becomes visible. Furthermore, the actual drawing
   * happens in this method as well.
   *
   * @param g The Graphics object of this class.
   */
  @Override
  public void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(new BasicStroke(fieldScale));
    for (int i = (fieldScale / 2); i <= OFFSET_END; i += (10 * fieldScale)) {
      // light gray lines
      g2d.setColor(Color.LIGHT_GRAY);
      g2d.drawLine(i, 0, i, OFFSET_END);
      g2d.drawLine(0, i, OFFSET_END, i);

      // black interval markers
      g2d.setColor(Color.BLACK);
      g2d.drawLine(i, -5 * fieldScale + OFFSET_MID, i, 5 * fieldScale + OFFSET_MID);
      g2d.drawLine(-5 * fieldScale + OFFSET_MID, i, 5 * fieldScale + OFFSET_MID, i);
    }

    // x and y axis
    g2d.drawLine(OFFSET_MID, 0, OFFSET_MID, OFFSET_END);
    g2d.drawLine(0, OFFSET_MID, OFFSET_END, OFFSET_MID);

    // origin
    g2d.setColor(Color.RED);
    g2d.drawLine(OFFSET_MID, OFFSET_MID, OFFSET_MID, OFFSET_MID);

    // all points
    g2d.setStroke(new BasicStroke(pointSize));
    for (CSPoint point : cs.getAllPoints()) {
      CSPoint translatedPoint = translatePoint(point);
      g2d.setColor(point.getColorPoint());
      g2d.drawLine(translatedPoint.x, translatedPoint.y, translatedPoint.x, translatedPoint.y);
    }

    // line
    g2d.setStroke(new BasicStroke(pointSize));
    for (CSLineSegment  lineSegment : cs.getLineSegments()) {
      g2d.setColor(lineSegment.getColorLine());
      CSPoint translatedStart = translatePoint(lineSegment.lineStart());
      CSPoint translatedEnd = translatePoint(lineSegment.lineEnd());
      g2d.drawLine(translatedStart.x, translatedStart.y, translatedEnd.x, translatedEnd.y);
    }

    //rectangle
    g2d.setStroke(new BasicStroke(pointSize));
    for(CSRectangle rectangle : cs.getRectangles()){
      g2d.setColor(rectangle.getColorRectangle());
      CSPoint translatedBasePoint = translatePoint(rectangle.getBasePoint());
      int translatedWidth = rectangle.getSideA() * fieldScale;
      int translatedHeight = rectangle.getSideB() * fieldScale;
      g2d.drawRect(translatedBasePoint.x, translatedBasePoint.y,translatedWidth, translatedHeight);
    }


    for (Drawable drawable : drawables){
      drawable.draw(g2d, this);
    }



  }
  /**
   * This method is responsible for converting a Java Swing absolute position
   * point (origin at the very top left) to a point of a cartesian coordinate
   * system.
   * 
   * @param point The absolute point to convert.
   * @return The converted point.
   */
  public CSPoint translatePoint(Point point) {
    return new CSPoint(point.x * fieldScale + size / 2, size / 2 - point.y * fieldScale);
  }

  /**
   * This method sets up the mouse motion listener, which gets called every time
   * the mouse was moved inside the window containing the drawn coordinate system.
   * 
   * @param leeway The deviation that is allowed to exist between the mouse
   *               coordinate and the coordinate of a drawn point. A leeway of 0
   *               means that the both coordinates must be an exact match.
   */
  private void setupMouseMotionListener(int leeway) {
    int scaledLeeway = leeway + pointSize / 2;
    this.addMouseMotionListener(new MouseAdapter() {
      @Override
      public void mouseMoved(MouseEvent me) {
        for (CSPoint point : cs.getAllPoints()) {
          CSPoint tp = translatePoint(point);

          if ((me.getPoint().x >= tp.x - scaledLeeway && me.getPoint().x <= tp.x + scaledLeeway)
              && (me.getPoint().y >= tp.y - scaledLeeway && me.getPoint().y <= tp.y + scaledLeeway)) {
            mainFrame.setTitle(point.toString());
          }
        }
      }
    });
  }
}
