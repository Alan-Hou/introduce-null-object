package version2;

public class PaymentHistory {
    private Site site;
    public void getWeeksDelinquentInLastYear(){
        Customer customer = site.getCustomer();

        String name = customer.getName();
//        if(customer == null) name = "occupant";
//        else name = customer.getName();
        //......
    }
}
