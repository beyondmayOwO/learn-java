package HashMap;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = sanitizedString(book.getName());

        // 'containsKey' checks if the key exists
        if(directory.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            directory.put(name, book);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if(directory.containsKey(bookTitle)) {
            directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, cannot be removed");
        }
    }

    // The book name the user enters needs to be case-insensitive
    public static String sanitizedString(String string) {
        if(string == null) {
            return "";
        }

        // Change to the lower case
        string = string.toLowerCase();

        // Remove the whitespace at the start and the end of the string
        return string.trim();
    }
}
