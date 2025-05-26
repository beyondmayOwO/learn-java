package RetrieveSpecificObjectFromList;

import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int minHeight;
    private int visitors;
    // List from another object as instance variable
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minHeight) {
        this.name = name;
        this.minHeight = minHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    // Allowed on the ride if the person is taller than minimum height
    public boolean isAllowed(Person person) {
        if(person.getHeight() < this.minHeight) {
            return false;
        }

        this.visitors++;
        this.riding.add(person);
        return true;
    }

    // Return the String of allowed riders on the list
    public String allRiding() {
        String onTheRide = "";

        for (Person person: riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        return onTheRide;
    }

    // clear list method removes everything from the list
    public void removeEveryoneRiding() {
        this.riding.clear();
    }

    public Person getTallest() {

        // return a null reference if there's no one on the ride
        if (this.riding.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.riding.get(0);

        for(Person person: riding) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the tallest,
            if (returnObject.getHeight() < person.getHeight()) {
                returnObject = person;
            }
        }

        return returnObject;
    }

    @Override
    public String toString() {
        return this.name + ", minimum height requirement: " + this.minHeight + ", visitors: " + this.visitors + "\n" + "Riding:\n " + allRiding();
    }
}
