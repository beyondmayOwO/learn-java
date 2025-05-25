package overload;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public String toString() {
        return this.name + " is " + this.age + " years old.";
    }
}
