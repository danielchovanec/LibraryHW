import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;

    public Library(){this.books = new ArrayList<Book>();}

    public void addBook(){

        System.out.println(" 1. Standard book \n 2. Scientific Book \n 3. Foreign Book");

        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){

            case 1:
                Book book = new Book();
                books.add(book);
                break;

            case 2:
                Book book1 = new ScientificBook();
                books.add(book1);
                break;

            case 3:
                Book book2 = new ForeignBook();
                books.add(book2);
                break;
        }

    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}