package Algorithms.SelectionSort;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // Arrays
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));

        // Sort the numbers
        // toString only there for print
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // Array lists
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(3);
        numbers.add(7);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}

// Built-in sorting algorithms work for value-types variablse
// But needs to modified for classes