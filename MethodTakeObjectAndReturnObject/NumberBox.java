package MethodTakeObjectAndReturnObject;

public class NumberBox {
    int value;

    public NumberBox(int value) {
        this.value = value;
    }

    // Takes object as parameter and return new object of the same class
    public NumberBox add(NumberBox otherBox) {
        return new NumberBox(this.value + otherBox.value);
    }
}
