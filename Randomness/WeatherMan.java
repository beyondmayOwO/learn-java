package Randomness;

import java.util.Random;

public class WeatherMan {
    private Random random;

    public WeatherMan() {
        this.random = new Random();
    }

    public String forecast() {
        double probability = random.nextDouble();

        if(probability <= 0.1) {
            return "It rains";
        } else if (probability <= 0.4) {
            return "It snows";
        } else {
            return "The sun shines";
        }
    }

    public int makeAForecast() {
        return (int) (4 * random.nextGaussian() - 3);
    }
}
