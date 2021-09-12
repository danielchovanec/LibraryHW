import java.util.Scanner;

public class Customer {

    CustomerDatabase customerDatabase = new CustomerDatabase();

    public Customer() {
        System.out.print("Enter first name: ");
        Scanner sc = new Scanner(System.in);
        this.firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Enter street name:");
        this.streetName = sc.nextLine();
        System.out.println("Enter street number: ");
        this.streetNumber = sc.nextLine();
        Integer.parseInt(streetNumber);
        System.out.println("Enter city: ");
        this.city = sc.nextLine();
        System.out.println("Enter country: ");
        this.country = sc.nextLine();
        this.id = maxId;
        maxId++;
    }

    private String firstName;
    private String lastName;
    private String streetName;
    private String streetNumber;
    private String city;
    private String country;
    final private Integer id;
    static private int maxId = 1;

        @Override
        public String toString(){
            String addressOfCustomer = ("First name: " + firstName + "\nLast name: " + lastName +
                    "\n Street name: " + streetName + "\n Street number: "
                    + streetNumber + "\n City: " + city + "\n Country: " + country);
            return addressOfCustomer;
        }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public static int getMaxId() {
        return maxId;
    }

}
