package practice;

import java.util.Scanner;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String fileName = inputScanner.nextLine();

        try(Scanner fileScanner = new Scanner(Path.of(fileName))) {
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + ", age: " + age + " years old.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
