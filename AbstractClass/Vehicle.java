package AbstractClass;

public abstract class Vehicle {
    protected String brand;
    protected int wheels;
    protected String engineType;

    public Vehicle(String brand, int wheels, String engineType) {
        this.brand = brand;
        this.wheels = wheels;
        this.engineType = engineType;
    }

    public void stopEngine() {
        System.out.println(brand + " vehicle's engine is stopping");
    }

    public abstract void accelerate();

    public abstract void brake();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
        System.out.println("Engine Type: " + engineType);
    }
}
