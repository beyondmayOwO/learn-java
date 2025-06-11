package AbstractClass;

public class VehicleDemo {
    public static void main(String[] args) {

        // You CANNOT create an instance of an abstract class directly:
        // Vehicle myGenericVehicle = new Vehicle("Generic", 4, "Gas"); // This would cause a compile-time error!

        System.out.println("--- Creating a Car object ---");
        Car myCar = new Car("Toyota", "Gasoline", 4);
        myCar.displayInfo();;
        myCar.accelerate(); // Calls Car's specific accelerate method
        myCar.brake();      // Calls Car's specific brake method
        myCar.openTrunk();
        myCar.stopEngine();
        System.out.println("\n");

        System.out.println("--- Creating a Motorcycle object ---");
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "V-Twin", true);
        myMotorcycle.displayInfo();
        myMotorcycle.accelerate(); // Calls Motorcycle's specific accelerate method
        myMotorcycle.brake();      // Calls Motorcycle's specific brake method
        myMotorcycle.leanIntoTurn();
        myMotorcycle.stopEngine();
        System.out.println("\n");

        // Polymorphism: You can declare a variable of the abstract type and assign a concrete subclass object to it.
        // This is powerful because it allows you to treat different specific vehicles generically when needed.

        System.out.println("--- Demonstrating Polymorphism ---");
        Vehicle anotherVehicle = new Car("Honda", "Electric", 2);
        anotherVehicle.displayInfo();
        anotherVehicle.accelerate(); // Still calls Car's accelerate method
        anotherVehicle.brake();

        // You cannot call openTrunk() directly on anotherVehicle because it's
        // declared as a Vehicle type, even though it's a Car object at runtime.
        // To call openTrunk(), you'd need to cast it: ((Car)anotherVehicle).openTrunk();

        System.out.println("\n");

        Vehicle yetAnotherVehicle = new Motorcycle("Kawasaki", "Inline-4", false);
        yetAnotherVehicle.displayInfo();
        yetAnotherVehicle.accelerate(); // Still calls Motorcycle's accelerate method
        yetAnotherVehicle.brake();
    }
}
