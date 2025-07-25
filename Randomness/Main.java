package Randomness;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WeatherManWithGaussian forecaster = new WeatherManWithGaussian();

        ArrayList<String> days = new ArrayList<>();

        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        days.add("sun");

        System.out.println("Next week's weather forecast: ");

        for(String day: days) {
            String weatherForecast = forecaster.forecast();
            int temperatureForecast = forecaster.makeAForecast();

            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
        }
    }
}
