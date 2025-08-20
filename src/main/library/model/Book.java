package library.model;


public class Book extends Item{
    private String author;
    private int pages;

    public Book(String id, String title, int year, boolean loaned, String author, int pages) {
        super(id, title, year, loaned);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }
}
