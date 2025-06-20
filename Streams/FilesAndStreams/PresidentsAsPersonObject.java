package Streams.FilesAndStreams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class PresidentsAsPersonObject {
    public static void main(String[] args) {
        List<Person> presidents = new ArrayList<>();

        try {
            // "lines" method from the "Files" class creates input stream from a file, allowing to read line by line
            // The file must be at the root folder to works
            Files.lines(Paths.get("presidents.txt"))

                // Split the parts by the semicolon
                .map(row -> row.split(";"))

                // Make sure to filter the parts that has two or more parts
                .filter(parts -> parts.length >= 2)

                // Create new Person class from the parts. Trim before converting to integer to avoid the whitespace at the front of the semicolon
                .map(parts -> new Person(parts[0], Integer.valueOf(parts[1].trim())))

                // Add new Person to the list
                .forEach(person -> presidents.add(person));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for(Person president : presidents) {
            System.out.println(president.getName());
        }
    }
}
