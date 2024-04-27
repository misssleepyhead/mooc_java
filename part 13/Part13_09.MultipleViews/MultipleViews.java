package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) throws Exception {

        // first scene 
        // borderpane
        BorderPane layout1 = new BorderPane();
        //Label
        Label text1 = new Label("First view!");

        // button
        Button b1 = new Button("To the second view!");

        layout1.setTop(text1);
        layout1.setCenter(b1);

        Scene first = new Scene(layout1);

        // second scene 
        VBox layout2 = new VBox();
        Button b2 = new Button("To the third view!");
        Label text2 = new Label("Second view!");

        layout2.getChildren().addAll(b2, text2);
        Scene second = new Scene(layout2);

        // third scene
        GridPane layout3 = new GridPane();
        Label text3 = new Label("Third view!");
        Button b3 = new Button("To the first view!");
        layout3.add(text3, 0, 0);
        layout3.add(b3, 1, 1);

        Scene third = new Scene(layout3);
        // events 
        b1.setOnAction((event) -> {
            window.setScene(second);

        });

        b2.setOnAction((event) -> {
            window.setScene(third);

        });

        b3.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
