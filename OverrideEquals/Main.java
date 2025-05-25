package OverrideEquals;

public class Main {
    public static void main(String[] args) {
        SimpleDate myBirthday = new SimpleDate(27, 11, 2003);
        SimpleDate hisBirthday = new SimpleDate(27, 11, 2003);

        System.out.println(myBirthday.equals(hisBirthday));
    }
}
