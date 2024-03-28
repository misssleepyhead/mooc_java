
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                numbers.add(number);
            }

        }
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        if (sum == 0) {
            System.out.println("Cannot calculate the average");

        } else {
            double avg = 0.0;
            avg = (sum * 1.0) / numbers.size();
            System.out.println(avg);
        }

    }
}
