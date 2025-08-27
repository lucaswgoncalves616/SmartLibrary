package library.model;


import java.util.Scanner;

public class Book extends Item{
    Scanner sc = new Scanner(System.in);
    String response = " ";

    protected String author;
    protected int pages;

    public Book(int id, String title, int year, boolean loaned, String author, int pages) {
        super(id, title, year, loaned);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public static Book createNewBook() {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String title = " ";
        int year = 0;
        boolean loaned = false;
        String author = " ";
        int pages = 0;

        System.out.println("Quer adicionar um livro? ");

        String response = sc.nextLine();
        while(response.equalsIgnoreCase("sim")) {
            id++;

            System.out.println("Digite o nome do livro: ");
            title = sc.nextLine();

            System.out.println("Digite o ano do livro: ");
            year = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o autor do livro: ");
            author = sc.nextLine();

            System.out.println("Quantas páginas tem o livro? ");
            pages = sc.nextInt();
            sc.nextLine();

            System.out.println("Deseja adicionar outro livro? ");
            response = sc.nextLine();
        }
        return new Book(id, title, year, loaned, author, pages);
    }


}
