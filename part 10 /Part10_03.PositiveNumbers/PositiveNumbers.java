
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int number = Integer.valueOf(scanner.nextLine());
        numbers.add(number);
        

    }
    
    public static List<Integer> positive(List<Integer> numbers){
       
        ArrayList<Integer> values = numbers.stream()
                .filter(value -> value>0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return values;
    }
}
