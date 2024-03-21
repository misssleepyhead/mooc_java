
import java.util.Scanner;

public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            helpers();
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }
            processCommand(command);

        }

    }

    public void helpers() {

        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");

    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            manager.addJoke(joke);

        } else if (command.equals("2")) {
            System.out.println("Drawing a joke.");
            String j = manager.drawJoke();
            System.out.println(j);

        } else if (command.equals("3")) {

            System.out.println("Printing the jokes.");
            manager.printJokes();
        }

    }
}
