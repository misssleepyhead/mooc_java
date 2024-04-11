
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((r1,r2) -> r1[5].compareTo(r2[5]))
                    .forEach(p -> System.out.println(p[3]+" ("+p[4]+"), "+p[2].split(" ")[1].trim()+", "+p[5]));
                    
                    
        
        } catch (IOException error) {
            System.out.println("Error: " + error.getMessage());
        }
        
    }
}
