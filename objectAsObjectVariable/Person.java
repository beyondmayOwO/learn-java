package objectAsObjectVariable;

public class Person {
    private String name;
    
    // Object as an another object's variable here
    private SimpleDate birthday;

    public Person(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + ", born on " + birthday;
    }
}
