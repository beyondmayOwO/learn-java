package GenericTypeParameter.GenericInterfaces.ImplementWithGenericType;

public class Main {
    public static void main(String[] args) {
        GeneralList<String> stringList = new GeneralList<>();

        stringList.add("One");
        stringList.add("Two");
        System.out.println("String a index 0: " + stringList.get(0));

        GeneralList<Integer> integerList = new GeneralList<>();

        integerList.add(100);
        integerList.add(200);
        System.out.println("Integer at index 1: " + integerList.get(1));
    }
}
