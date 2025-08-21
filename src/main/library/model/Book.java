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

        int id = 1;
        String title = "50 Tons";
        int year = 2017;
        boolean loaned = false;
        String author = "E L James";
        int pages = 340;

        Book book = new Book(id, title, year, loaned, author, pages);

        System.out.println("Vamos adicionar um livro");

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
