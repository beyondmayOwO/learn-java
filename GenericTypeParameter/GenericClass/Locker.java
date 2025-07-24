package GenericTypeParameter.GenericClass;

// Generic type parameter - placeholder for a specific type that will be decided at the moment an object is created
// T for Type, K for Key, V for Value
// Just like List<Integer>, Map<String, Integer>. They are the generic class interfaces.

public class Locker<T> {

    // Store the object that the locker holds
    private T element;

    public void setValue(T element) {
        this.element = element;
    }

    public T getValue() {
        return element;
    }
}
