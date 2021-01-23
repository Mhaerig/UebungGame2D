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
    private Controller controller;

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


        this.getChildren().addAll(button, textField, figuresLabel, missedLabel, timeLeftLabel, canvas);

    }

    public void addHandler() {
        canvas.setOnMouseClicked((event) -> {
            // Is executed on mouse clicked inside the canvas
//           var x =  event.getScreenX(); event.getX(); event.getSceneX();
            //           var y =  event.getScreenY(); event.getY(); event.getSceneY();

//         to get the button value use this, i think  0 is for left 1 for right or otherwise.. u can test with System.out.println() here  event.getButton().ordinal()
            this.controller.drawShape( event.getButton().ordinal(),x,y);
        });

    }

    public void link(Controller controller) {
        this.controller = controller;
    }
}
