package SeparateUserInterface.GradingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();

        UserInterface userInterface = new UserInterface(scanner, grades);
        userInterface.start();
    }
}