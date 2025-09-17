package library.model;

public abstract class Item {
    private int id;
    private String title;
    private int year;
    private boolean loaned;

    public Item(int id, String title, int year, boolean loaned) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.loaned = loaned;
    }

    public abstract Item newBook(String title, int year, String author, int pages);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLoaned() {
        return loaned;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public String mostrarInfo() {
        return "Item: " + this.title +
                "\nAno: " + this.year +
                "\nStatus: " + (loaned ? "\nEmprestado" : "Não emprestado");
    }
}
