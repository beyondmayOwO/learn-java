package objectOfSameTypeAsMethodParameter;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Charlie");

        // Pass dog2 object as the argument
        dog1.sayHelloTo(dog2);
    }
}
