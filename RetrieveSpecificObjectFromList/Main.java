package RetrieveSpecificObjectFromList;

public class Main {
    public static void main(String[] args) {
        Person matt = new Person("Matt");
        matt.setHeight(180);

        Person john = new Person("John");
        john.setHeight(200);

        AmusementParkRide train = new AmusementParkRide("Train Ride", 170);

        train.isAllowed(matt);
        train.isAllowed(john);

        System.out.println(train);

        // Tallest person object
        Person tallest = train.getTallest();
        System.out.println(tallest.getName());
    }
}
