package library;
import library.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book books = new Book();
        Magazine magazines = new Magazine();
        DVD dvds = new DVD();

        books.setBook(1, "50 tons", 2017, true, "E L James", 340);
        magazines.setMagazine(2, "Playboy", 2006, true, "Nyvi Estephan");
        dvds.setDVD(3, "Memento", 1996, true, 340);

        System.out.println("Livros: ");
        System.out.println(books.getBooksList());

        System.out.println("Revistas: ");
        System.out.println(magazines.getMagazinesList());

        System.out.println("DVDs: ");
        System.out.println(dvds.getDVDsList());
    }
}
