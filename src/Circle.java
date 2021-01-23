import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.awt.*;
import java.util.Collection;


public class Circle implements FigureComponent{

    private Point2D root;
    private double radius;
    private double borderLineWidth;

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(borderLineWidth);
        gc.setFill(Color.BLUE);
        gc.strokeOval(root.getX(), root.getY(), radius * 2, radius * 2);
        gc.fillOval(root.getX(), root.getY(), radius * 2, radius * 2);
        gc.setStroke(Color.RED);
        gc.strokeRect(getCenter().getX(), getCenter().getY(), 1, 1);

    }

    @Override
    public Point2D getCenter() {
        return new Point2D(root.getX() + radius, root.getY() + radius);
    }

    public Circle(double x, double y, double r) {

    }



    @Override
    public boolean contains(Point2D point2D) {
        boolean result = false;
        if (Math.hypot(getCenter().getX() - point2D.getX(), getCenter().getY() - point2D.getY()) <= (radius + borderLineWidth)) {
            result = true;
        }
        return result;
    }


    @Override
    public boolean add(FigureComponent figureComponent) {
        return false;
    }

    @Override
    public boolean remove(FigureComponent figureComponent) {
        return false;
    }

}
