import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.print("How many books? ");
        int bookCount = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < bookCount; i++) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int publishYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publishYear));
        }

        System.out.print("What information will be printed? ");
        String printInfo = scanner.nextLine();

        if(printInfo.equals("everything")) {
            for(Book book: books) {
                System.out.println(book);
            }
        } else if (printInfo.equals("name")) {
            for(Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}