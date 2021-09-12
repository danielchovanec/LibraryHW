import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" 0. Exit application \n 1. List all books \n 2. Add new book \n " +
                "3. Show customers \n 4. Add customer \n 5. Change address");
        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        CustomerDatabase customerDatabase = new CustomerDatabase();

        int endOption = 1;

        while (endOption != 0) {

            System.out.println("Welcome, please choose an option: ");
            switch (sc.nextInt()) {

                case 0:
                    endOption = 0;
                    break;

                case 1:
                    System.out.println(library.getBooks().toString());
                    break;

                case 2:
                    library.addBook();
                    break;

                case 3:
                    System.out.println(customerDatabase.getCustomers().toString());
                    break;

                case 4:
                    customerDatabase.addCustomer();
                    break;

                case 5:
                    System.out.println("Please select customer");
                    Scanner chooseCustomer = new Scanner(System.in);
                    int customerNum = chooseCustomer.nextInt() - 1;
                    System.out.println("Enter new street name: ");
                    Scanner newAddressInput = new Scanner(System.in);
                    String newStreetName = newAddressInput.nextLine();
                    System.out.println("Enter new street number: ");
                    Scanner newStreetNumInput = new Scanner(System.in);
                    String newStreetNum = newStreetNumInput.nextLine();
                    customerDatabase.customers.get(customerNum).setStreetName(newStreetName);
                    customerDatabase.customers.get(customerNum).setStreetNumber(newStreetNum);
                    break;

                case 6:
                    System.out.println("Select which book you want to borrow: ");
                    break;

                case 7:
                    System.out.println("Select which customer is borrowing the book: ");
            }
        }
    }
}