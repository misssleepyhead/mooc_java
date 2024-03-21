
import java.util.Scanner;

public class UserInterface {

    private TodoList todo;
    private Scanner scanner;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            processCommand(command);
           
        }

        System.out.println("Bye bye!");

    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();

        } else if (command.equals("list")) {
            list();

        } else if (command.equals("remove")) {

            remove();
        }

    }

    public void add() {
        System.out.println("To add:");
        String add = scanner.nextLine();
        this.todo.add(add);

    }

    public void list() {
        this.todo.print();

    }

    public void remove() {
        System.out.println("Which one is removed?");
        int index = Integer.valueOf(scanner.nextLine());
        this.todo.remove(index);

    }

}
