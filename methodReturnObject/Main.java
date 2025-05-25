package methodReturnObject;

public class Main {
    public static void main(String[] args) {
        Cat cat1= new Cat("Luna");
        Cat cat2 = cat1.cloneCat();

        System.out.println("Original cat: " + cat1.name);
        System.out.println("Cloned cat: " + cat2.name);
    }
}
