import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class MainClass extends Application{
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void init() throws Exception  {
        System.out.println("initialized");
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Stopped");
    }

    public void start(Stage stage) throws Exception {
        var model = new Model();
        var view = new View();
        var controller = new Controller();/**/

        controller.link(model, view);

        stage.setTitle("Awesome Game");



    var scene = new Scene(view);
    stage.setScene(scene);
    stage.show();
    }
}
