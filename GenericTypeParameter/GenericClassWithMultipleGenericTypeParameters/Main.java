package GenericTypeParameter.GenericClassWithMultipleGenericTypeParameters;

public class Main {
    public static void main(String[] args) {
        
        // Using Pair with String and Integer types
        Pair<String, Integer> studentGrade = new Pair<>();
        
        studentGrade.setValues("Alice", 95);
        System.out.println("Student: " + studentGrade.getFirst() + ", Grade: " + studentGrade.getSecond());

        // Using Pair with Integer and Double types
        Pair<Integer, Double> coordinates = new Pair<>();
        
        coordinates.setValues(10, 20.5);
        System.out.println("X: " + coordinates.getFirst() + ", Y: " + coordinates.getSecond());
    }
}
