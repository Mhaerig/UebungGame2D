package sherif.model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

public abstract class AbstractShape {

  private Point2D root;
  private double radius;
  private double borderLineWidth;

  // available to all
  abstract void draw(GraphicsContext gc);

  abstract boolean contains(Point2D point2D);

  // available to graphic Leaves
  abstract Point2D getCenter();

  // available to composite
  abstract void clear();

  public Point2D getRoot() {
    return root;
  }

  public void setRoot(Point2D root) {
    this.root = root;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getBorderLineWidth() {
    return borderLineWidth;
  }

  public void setBorderLineWidth(double borderLineWidth) {
    this.borderLineWidth = borderLineWidth;
  }
}
