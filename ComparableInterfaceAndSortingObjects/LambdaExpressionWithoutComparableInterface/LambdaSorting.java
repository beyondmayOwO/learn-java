package ComparableInterfaceAndSortingObjects.LambdaExpressionWithoutComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSorting {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>(); // [10] Create a list of Person objects
        persons.add(new Person("Ada Lovelace", 1815)); // [10] Add some people
        persons.add(new Person("Irma Wyman", 1928));
        persons.add(new Person("Grace Hopper", 1906));
        persons.add(new Person("Mary Coombs", 1929));

        System.out.println("Original list order: ");
        persons.stream().forEach(person -> System.out.println(person.getName()));

        System.out.println("Sorting by birth year (stream.sorted() with lambda): ");
        persons.stream()

            // Sort without using Comparable interface using lambda expression directly.
            // (person1, person2) -> two parameters (two people their birth year being compared - oldest to youngest)
            .sorted((person1, person2) -> person1.getBirthYear() - person2.getBirthYear())
            .forEach(person -> System.out.println(person.getName()));

        System.out.println("Sorting by birth year (Collections.sort() with lambda:)");

        // Use lambda experssion
        Collections.sort(persons, (person1, person2) -> person1.getBirthYear() - person2.getBirthYear());
        persons.forEach(person -> System.out.println(person.getName()));

        System.out.println("Sorting by name:");
        persons.stream()

            // Sort the name with compareTo using lambda expression
            .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
            .forEach(person -> System.out.println(person.getName()));
    }
}