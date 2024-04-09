
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String s = scanner.nextLine();
            if (s.equals("end")) {
                break;
            }

            inputs.add(s);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        
        if(option.equals("n")){
        double navg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number<0)
                .average()
                .getAsDouble(); 
                System.out.println("Average of the negative numbers: "+navg);
        }else if (option.equals("p")){
        double pavg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number>0)
                .average()
                .getAsDouble();          
            System.out.println("Average of the positive numbers: "+pavg);
        
        }
    }
}
