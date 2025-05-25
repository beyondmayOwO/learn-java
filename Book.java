public class Book {
    private String title;
    private int pages;
    private int publishYear;

    public Book (String title, int pages, int publishYear) {
        this.title = title;
        this.pages = pages;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publishYear;
    }
}