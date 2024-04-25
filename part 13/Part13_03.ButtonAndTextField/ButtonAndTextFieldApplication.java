package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Label label1 = new Label("Name:");
        TextField textField = new TextField("Input you first name");
        Button button = new Button("Submit");

        HBox hb = new HBox();
        hb.getChildren().add(label1);
        hb.getChildren().add(textField);
        hb.getChildren().add(button);
        hb.setSpacing(10);

        Scene view = new Scene(hb);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
