import java.util.ArrayList;

public class CustomerDatabase {

    public ArrayList<Customer> customers;

    public CustomerDatabase(){this.customers = new ArrayList<>();}

    public void addCustomer(){
        Customer customer = new Customer();
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
