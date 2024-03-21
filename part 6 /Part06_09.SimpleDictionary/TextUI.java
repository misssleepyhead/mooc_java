
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;

    }

    public void start() {
        

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                this.add();
                continue;

            } else if (command.equals("search")) {
                this.search();
                continue;

            }
            System.out.println("Unknown command");

        }
    }

    public void add() {

        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translated = scanner.nextLine();
        this.simpleDictionary.add(word, translated);

    }

    public void search() {
        System.out.println("To be translated:");
        String ask = scanner.nextLine();

        String word = this.simpleDictionary.translate(ask);

        if (word == null) {
            System.out.println("Word " + ask + " was not found");

        } else {
            System.out.println(word);
        }
    }

}
