package objectOfSameTypeAsMethodParameter;

public class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    // Dog object as a paramter
    public void sayHelloTo(Dog otherDog) {
        System.out.println("Woof! I am " + name + ". Hello, " + otherDog.name  + "!");
    }
}
