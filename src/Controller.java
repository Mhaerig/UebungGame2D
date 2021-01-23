import javafx.beans.Observable;

import java.net.http.WebSocket;


public class Controller {
    Model model;
    View view;

    public void link(Model model, View view) {
        this.model = model;
        this.view = view;
    }

   /* model.timeLeft.addListener(c -> {
        view.timeLeftLabel.setText("Time left: " + model.timeLeft);})*/
}
