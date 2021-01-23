import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.util.Duration;

public class Model {

    public FigureComposite figureComposite = new FigureComposite();
    public IntegerProperty timeLeft = new SimpleIntegerProperty(10);
    public IntegerProperty missedClicks = new SimpleIntegerProperty(0);
    public IntegerProperty figureSize = new SimpleIntegerProperty(20);
    private Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> timeLeft.setValue(timeLeft.getValue() - 1) ));





}
