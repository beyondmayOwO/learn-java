package ComparableInterfaceAndSortingObjects.LambdaExpressionWithoutComparableInterface;

// Use lambda expression to compare the objects directly in sorting without using "Comparable" interface in the objects
public class Person { // [10] This Person class does NOT implement Comparable
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) { // [10] Constructor
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() { // [10] Getter for name
        return name;
    }

    public int getBirthYear() { // [10] Getter for birth year
        return birthYear;
    }

    @Override
    public String toString() {
        return name + " (" + birthYear + ")";
    }
}