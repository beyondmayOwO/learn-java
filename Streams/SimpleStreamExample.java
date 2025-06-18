package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);

        System.out.println("Original List: " + numbers);

        ArrayList<Integer> processedNumbers = numbers.stream()
            .filter(value -> value > 5)
            .map(value -> value * 2)
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Processsed List: " + processedNumbers);
    }
}
