package sherif.model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SherifCircle extends AbstractShape {

  @java.lang.Override
  void draw(GraphicsContext gc) {
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(getBorderLineWidth());
    gc.setFill(Color.BLUE);
    gc.strokeOval(getRoot().getX(), getRoot().getY(), getRadius() * 2, getRadius() * 2);
    gc.fillOval(getRoot().getX(), getRoot().getY(), getRadius() * 2, getRadius() * 2);
    gc.setStroke(Color.RED);
    gc.strokeRect(getCenter().getX(), getCenter().getY(), 1, 1);
  }

  @java.lang.Override
  boolean contains(Point2D point2D) {
    return false;
  }

  @java.lang.Override
  Point2D getCenter() {
    return null;
  }

  @java.lang.Override
  void clear() {}
}
