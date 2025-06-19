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
            .map(book -> book.getAuthor())
            .mapToInt(author -> author.getBirthYear())
            .average()
            .getAsDouble();

        System.out.println("Average author birth year: " + averageAuthorBirthYear);

        // Print authors of books containing "Potter" in their title
        books.stream()
            .filter(book -> book.getName().contains("Potter"))
            .map(book -> book.getAuthor())
            .forEach(author -> System.out.println(author.getName()));
        
        // Print "Author Name: Book Title" pairs, sorted alphabetically
        books.stream()
            .map(book -> book.getAuthor().getName() + ": " + book.getName())
            .sorted()
            .forEach(System.out::println);
    }
}
