package objectAsObjectVariable;

public class Main {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(27, 11, 2003);
        System.out.println(date);

        Person matt = new Person("Matt", new SimpleDate(5, 10, 2000));
        System.out.println(matt);
    }
}
