package WriteToAFile;

import java.io.PrintWriter;

public class WritingMethodsExample {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("my_writing_demo.txt");

            // Using println(): writes the string and then moves to the next line in the file
            writer.println("Hello file!");
            writer.println("More text on the new line!");

            // Using print(): writes the string without adding a new line
            writer.print("This text ");
            writer.print("stays on ");
            writer.print("the same line.");

            // If you want a new line after using print, you need to add it manually:
            writer.print("\nThis is a new line after a manual line break.");

            // Important to close to finally save the changes to the file!
            writer.close();

            System.out.println("Text written to 'my_writing_demo.txt' successflly.");
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
