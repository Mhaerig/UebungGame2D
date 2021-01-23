import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class View extends VBox {
    Button button;
    TextField textField;
    ListView<String> listView;
    Canvas canvas;
    Label figuresLabel;
    Label missedLabel;
    Label timeLeftLabel;
    int width = 640;
    int height = 480;

    public View() {

        button = new Button("Start");
        textField = new TextField();
        canvas = new Canvas(width, height);
        figuresLabel = new Label("Figures: ");
        missedLabel = new Label("Missed: ");
        timeLeftLabel = new Label("TimeLeft: ");
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.GREENYELLOW);
        gc.fillRect(0,0,canvas.getWidth(), canvas.getHeight());



        this.getChildren().addAll(button, textField,figuresLabel, missedLabel, timeLeftLabel, canvas);

    }

    public void addHandler() {

    }
}
