
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeBook recipebook;

    public UserInterface(Scanner scanner, RecipeBook recipebook) {
        this.scanner = scanner;
        this.recipebook = recipebook;
    }

    public void start() {
        this.Helper();

        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            this.processCommand(command);
            if (command.equals("stop")) {
                break;

            }

        }

    }

    public void Helper() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");

    }

    public void processCommand(String command) {
        if (command.equals("list")) {
            recipebook.printList();
        } else if (command.equals("find name")) {
            System.out.println("Searched word:");
            
            String name = scanner.nextLine();
            recipebook.findName(name);
        } else if (command.equals("find cooking time")) {
            System.out.println("Max cooking time:");
            
            int time = Integer.valueOf(scanner.nextLine());
            recipebook.findTime(time);

        }else if (command.equals("find ingredient")){
            System.out.println("Ingredient:");
            
            String ing = scanner.nextLine();
            recipebook.findIng(ing);
        
        }

    }
}
