package GenericTypeParameter.GenericClass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Using Locker with String type
        Locker<String> stringLocker = new Locker<>();

        stringLocker.setValue("Hello Generics!");
        System.out.println(stringLocker.getValue());

        // Using Locker with Integer type
        Locker<Integer> integerLocker = new Locker<>();
        
        integerLocker.setValue(123);
        System.out.println(integerLocker.getValue());

        // Using Locker with a custom Random object type
        Locker<Random> randomLocker = new Locker<>();

        randomLocker.setValue(new Random());
        System.out.println(randomLocker.getValue().nextDouble());
    }
}
