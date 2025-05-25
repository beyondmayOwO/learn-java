package compare2ObjectsOfSameClass;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    // Use .equals to check the same title
    public boolean hasSameTitle(Book otherBook) {
        return this.title.equals(otherBook.title);
    }
}
