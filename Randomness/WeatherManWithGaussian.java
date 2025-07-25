package Randomness;

import java.util.Random;

public class WeatherManWithGaussian {
    private Random random;

    public WeatherManWithGaussian() {
        this.random = new Random();
    }

    public int makeAForecast() {
        return (int) (4 * random.nextGaussian() - 3);
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
}
