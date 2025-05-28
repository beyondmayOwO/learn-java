package SeparateUserInterface.GradingSystem;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Grades grades;

    public UserInterface (Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        takePoints();
        grades.starPoint();
    }

    public void takePoints() {
        while (true) {
            System.out.print("Point: ");
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }

            // Change the input to integer from String for calculations
            int point = Integer.valueOf(input);

            if (point < 0 || point > 100) {
                System.out.println("Invalid point");
            } else {
                grades.add(point);
            }
        }
    }
}