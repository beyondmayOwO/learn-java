package SeparateUserInterface;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDoList;

    public ToDoList() {
        this.toDoList = new ArrayList<>();
    }

    // Take the task user enters and add it to the list
    public void add(String task) {
        toDoList.add(task);
    }

    // List all the tasks in the list
    public void list() {
        for(String task: toDoList) {
            System.out.println((toDoList.indexOf(task) + 1) + ": " + task);
        }
    }

    // Remove the list the user enters
    public void remove(int completedTask) {
        toDoList.remove(completedTask - 1);
    }
}
