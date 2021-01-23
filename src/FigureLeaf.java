import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.awt.*;
import java.util.Collection;

public interface FigureLeaf extends FigureComponent {

    @Override
    default void clear() {
        throw new UnsupportedOperationException("cannot clear leaf");

    }

    default boolean add() {
        throw new UnsupportedOperationException("cannot add to leaf");
    }

    default boolean remove() {
        throw new UnsupportedOperationException("cannot remove from leaf");
    }

    default Collection<FigureComponent> getChildren() {
        throw new UnsupportedOperationException("cannor getChildren from leaf");
    }
}
