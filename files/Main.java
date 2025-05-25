package files;

import java.util.Scanner;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = inputScanner.nextLine();

        try (Scanner fileScanner = new Scanner(Path.of(fileName))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println("Name: " + name + " Age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
