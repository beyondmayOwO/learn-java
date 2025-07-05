package Iterator;

public class TrafficLight {
    private TrafficLightColor color;

    public TrafficLight(TrafficLightColor color) {
        this.color = color;
    }

    public TrafficLightColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Light is: " + color;
    }
}
