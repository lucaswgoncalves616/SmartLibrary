package library.model;

public class Item {
    protected int id;
    protected String title;
    protected int year;
    protected boolean loaned;

    Item(int id, String title, int year, boolean loaned) {
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

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

}
