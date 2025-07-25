package Randomness;

import java.util.Random;

public class BasicRandomExample {
    public static void main(String[] args) {
        Random dice = new Random();

        System.out.println("Generating 5 random numbers between 0 and 9:");

        for(int i = 0; i < 5; i++) {
            int randomNumber = dice.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
