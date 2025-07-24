package GenericTypeParameter.GenericInterfaces.ImplementWithConcreteType;

import java.util.ArrayList;

// 2 ways to implement generic interfaces

// 1st one: The class that implements the generic interface fixes the type parameter at its definition.
// Designed to work with only one specific type
// Here it only handles Movie objects

public class MovieList implements List<Movie> {
    private ArrayList<Movie> movies;

    public MovieList() {
        this.movies = new ArrayList<>();
    }

    @Override
    public void add(Movie value) {
        movies.add(value);
    }

    @Override
    public Movie get(int index) {
        return movies.get(index);
    }

    @Override
    public Movie remove(int index) {
        Movie removedMovie = movies.get(index);
        movies.remove(index);
        return removedMovie;
    }
}
