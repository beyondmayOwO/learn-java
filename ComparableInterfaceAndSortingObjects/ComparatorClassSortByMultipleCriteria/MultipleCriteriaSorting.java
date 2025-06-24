package ComparableInterfaceAndSortingObjects.ComparatorClassSortByMultipleCriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;  // We need this import for Comparator class
import java.util.List;

// Comparator class to chain multile criteria. 
// If one property is equal then sort by another crieria. Eg, if the release years is the same then sort by the name
// Comparator.comparing(Class::method)
// .thenComparing(Class::method)

public class MultipleCriteriaSorting {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000)); 
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        System.out.println("Original film list order:");
        films.forEach(film -> System.out.println(film));

        Comparator<Film> comparator = Comparator
            .comparing(Film::getReleaseYear)
            .thenComparing(Film::getReleaseYear);
        
        System.out.println("Sorted by release year, then by name:");
        Collections.sort(films, comparator);
        films.forEach(film -> System.out.println(film));
    }
}
