package compare2ObjectsOfSameClass;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java 01");
        Book book2 = new Book("Java 01");
        Book book3 = new Book("Python Rocks");

        System.out.println(book1.hasSameTitle(book2));
        System.out.println(book1.hasSameTitle(book3));
    }
}
