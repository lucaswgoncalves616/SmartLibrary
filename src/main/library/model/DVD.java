package library.model;


public class DVD extends Item{
    protected int length;

    public DVD(int id, String title, int year, boolean loaned, int length) {
        super(id, title, year, loaned);
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}
