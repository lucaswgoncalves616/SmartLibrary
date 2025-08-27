package library;
import library.model.*;

import java.util.Scanner;

import static library.model.Book.createNewBook;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryItems library = new LibraryItems();

        library.registerNewItem(createNewBook());
        library.showInfo();

    }
}
