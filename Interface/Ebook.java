package Interface;

import java.util.ArrayList;

public class Ebook implements Reader {
    private ArrayList<String> pages;
    private int pageNumber = 0;

    public Ebook(ArrayList<String> pages) {
        this.pages = pages;
    }

    // Must implement read() method
    public String read() {
        String page = pages.get(pageNumber);
        pageNumber++;
        return page;
    }
}
