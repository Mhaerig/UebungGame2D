import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FigureComposite implements FigureComponent, Observable {

    private List<InvalidationListener> listeners = new ArrayList<>();


    @Override
    public void addListener(InvalidationListener listener) {listeners.add(listener);}

    @Override
    public void removeListener(InvalidationListener listener) {listeners.remove((listener));}

    public void onChange() {
        listeners.stream().forEach(l -> l.invalidated(this));
    }

    private Collection<FigureComponent> figureComponents = new ArrayList<>();

    @Override
    public Point2D getCenter() {throw new UnsupportedOperationException("composite has no implemented center yet");}

    @Override
    public boolean add(FigureComponent figureComponent) {
        boolean collision = false;
        for (FigureComponent stored: figureComponents) {
            collision = centerOverlap(stored, figureComponent);
            if (collision) {
                break;
            }
        }
        if (!collision) {
            figureComponents.add(figureComponent);
            onChange();
        }
        return !collision;
    }

    @Override
    public boolean remove(FigureComponent figureComponent) {
        this.remove(figureComponent);
        return false;
    }

    @Override
    public void clear() {
        for (FigureComponent figureComponent: figureComponents) {
            this.remove(figureComponent);
        }

    }

    @Override
    public Collection<FigureComponent> getChildren() {
        return Collections.unmodifiableCollection(figureComponents);
    }

    @Override
    public void draw(GraphicsContext gc) {
        figureComponents.stream().forEach(fc -> fc.draw(gc));
    }

    @Override
    public boolean contains(Point2D point2D) {
        for (FigureComponent figureComponent: figureComponents) {
            if (figureComponent.contains(point2D))
                return true;
        }
        return false;
    }

    private boolean centerOverlap(FigureComponent stored, FigureComponent candidate) {
        if(candidate.contains(stored.getCenter())) {
            return true;
        }
        return false;
    }


}
