package library;
import library.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 1;
        String title = "50 Tons";
        int year = 2017;
        boolean loaned = false;
        String author = "E L James";
        int pages = 340;

        Book newBook = new Book(id, title, year, loaned, author, pages);
        LibraryItems library = new LibraryItems();

        library.registerNewItem(newBook.registerNewBook());
        library.showInfo();

    }
}
