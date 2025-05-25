package ObjectParameter;

public class Main {
    public static void main(String[] args) {
        Person matt = new Person("Matt");
        matt.setWeight(86);
        matt.setHeight(180);

        Person jasper = new Person("Jasper");
        jasper.setWeight(34);
        jasper.setHeight(132);

        AmusementPark waterTrack = new AmusementPark("Water Track", 140);

        if (waterTrack.allowedToRide(matt)) {
            System.out.println(matt.getName() + " may enter the ride.");
        } else {
            System.out.println(matt.getName() + " may NOT enter the ride.");
        }

        if(waterTrack.allowedToRide(jasper)) {
            System.out.println(jasper.getName() + " may enter the ride.");
        } else {
            System.out.println(jasper.getName() + " may NOT enter the ride.");
        }

        System.out.println(waterTrack);
    }
}
