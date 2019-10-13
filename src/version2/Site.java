package version2;

public class Site {

    Customer customer;

    public Customer getCustomer() {
        return (customer == null) ? Customer.newNull() : customer;
    }
}
