import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;


import java.util.Collection;

public interface FigureComponent {

    //available to all
    void draw(GraphicsContext gc);

    boolean contains(Point2D point2D);

    //available to graphic Leaves
    Point2D getCenter();

    // available to composite
    boolean add(FigureComponent figureComponent);

    boolean remove(FigureComponent figureComponent);

    void clear();

    Collection<FigureComponent> getChildren();


}
