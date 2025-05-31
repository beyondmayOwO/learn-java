package Algorithms.Search.LinearSearch;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(1, "The Hobbit"));
        books.add(new Book(2, "1984"));
        books.add(new Book(3, "Brave New World"));
        books.add(new Book(4, "To Kill a Mockingbird"));
        books.add(new Book(5, "The Great Gatsby"));

        int index = linearSearch(books, 2);
        System.out.println("book found at " + index);
    }

    // LINEAR SEARCH
    // Linear search searches the info in an array or a list one by one. 
    // If the match is found, it returns that index. If not -1 is returned

    // We could use 'indexOf' and get the same result but it has more time complexity and not preferred for large data sets

    // If the matching Id is found, the index of that object is returned
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == searchedId) {
                return i;
            }
        }

        return -1;
    }
}
