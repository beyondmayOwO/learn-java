package MethodTakeObjectAndReturnObject;

public class Main {
    public static void main(String[] args) {
        NumberBox box1 = new NumberBox(10);
        NumberBox box2 = new NumberBox(20);

        NumberBox resultBox = box1.add(box2);
        
        System.out.println("Result: " + resultBox.value);
    }
}
