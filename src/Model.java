import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.util.Duration;

public class Model {

    public List<FigureComposite> figureComposites = new List<FigureComposite>();
    public IntegerProperty timeLeft = new SimpleIntegerProperty(10);
    public IntegerProperty missedClicks = new SimpleIntegerProperty(0);
    public IntegerProperty figureSize = new SimpleIntegerProperty(20);
    private Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> timeLeft.setValue(timeLeft.getValue() - 1) ));

    private Controller controller;
    public void link(Controller controller) {
        this.controller = controller;
    }

}
