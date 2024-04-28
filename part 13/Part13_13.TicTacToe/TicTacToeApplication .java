package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    //private Button[] buttons;
    private Label turnText;
    private String turns;
    private Button[][] board;

    public TicTacToeApplication() {
        this.turns = "X";
        this.turnText = new Label("Turn: " + this.turns);
        this.board = new Button[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = createButtons();
            }
        }
    }

    private Button createButtons() {
        Button b = new Button(" ");
        b.setFont(Font.font("Monospaced", 40));
        b.setPrefSize(30, 30);

        // button actions
        b.setOnAction((event) -> {
            if (!b.getText().equals(" ")) {
                return;
            }
            if (turns.equals("X")) {
                b.setText("X");
                turns = "O";
                this.turnText.setText("Turn: " + this.turns);

            } else {
                b.setText("O");
                turns = "X";
                this.turnText.setText("Turn: " + this.turns);
            }

            if (checkEnd() && checkWinner()) {
                turnText.setText("The end!");
            }
        });

        return b;
    }

    @Override
    public void start(Stage window) {

        // Mainview 
        BorderPane layout = new BorderPane();
        turnText.setFont(new Font(30.0));

        //subview
        GridPane grid = new GridPane();
        //grid.setPrefSize(300, 300);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                grid.add(board[i][j], i, j);
            }
        }

        layout.setTop(turnText);
        layout.setCenter(grid);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    private boolean checkEnd() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkWinner() {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (!board[i][0].getText().equals(" ")
                    && board[i][0].getText().equals(board[i][1].getText())
                    && board[i][1].getText().equals(board[i][2].getText())) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (!board[0][j].getText().equals(" ")
                    && board[0][j].getText().equals(board[1][j].getText())
                    && board[1][j].getText().equals(board[2][j].getText())) {
                return true;
            }
        }

        if (board[0][0].getText().equals(board[1][1].getText()) && board[1][1].getText().equals(board[2][2].getText())) {
            return true;
        }
        if (board[0][2].getText().equals(board[1][1].getText()) && board[1][1].getText().equals(board[2][0].getText())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

}
