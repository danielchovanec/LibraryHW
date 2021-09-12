import java.util.Scanner;

public class Book {

    public Book() {
        System.out.print("Enter name of the book: ");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.print("Enter author of the book: ");
        this.author = sc.nextLine();
        System.out.print("Enter number of pages of the book: ");
        this.numberOfPages = sc.nextInt();
        this.id = maxId;
        maxId++;
    }

    private String name;
    private String author;
    private Integer numberOfPages;
    final private Integer id;
    static private int maxId = 1;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString(){
        String nameOfBook = ("Title: " + name + "\n Author: " + author + "\n Number of Pages: " + numberOfPages + "\n Id:" + this.id);
        return nameOfBook;
    }
}
