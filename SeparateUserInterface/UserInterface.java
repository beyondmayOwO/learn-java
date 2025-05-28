package SeparateUserInterface;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ToDoList toDoList;

    public UserInterface(ToDoList toDoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = toDoList;
    }

    // Program runs until user commands stop
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                this.add();
            } else if (command.equalsIgnoreCase("list")) {
                toDoList.list();
            } else if (command.equalsIgnoreCase("completed")) {
                this.remove();
            } else if (command.equalsIgnoreCase("stop")) {
                break;
            }
        }
    }

    // Add the task
    public void add() {
        System.out.print("Task: ");
        String task = scanner.nextLine();
        toDoList.add(task);
    }

    // Remove the task
    public void remove() {
        System.out.print("Which task was completed? ");
        int completedTask = Integer.valueOf(scanner.nextLine());
        toDoList.remove(completedTask);

        System.out.println("Task " + completedTask + " is removed");
    }
}
