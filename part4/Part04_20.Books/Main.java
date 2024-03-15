
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            booklist.add(new Book(title, pages, year));

        }
        System.out.println("What information will be printed? ");
        String print = scanner.nextLine();
        if (print.equals("everything")) {
            for (Book book : booklist) {
                System.out.println(book);
            }
        } else if (print.equals("name")) {
            for (Book book : booklist) {
                System.out.println(book.getTitle());
            }

        }
    }

}
