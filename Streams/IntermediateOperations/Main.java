package Streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", "Doe", 1960));
        persons.add(new Person("Anna", "Dane", 1972));
        persons.add(new Person("Terry", "Star", 1953));
        persons.add(new Person("Stala", "Sue", 1980));

        // Problem 1: The number of person born before 1970
        // "count" is returned as "long", not "int"
        long count = persons.stream()
            .filter(person -> person.getBirthYear() < 1970)
            .count();
        
        System.out.println(count);  // 2

        // Problem 2: The number of person who's first name starts with "A"
        long firstNameA = persons.stream()
            .filter(person -> person.getFirstName().startsWith("A"))
            .count();
        
        System.out.println(firstNameA);

        // Problem 3: People with unique first names in alphabetical order
        // distinct-method uses the equals-method that is in all objects for comparing whether two strings are the same. 
        persons.stream()
            .map(person -> person.getFirstName())
            .distinct()
            .sorted()
            .forEach(name -> System.out.println(name));
    }
}
