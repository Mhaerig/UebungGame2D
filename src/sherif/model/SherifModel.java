package sherif.model;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class SherifModel {

  private List<AbstractShape> shapes = new ArrayList<AbstractShape>();
  public IntegerProperty timeLeft = new SimpleIntegerProperty(10);
  public IntegerProperty missedClicks = new SimpleIntegerProperty(0);
  public IntegerProperty figureSize = new SimpleIntegerProperty(20);
  private Timeline timeline =
      new Timeline(
          new KeyFrame(Duration.seconds(1), e -> timeLeft.setValue(timeLeft.getValue() - 1)));
}
