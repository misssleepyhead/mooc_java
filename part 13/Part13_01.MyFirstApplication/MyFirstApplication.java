package myFirstApplication;

import static java.awt.SystemColor.window;
import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {

    public static void main(String[] args) {
        launch(MyFirstApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("My first application");
        window.show();
    }

}
