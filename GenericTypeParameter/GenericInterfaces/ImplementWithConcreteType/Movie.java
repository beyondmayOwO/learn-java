package GenericTypeParameter.GenericInterfaces.ImplementWithConcreteType;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie: " + title;
    }
}
