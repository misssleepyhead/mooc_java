package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;
// END SOLUTION

    @Override
    public void init() throws Exception {
        // 1. Create the dictionary that the application uses
        this.dictionary = new Dictionary();

    }

    @Override
    public void start(Stage window) throws Exception {

        // Ui components 
        Button addWords = new Button("Enter new words");
        Button pratices = new Button("Practice");

        // mainview
        BorderPane layout = new BorderPane();
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        menu.getChildren().addAll(addWords, pratices);
        layout.setTop(menu);

        // subview 
        InputView inputView = new InputView(dictionary);
        PracticeView praticeView = new PracticeView(dictionary);

        addWords.setOnAction((event) -> layout.setCenter(inputView.getView()));
        pratices.setOnAction((event) -> layout.setCenter(praticeView.getView()));

        // init 
        layout.setCenter(inputView.getView());

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {

        launch(VocabularyPracticeApplication.class);
    }
}
