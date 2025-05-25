package ObjectParameter;

public class Person {
    private String name;
    private int height;
    private int weight;

    public Person(String name) {
        this.name = name;
        this.height = 0;
        this.weight = 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";
    }

    // public void setWeight(int weight) {
    //     this.weight = weight;
    // }

    // public void setHeight(int height) {
    //     this.height = height;
    // }

    // public int getWeight() {
    //     return this.weight;
    // }

    // public int getHeight() {
    //     return this.height;
    // }

    // public String getName() {
    //     return this.name;
    // }
}
