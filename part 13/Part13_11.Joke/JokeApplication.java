package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        // main layout
        BorderPane layout = new BorderPane();
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");
        
        menu.getChildren().addAll(first, second, third);
        layout.setTop(menu);

        // sublayout
        StackPane joke = createView("What do you call a bear with no teeth?");
        StackPane answer = createView("A gummy bear.");
        StackPane explanation = createView("Cause a gummy bear can't bites!");

        // events
        first.setOnAction((event) -> layout.setCenter(joke));
        second.setOnAction((event) -> layout.setCenter(answer));
        third.setOnAction((event) -> layout.setCenter(explanation));
        
        layout.setCenter(joke);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {
        
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        launch(JokeApplication.class);
    }
}
