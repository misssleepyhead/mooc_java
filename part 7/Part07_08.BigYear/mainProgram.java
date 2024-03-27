
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        BirdWatcher watcher = new BirdWatcher();
        userInterface ui = new userInterface(scan, watcher);
        ui.start();
        
        
    }

}
