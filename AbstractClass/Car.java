package AbstractClass;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String engineType, int numberOfDoors) {
        super(brand, 4, engineType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " Car is applying disc brakes.");
    }

    @Override
    public void brake() {
        System.out.println(brand + " Car is braking.");
    }
    
    public void openTrunk() {
        System.out.println(brand + " Car's trunk is opening");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
