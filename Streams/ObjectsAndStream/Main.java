package Streams.ObjectsAndStream;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person jkRowling = new Person("J.K. Rowling", 1965);
        Person tolkien = new Person("J.R.R. Tolkien", 1892);
        Person agatha = new Person("Agatha Christie", 1890);

        List<Book> books = new ArrayList<>();
        books.add(new Book(jkRowling, "Harry Potter and the Sorcerer's Stone", 309));
        books.add(new Book(tolkien, "The Hobbit", 310));
        books.add(new Book(jkRowling, "Harry Potter and the Chamber of Secrets", 341));
        books.add(new Book(agatha, "And Then There Were None", 272));

        // Calculate the average birth year of authors
        double averageAuthorBirthYear = books.stream()

            // Transform stream of Books to stream of Persons (authors)
            .map(book -> book.getAuthor())

            // Transform stream of Persons to stream of Integers (birth years)
            .mapToInt(author -> author.getBirthYear())

            // Calculate the average
            .average()

            // Get the double value
            .getAsDouble();

        System.out.println("Average author birth year: " + averageAuthorBirthYear);

        // Print authors of books containing "Potter" in their title
        books.stream()

            // Keep only books with "Potter" in title
            .filter(book -> book.getName().contains("Potter"))

            // Get the author object for each remaining book
            .map(book -> book.getAuthor())

            // Print the author's name
            .forEach(author -> System.out.println(author.getName()));
        
        // Print "Author Name: Book Title" pairs, sorted alphabetically
        books.stream()

            // Transform to a "Author: Book" string
            .map(book -> book.getAuthor().getName() + ": " + book.getName())

            // Sort these strings alphabetically
            .sorted()

            // Print each string
            .forEach(System.out::println);
    }
}
