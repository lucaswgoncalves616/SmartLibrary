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

    public static Book registerNewBook() {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String title = " ";
        int year = 0;
        boolean loaned = false;
        String author = " ";
        int pages = 0;

        Book book = new Book(id, title, year, loaned, author, pages);

        System.out.println("Quer adicionar um livro? ");

        String response = sc.nextLine();
        while(response.equalsIgnoreCase("sim")) {
            book.id++;

            System.out.println("Digite o nome do livro: ");
            book.title = sc.nextLine();

            System.out.println("Digite o ano do livro: ");
            book.year = sc.nextInt();
            sc.nextLine();

            book.loaned = false;

            System.out.println("Digite o autor do livro: ");
            book.author = sc.nextLine();

            System.out.println("Quantas páginas tem o livro? ");
            book.pages = sc.nextInt();
            sc.nextLine();

            //book = new Book(id, title, year, loaned, author, pages);

            System.out.println("Deseja adicionar outro livro? ");
            response = sc.nextLine();
        }
        return book;
    }

}
