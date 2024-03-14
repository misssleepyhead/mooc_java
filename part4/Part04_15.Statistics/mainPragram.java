
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        Statistics statistics1 = new Statistics();
        Statistics statistics_even = new Statistics();
        Statistics statistics_odd = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                statistics_even.addNumber(number);
            } else if (number % 2 != 0) {
                
                statistics_odd.addNumber(number);
            }
            statistics1.addNumber(number);
            
        }
//        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Sum of even numbers: " + statistics_even.sum());
        System.out.println("Sum of odd numbers: " + statistics_odd.sum());
//        System.out.println("Average: " + statistics.average());
    }
}
