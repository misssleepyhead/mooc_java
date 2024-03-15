
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            list.add(line);

        }
        System.out.println(list.size());
    }
}
