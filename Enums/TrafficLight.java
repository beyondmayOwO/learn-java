package Enums;

public class TrafficLight {
    private TrafficLightColor currentColor;

    public TrafficLight(TrafficLightColor currentColor) {
        this.currentColor = currentColor;
    }

    public void changeColor (TrafficLightColor newColor) {
        this.currentColor = newColor;
    }

    public TrafficLightColor getCurrentColor() {
        return currentColor;
    }

    @Override
    public String toString() {
        return "Current Light Color: " + currentColor;
    }
}
