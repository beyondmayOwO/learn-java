package Iterator;

public class Main {
    public static void main(String[] args) {
        TrafficIntersection intersection = new TrafficIntersection();

        // Add some traffic lights to our intersection
        intersection.addLight(new TrafficLight(TrafficLightColor.RED));
        intersection.addLight(new TrafficLight(TrafficLightColor.GREEN));
        intersection.addLight(new TrafficLight(TrafficLightColor.YELLOW));
        intersection.addLight(new TrafficLight(TrafficLightColor.RED)); // Another RED light
        intersection.addLight(new TrafficLight(TrafficLightColor.GREEN));

        // Print all initial lights
        intersection.printLights();

        // Safely remove all RED lights using the Iterator's remove() method
        intersection.removeSpecificLight(TrafficLightColor.RED);
        intersection.printLights();

        // Safely remove all YELLOW lights
        intersection.removeSpecificLight(TrafficLightColor.YELLOW);
        intersection.printLights();
    }
}
