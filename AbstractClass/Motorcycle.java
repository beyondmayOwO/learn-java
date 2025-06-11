package AbstractClass;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String engineType, boolean hasSidecar) {
        super(brand, 2, engineType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " Motorcycle is revving up and running.");
    }

    @Override
    public void brake() {
        System.out.println(brand + " Motorcycle is using combined breaking systems");
    }

    public void leanIntoTurn() {
        System.out.println(brand + " Motorcycle is leaning into the turn.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
