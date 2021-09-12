import java.util.Scanner;

public class ScientificBook extends Book {
    public ScientificBook(){
        System.out.println("Enter scientific field: ");
        Scanner sc = new Scanner(System.in);
        this.scientificField = sc.nextLine();
    }

    private String scientificField;

    @Override
    public String toString(){
        String nameOfScientificBook = ("Name: " + this.getName() + "\n Author: " + this.getAuthor() + "\n Number of pages: " +
                this.getNumberOfPages() + "\n Scientific field: " + this.scientificField + "\n Id:" + this.getId());
        return nameOfScientificBook;
    }
}
