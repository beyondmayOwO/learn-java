package GenericTypeParameter.GenericInterfaces.ImplementWithConcreteType;

public class Main {
    public static void main(String[] args) {
        MovieList myMovies = new MovieList();

        myMovies.add(new Movie("The Matrix"));
        myMovies.add(new Movie("Inception"));
        System.out.println("First movie: " + myMovies.get(0));
    }
}
