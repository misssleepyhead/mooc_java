
import java.util.ArrayList;

public class Points {

    private ArrayList<Integer> list;
    private ArrayList<Integer> grades;
    private int passCount = 0;

    public Points() {
        this.list = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void add(int points) {
        if (points > 0 && points <= 100) {
            this.list.add(points);
            this.grades.add(pointsToGrade(points));
        }
    }

    public double sumAll() {
        double sum = 0.0;
        for (int p : this.list) {
            sum += p;

        }
        return sum;

    }

    public String avgPass() {
        double sum = 0.0;

        for (int p : this.list) {
            if (p >= 50) {
                sum += p;
                passCount++;
            }

        }
        if (sum == 0) {
            return "-";
        }

        return sum / passCount + "";
    }

    public String avg(double sum) {
        if (sum == 0) {
            return "-";
        }
        return (sum / this.list.size()) + "";

    }

    public double passPrecentage() {
        return 100.0 * passCount / this.list.size();

    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        //System.out.println(count);
        return count;
    }
}
