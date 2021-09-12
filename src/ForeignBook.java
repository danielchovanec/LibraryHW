import java.util.Scanner;

public class ForeignBook extends Book {
    public ForeignBook(){
        System.out.println("Enter language: ");
        Scanner sc = new Scanner(System.in);
        this.language = sc.nextLine();
    }

    private String language;

    @Override
    public String toString(){
        String nameOfScientificBook = ("Name: " + this.getName() + "\n Author: " + this.getAuthor() + "\n Number of pages: " +
                this.getNumberOfPages() + "\n Language: " + this.language + "\n Id:" + this.getId());
        return nameOfScientificBook;
    }
}
