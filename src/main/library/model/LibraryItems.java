package library.model;

import java.util.ArrayList;

public class LibraryItems{
    private ArrayList<ArrayList<Object>> books = new ArrayList<>();
    private ArrayList<ArrayList<Object>> magazines = new ArrayList<>();
    private ArrayList<ArrayList<Object>> DVDs = new ArrayList<>();

    public static ArrayList<Object> newBook(int id, String title, int year, boolean loaned, String Author, int pages) {
        Book newBook = new Book();

        ArrayList<Object> book = new ArrayList<>();

    }

    public static ArrayList<Object> newMagazine(int id, String title, int year, boolean loaned, String edition) {

    }

    public static ArrayList<Object> newDVD(int id, String title, int year, boolean loaned, int duration) {

    }
}
