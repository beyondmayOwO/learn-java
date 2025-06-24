package ComparableInterfaceAndSortingObjects.ComparatorClassSortByMultipleCriteria;

public class Film {
    private String name;
    private int releaseYear;

    public Film(String name, int releaseYear) { // [11] Constructor
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() { // [11] Getter for name
        return this.name;
    }

    public int getReleaseYear() { // [11] Getter for release year
        return this.releaseYear;
    }

    @Override
    public String toString() { // [11] toString for printing
        return this.name + " (" + this.releaseYear + ")";
    }
}
