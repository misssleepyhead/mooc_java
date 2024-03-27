
import java.util.Scanner;

public class userInterface {

    private Scanner scanner;
    private BirdWatcher watch;

    public userInterface(Scanner scanner, BirdWatcher watch) {
        this.scanner = scanner;
        this.watch = watch;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();
            this.processCommand(command);
            if (command.equals("Quit")) {
                break;
            }

        }
    }

    public void processCommand(String command) {
        if (command.equals("Add")) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Name in Latin:");
            String latin = scanner.nextLine();
            watch.add(new Bird(name, latin));

        } 
        
        if (command.equals("Observation")) {
            System.out.println("Bird?");
            String name = scanner.nextLine();
            watch.observation(name);

        } 
        
        if (command.equals("All")) {
            watch.all();
        }
        
        if (command.equals("One")) {
            System.out.println("Bird?");
            String name = scanner.nextLine();
            watch.one(name);

        }
    }
}
