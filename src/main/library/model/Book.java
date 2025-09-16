package library.model;


public class Book extends Item{
    private String author;
    private int pages;

    public Book(int id, String title, int year, boolean loaned, String author, int pages) {
        super(id, title, year, loaned);
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Item newBook(String title, int year, String author, int pages) {
        this.setId(+1);
        return new Book(this.getId(), title, year, false, author, pages);
    }
}
