package ObjectArraysParametersAndReturn;

public class Main {
    public static void main(String[] args) {
        Student[] group = {
            new Student("Alice"),
            new Student("Bob"),
            new Student("Clara")
        };

        Student.greetAll(group);
    }
}
