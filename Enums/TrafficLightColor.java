package Enums;

// Enums (Enumerated Types) = special kind of class to defind fixed set of named constants
public enum TrafficLightColor {
    RED("Stop", 30),
    YELLOW("Yield", 5),
    GREEN("Go", 45);

    private String meaning;
    private int duration;

    private TrafficLightColor(String meaning, int duration) {
        this.meaning = meaning;
        this.duration = duration;
    }

    public String getMeaning() {
        return meaning;
    }

    public int getDuration() {
        return duration;
    }
}
