package SeparateUserInterface.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        UserInterface userInterface = new UserInterface(toDoList, scanner);
        userInterface.start();
    }
}
