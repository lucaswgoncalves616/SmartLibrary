package library.model;

public class Item {
    private int id;
    private String title;
    private int year;
    private boolean loaned;

    public void setId(int id) {
        this.id = id;
    }

    public void setLoaned(boolean loaned) {
        this.loaned = loaned;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
