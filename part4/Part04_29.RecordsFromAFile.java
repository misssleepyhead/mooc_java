
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner scanner2 = new Scanner(Paths.get(file))) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();

                String[] parts = line.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years");

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
