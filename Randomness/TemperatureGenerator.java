package Randomness;

import java.util.Random;

public class TemperatureGenerator {
    public static void main(String[] args) {
        Random weatherMan = new Random();

        int temperature = weatherMan.nextInt(81) - 30;
        System.out.println("Current temperature forecast: " + temperature + " degrees.");
    }
}
