package library.model;

import java.util.ArrayList;

public class LibraryItems{
    private ArrayList<ArrayList<Object>> booksList = new ArrayList<>();
    private ArrayList<ArrayList<Object>> magazinesList = new ArrayList<>();
    private ArrayList<ArrayList<Object>> DVDsList = new ArrayList<>();

    public ArrayList<ArrayList<Object>> getBooksList() {
        return booksList;
    }

    public ArrayList<ArrayList<Object>> getMagazinesList() {
        return magazinesList;
    }

    public ArrayList<ArrayList<Object>> getDVDsList() {
        return DVDsList;
    }

    public void setBook(int id, String title, int year, boolean loaned, String author, int pages) {
        ArrayList<Object> book = new ArrayList<>();
        book.add(id);
        book.add(title);
        book.add(year);
        book.add(loaned);
        book.add(author);
        book.add(pages);
        booksList.add(book);
    }

    public void setMagazine(int id, String title, int year, boolean loaned, String edition) {
        ArrayList<Object> magazine = new ArrayList<>();
        magazine.add(id);
        magazine.add(title);
        magazine.add(year);
        magazine.add(loaned);
        magazine.add(edition);
        magazinesList.add(magazine);
    }

    public void setDVD(int id, String title, int year, boolean loaned, int duration) {
        ArrayList<Object> DVD = new ArrayList<>();
        DVD.add(id);
        DVD.add(title);
        DVD.add(year);
        DVD.add(loaned);
        DVD.add(duration);
        DVDsList.add(DVD);
    }
}
