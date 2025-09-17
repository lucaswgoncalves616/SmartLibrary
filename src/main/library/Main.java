package library;
import library.model.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item book = new Book(0, "", 0, false, "", 0);

        LibraryItems.addNewItem(book.newBook("50 tons", 2017, "E L James", 340));
        LibraryItems.addNewItem(book.newBook("60 tons", 2019, "E L James", 360));
        LibraryItems.addNewItem(book.newBook("70 tons", 2021, "E L James", 370));


        System.out.println(LibraryItems.getItemList().get(1));
    }
}
