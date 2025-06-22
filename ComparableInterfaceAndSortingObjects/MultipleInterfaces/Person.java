package ComparableInterfaceAndSortingObjects.MultipleInterfaces;

// [8] An interface for objects that have an ID.
public interface Identifiable {
    String getId(); // Declares that any class implementing this must provide a getId() method.
}

// Our Person class will be both sortable (Comparable) and identifiable (Identifiable).
public class Person implements Identifiable, Comparable<Person> { // [8] Implementing two interfaces
    private String name;
    private String socialSecurityNumber; // We'll use this as the ID for sorting

    public Person(String name, String socialSecurityNumber) { // [8] Constructor
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() { // [8] Getter for name
        return this.name;
    }

    public String getSocialSecurityNumber() { // [8] Getter for SSN
        return this.socialSecurityNumber;
    }

    @Override
    public String getId() { // [8] This method is required by the Identifiable interface
        // How it works:
        // We define that the socialSecurityNumber serves as the unique ID for a Person.
        return getSocialSecurityNumber(); // [8]
    }

    @Override
    public int compareTo(Person another) { // [8] This method is required by the Comparable interface
        // How it works:
        // We define the natural sorting order for Person objects to be based on their ID.
        // We use the String class's compareTo method on the IDs.
        return this.getId().compareTo(another.getId()); // [8]
        // Why this works:
        // By sorting on the ID, we're effectively sorting by social security number,
        // which gives us a unique and consistent order for each person.
    }

    @Override
    public String toString() {
        return name + " (ID: " + socialSecurityNumber + ")";
    }
}

// Example usage (not in sources, but for illustration):
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMultipleInterfaces {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "12345"));
        people.add(new Person("Bob", "00001"));
        people.add(new Person("Charlie", "54321"));

        System.out.println("Original order:");
        people.forEach(System.out::println);

        Collections.sort(people); // Sorts using the compareTo method (by SSN/ID)

        System.out.println("\nSorted by ID (Social Security Number):");
        people.forEach(System.out::println);
        // Output:
        // Original order:
        // Alice (ID: 12345)
        // Bob (ID: 00001)
        // Charlie (ID: 54321)
        //
        // Sorted by ID (Social Security Number):
        // Bob (ID: 00001)
        // Alice (ID: 12345)
        // Charlie (ID: 54321)
    }
}
*/