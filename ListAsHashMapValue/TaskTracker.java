package ListAsHashMapValue;

import java.util.HashMap;
import java.util.ArrayList;

public class TaskTracker {
    // ArrayList as the hash map value
    private HashMap<String, ArrayList<Integer>> completedExercise;

    public TaskTracker() {
        this.completedExercise = new HashMap<>();
    }

    public void add(String user, int exercise) {
        // an empty list has to be added for a new user if one has not already been added
        completedExercise.putIfAbsent(user, new ArrayList<>());

        completedExercise.get(user).add(exercise);
    }

    public void print() {
        for(String name: completedExercise.keySet()) {
            System.out.println(name + ": " + completedExercise.get(name));
        }
    }
}
