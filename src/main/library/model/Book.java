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

    Book book = new Book(id, title, year, loaned, author, pages);

    public Book registerNewBook(){
        System.out.println("Vamos adicionar um livro");

        while(response.equalsIgnoreCase("sim")) {
            this.id++;

            System.out.println("Digite o nome do livro: ");
            this.title = sc.nextLine();

            System.out.println("Digite o ano do livro: ");
            this.year = sc.nextInt();
            sc.nextLine();

            this.loaned = false;

            System.out.println("Digite o autor do livro: ");
            this.author = sc.nextLine();

            System.out.println("Quantas páginas tem o livro? ");
            this.pages = sc.nextInt();
            sc.nextLine();

            book = new Book(id, title, year, loaned, author, pages);

            System.out.println("Deseja adicionar outro livro? ");
            response = sc.nextLine();
        }
        return book;
    }
}
