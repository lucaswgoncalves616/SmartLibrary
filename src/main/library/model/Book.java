package library.model;

import java.util.ArrayList;

public class Book {
    private ArrayList<ArrayList<Object>> booksList = new ArrayList<>();

    public ArrayList<ArrayList<Object>> getBooksList() {
        return booksList;
    }

    public void setBook(int id, String title, int year, boolean loaned, String author, int pages) {
        ArrayList<Object> book = new ArrayList<>();
        book.add(id);
        book.add(title);
        book.add(year);
        book.add(loaned);
        book.add(author);
        book.add(pages);
        this.booksList.add(book);
    }
}
