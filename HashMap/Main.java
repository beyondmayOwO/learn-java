package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap<String, String> postalCodes = new HashMap<>();

        // postalCodes.put("980404", "Here");
        // postalCodes.put("39930", "There");
        // postalCodes.put("343434", "Oh!");

        // System.out.println(postalCodes.get("39930"));
        // System.out.println(postalCodes.get("56567")); // null

        // 

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();

        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();

        System.out.println(library.getBook("SENSE"));
    }
}
