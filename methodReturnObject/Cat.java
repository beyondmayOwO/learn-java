package methodReturnObject;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    // Return type = Cat object
    public Cat cloneCat() {
        return new Cat(name);
    }
}
