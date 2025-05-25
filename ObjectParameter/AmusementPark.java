package ObjectParameter;

public class AmusementPark {
    private String name;
    private int lowestHeight;

    public AmusementPark(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    public boolean allowedToRide(Person person) {
        if(person.getHeight() < this.lowestHeight) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight;
    }
}
