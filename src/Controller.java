public class Controller {
    Model model;
    View view;

    public void link(Model model, View view) {
        this.model = model;
        this.view = view;
        this.model.link(this);
        this.view.link(this);
    }


    public void drawShape(int button, int x, int y) {
        // first check if the center is not colliding with another shape

        // add new object either circle or rectangle depending on button attribute value to the list of shapes in model.

        // updating the model attributes. e.g clickCount, ...
        // loop on all abstract shapes list from the model and call draw function
    }
}
