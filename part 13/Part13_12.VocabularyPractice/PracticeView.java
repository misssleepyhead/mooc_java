package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {

    private Dictionary dict;
    private String word;

    public PracticeView(Dictionary dict) {
        this.dict = dict;
        this.word = dict.randomTest();
    }

    public Parent getView() {

        Label text1 = new Label("Translate the word '" + this.word+"'");
        TextField input = new TextField();
        Button check = new Button("Check");
        Label ans = new Label("");

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        layout.add(text1, 0, 0);
        layout.add(input, 0, 1);
        layout.add(check, 0, 2);
        layout.add(ans, 0, 3);

        //actions 
        check.setOnMouseClicked((event) -> {
            String answer = input.getText();
            if (dict.search(word).equals(answer)) {
                ans.setText("Correct!");
            } else {
                ans.setText("Wrong! The translation fo the word '" + word + "' is '" + dict.search(word) + "' .");
                return;
            }
            
            // then next pratice start
            this.word = this.dict.randomTest();
            text1.setText("Translate the word " + this.word+"'");
            input.clear();

        });
        return layout;

    }

}
