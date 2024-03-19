
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(id, name);
            if (!(list.contains(item))) {
                list.add(item);

            }
        }
            System.out.println("==Items==");
            System.out.println("");
            for (Item s : list) {
                System.out.println(s);
            }
        
    }
}
