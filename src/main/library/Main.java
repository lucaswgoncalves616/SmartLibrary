package library;
import library.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryItems items = new LibraryItems();

        System.out.println("Livros: ");
        System.out.println(items.getBooksList());

        System.out.println("Revistas: ");
        System.out.println(items.getMagazinesList());

        System.out.println("DVDs: ");
        System.out.println(items.getDVDsList());
    }
}
