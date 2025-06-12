package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Polymorphism can be used with interface
        Reader r1 = new TextMessage("Hello, world!");
        System.out.println(r1.read());

        ArrayList<String> pages = new ArrayList<>();
        pages.add("Page 1");
        pages.add("Page 2");

        Reader r2 = new Ebook(pages);
        System.out.println(r2.read());
        System.out.println(r2.read());
    }
}
