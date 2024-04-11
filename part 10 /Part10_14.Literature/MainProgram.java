
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            
            if (title.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, age));
        }
            
        System.out.println(books.size()+" books in total.");
        System.out.println("");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);
                
        books.stream()
                .sorted(comparator)
                .forEach(b -> System.out.println(b));
    }

}
