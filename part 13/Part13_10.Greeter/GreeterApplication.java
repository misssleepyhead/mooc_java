package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window){
    
        // ui components
        Label intro = new Label("Enter your name and start.");
        TextField input = new TextField();
        Button start = new Button("Start");
        Label welcomeText = new Label();
        
        // lyayout log in 
        GridPane login = new GridPane();
        login.setPrefSize(300, 180);
        login.setAlignment(Pos.CENTER);
        login.setVgap(10);
        login.setHgap(10);
        login.setPadding(new Insets(20,20,10,10));
        login.add(intro, 0,0);
        login.add(input, 0,1);
        login.add(start, 0,2);
        
        // welcom page layout
        StackPane welcome= new StackPane();
        welcome.setPrefSize(300, 180);
        welcome.setAlignment(Pos.CENTER);
        welcome.getChildren().add(welcomeText);
        
        Scene s1 = new Scene(login);
        Scene s2 = new Scene(welcome);
        
        // events
        start.setOnAction((event)->{
        welcomeText.setText("Welcome "+input.getText()+"!");
        window.setScene(s2);
        });
        
        window.setScene(s1);
        window.show();
    
    }


    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
