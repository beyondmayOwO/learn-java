package ObjectListAndPrintFromList;

public class Main {
    public static void main(String[] args) {
        Person matt = new Person("Matt");
        matt.setHeight(180);

        AmusementParkRide train = new AmusementParkRide("Train Ride", 170);

        train.isAllowed(matt);

        System.out.println(train);

        train.removeEveryoneRiding();

        System.out.println(train);
    }
}
