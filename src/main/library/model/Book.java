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

    @Override
    public Item newBook(String title, int year, String author, int pages) {
        this.setId(this.getId()+1);
        return new Book(this.getId(), title, year, false, author, pages);
    }

    @Override
    public String toString() {
        return String.format("""
                Id: %d
                Nome: %s
                Ano: %d
                Autor: %s
                Quantidade de páginas: %d
                """,this.getId(), this.getTitle(), this.getYear(), this.getAuthor(), this.pages);
    }
}
