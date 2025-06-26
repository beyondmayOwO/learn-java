package Enums;

public class Main {
    public static void main(String[] args) {
        // TrafficLightColor.RED = RED
        TrafficLight streetLight = new TrafficLight(TrafficLightColor.RED);

        System.out.println(streetLight);

        streetLight.changeColor(TrafficLightColor.GREEN);
        System.out.println(streetLight);

        // You can directly compare enum constants using "==" because each enum constant gets a unique numberic code
        if(streetLight.getCurrentColor() == TrafficLightColor.YELLOW) {
            System.out.println("The light is yellow!");
        } else {
            System.out.println("The light is not yellow.");
        }

        // The ordinal() method returns the position of an enum constant in its declaration, starting from 0
        System.out.println("Ordinal of YELLOW: " + TrafficLightColor.YELLOW.ordinal());
        System.out.println("Ordinal of RED: " + TrafficLightColor.RED.ordinal());
        System.out.println("Ordinal of GREEN: " + TrafficLightColor.GREEN.ordinal());

        // While '==' is generally preferred for enum comparison, equals() also works.
        if(streetLight.getCurrentColor().equals(TrafficLightColor.GREEN)) {
            System.out.println("The current light color is indeed is green using equals.");
        }

        // Using enums object references. 
        // Accessing the meaning and duration associated with the color constants.
        System.out.println("RED Light: Meaning = " + TrafficLightColor.RED.getMeaning() + ", Duration = " + TrafficLightColor.RED.getDuration());
        System.out.println("YELLOW Light: Meaning = " + TrafficLightColor.YELLOW.getMeaning() + ", Duration = " + TrafficLightColor.YELLOW.getDuration());
        System.out.println("GREEN Light: Meaning = " + TrafficLightColor.GREEN.getMeaning() + ", Duration = " + TrafficLightColor.GREEN.getDuration());

        // You can also store an enum constant in a variable and then access its data.
        TrafficLightColor currentLightState = TrafficLightColor.YELLOW;
        System.out.println("Current the light is " + currentLightState + ". " + "Meaning = " + currentLightState.getMeaning() + ", Duration = " + currentLightState.getDuration());
    }
}
