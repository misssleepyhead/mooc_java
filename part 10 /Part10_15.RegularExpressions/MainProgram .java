
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        Checker checker = new Checker();

        if (checker.timeOfDay(s)) {
            System.out.println("The form is correct.");

        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
