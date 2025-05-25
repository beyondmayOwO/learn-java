package exercise;

public class Main {
    public static void main(String[] args) {
        Song garden = new Song("In the Garden", 10910);

        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
