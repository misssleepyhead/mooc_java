package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        TextField input = new TextField();
        Button button = new Button("Update");
        Label text = new Label("");

        button.setOnAction((event) -> {
            text.setText(input.getText());
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(input, button, text);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
