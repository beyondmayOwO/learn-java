package GenericTypeParameter.GenericInterfaces.ImplementWithGenericType;

import java.util.ArrayList;

// 2nd one (alternative one: Keeping it Generic)
// The implementing class itself is generic, pass its own type parameter
// GeneralList class will be able to handle any type T that is specified when a GeneralList object is created

public class GeneralList<T> implements List<T> {
    private ArrayList<T> values;

    public GeneralList() {
        this.values = new ArrayList<>();
    }

    @Override
    public void add(T value) {
        values.add(value);
    }

    @Override
    public T get(int index) {
        return values.get(index);
    }

    @Override
    public T remove(int index) {
        T value = values.get(index);
        values.remove(index);
        return value;
    }
}
