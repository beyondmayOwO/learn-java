package Algorithms.Search.LinearSearchAndBinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(5, "The Hobbit"));
        books.add(new Book(4, "1984"));
        books.add(new Book(1, "Brave New World"));
        books.add(new Book(2, "To Kill a Mockingbird"));
        books.add(new Book(3, "The Great Gatsby"));

        // int index = linearSearch(books, 2);
        // System.out.println("book found at " + index);

        System.out.println(books);

        Collections.sort(books);
        System.out.println(books);
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

    // BINARY SEARCH (HALF-INTERVAL SEARCH)
    // List or Array must be sorted first
    // Then search from the middle index first.
    // If the value of the middle index is bigger than the searched, eliminate the right half. The left half if the value is smaller
    // Then continue the process for the remaining values
    // If the value is equals to the searched, return the index of that value
    // If not index -1 is returned

    // We haven't learned how to sort the objects yet so the code for the binary search is unfinished.
}
