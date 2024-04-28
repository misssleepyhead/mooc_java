package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {

    private Dictionary dict;

    public InputView(Dictionary dict) {
        this.dict = dict;
    }

    public Parent getView() {

        // ui components
        Label text1 = new Label("Word");
        TextField wordInput = new TextField();
        Label text2 = new Label("Translation");
        TextField translationInput = new TextField();
        Button add = new Button("Add the word pair");

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(text1, 0, 0);
        layout.add(wordInput, 0, 1);
        layout.add(text2, 0, 2);
        layout.add(translationInput, 0, 3);
        layout.add(add, 0, 4);

        // actions- add to the dict
        add.setOnMouseClicked((event) -> {
            String word = wordInput.getText();
            String translation = translationInput.getText();

            dict.add(word, translation);
            wordInput.clear();
            translationInput.clear();

        });
        
        return layout;

    }
}
