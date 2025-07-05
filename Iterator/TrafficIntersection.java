package Iterator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// An Iterator is like a "finger" that points to items in a list, allowing you to move from one item to the next and even remove items safely.
// Traditional for-loops, for-each loops have problems. 
// If you remove or change the list in the middle of looping, it gets "confused" and throw ConcurrentModificationException error

// Key iterator methods
// hasNext() - checks if the next element exist (return true or false)
// next() - if hasNext() returns true, it points "the finger" to the next element
// remove() - remove the element that was returned by next()

public class TrafficIntersection {
    private List<TrafficLight> lights;

    public TrafficIntersection() {
        this.lights = new ArrayList<>();
    }

    public void addLight(TrafficLight light) {
        this.lights.add(light);
    }

    // Method to print all lights in the intersection using an Iterator
    public void printLights() {
        // Request an Iterator object from our 'lights' list
        Iterator<TrafficLight> iterator = lights.iterator();

        // while loop that continues as long as there are more elements
        while(iterator.hasNext()) {
            TrafficLight currentLight = iterator.next();
            System.out.println(currentLight);
        }
    }

    // Method to remove the specific light
    public void removeSpecificLight(TrafficLightColor colorToRemove) {
        Iterator<TrafficLight> iterator = lights.iterator();

        while(iterator.hasNext()) {
            TrafficLight currentLight = iterator.next();

            if(currentLight.getColor() == colorToRemove) {
                iterator.remove();
                System.out.println("Removed: " + currentLight);
            }
        }
    }
}
