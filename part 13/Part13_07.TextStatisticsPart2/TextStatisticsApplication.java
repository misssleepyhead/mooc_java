package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        TextArea input = new TextArea();
        Label label1 = new Label("Letters: 0");
        // Label letter = new Label("0");
        Label label2 = new Label("Words: 0");
        // Label word = new Label("0");
        Label label3 = new Label("The longest word is: ");
        //Label longest = new Label(" ");

        HBox box = new HBox(10);
        box.getChildren().addAll(label1, label2, label3);

        input.textProperty().addListener((change, oldValue, newValue) -> {
            int length = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            label1.setText("Letters: "+length);
            label2.setText("Words: "+ words);
            label3.setText("The longest word is: "+longest);

        });
        
        layout.setCenter(input);
        layout.setBottom(box);
        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
