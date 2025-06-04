package HashMapLoopKeyOrValues;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    }

    // Search the book by just part of the title by looping the hashmap
    // Doing so will lose the hahmap's ability to retrieve the info quickly because the loop has to go through the items all one by one

    // Looping the hashmap by the keys
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        // 'keySet()' is used for searhing the keys
        for(String bookTitle : this.directory.keySet()) {
            if(!bookTitle.contains(titlePart)) {
                continue;
            }

            // if the key contains the given string
            // we retrieve the value related to it
            // and add it tot the set of books to be returned

            books.add(this.directory.get(bookTitle));
        }

        return books;
    }

    // Looping the hashmap the values
    public ArrayList<Book> getBookByPart(String titlePart) {
        titlePart = sanitizedString(titlePart);

        ArrayList<Book> books = new ArrayList<>();

        for(Book book : this.directory.values()) {
            if(!book.getName().contains(titlePart)) {
                continue;
            }

            books.add(book);
        }

        return books;
    }
}
