package library.model;

public class Item {
    private String id;
    private String title;
    private int year;
    private boolean loaned;

    Item(String id, String title, int year, boolean loaned) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.loaned = loaned;
    }

    @Override
    public String toString(){
        return "Id: " + this.id +
                " Titulo: " + this.title +
                " Ano: " + this.year +
                " Emprestado: " + this.loaned;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

}
