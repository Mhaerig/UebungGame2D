package sherif.model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public class SherifRect extends AbstractShape {
  @java.lang.Override
  void draw(GraphicsContext gc) {
    // here goes logic for drawing
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
