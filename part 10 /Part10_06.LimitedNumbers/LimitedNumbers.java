
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
            if (n < 0) {
                break;
            }
            numbers.add(n);
        }
     
        numbers.stream()
                .filter(n -> 1<=n && n<=5)
                .forEach(p -> System.out.println(p));
        
    }
}
