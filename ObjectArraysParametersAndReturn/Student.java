package ObjectArraysParametersAndReturn;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    // Methods can work with arrays of objects — either receiving them or returning them.
    public static void greetAll(Student[] students) {
        for(Student s: students) {
            System.out.println("Hello, " + s.name + "!");
        }
    }
}
