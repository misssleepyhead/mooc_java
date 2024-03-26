
import java.util.Scanner;

public class UserInterface {

    private Points points;
    private Scanner scanner;

    public UserInterface(Points points, Scanner scanner) {
        this.points = points;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            points.add(number);

        }
        System.out.println("Point average (all): " + points.avg(points.sumAll()));
        System.out.println("Point average (passing): " + points.avgPass());
        System.out.println("Pass percentage: " + points.passPrecentage());
        System.out.println("Grade distribution:");
        printGradeDistribution();

    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = points.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }

    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
