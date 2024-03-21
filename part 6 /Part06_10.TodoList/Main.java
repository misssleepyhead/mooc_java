
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInterface user = new UserInterface(new TodoList(), new Scanner(System.in));
        user.start();

    }
}
