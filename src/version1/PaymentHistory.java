package version1;

public class PaymentHistory {
    private Site site;
    public void getWeeksDelinquentInLastYear(){
        Customer customer = site.getCustomer();
        BillingPlan plan;
        String name;
        if(customer == null) name = "occupant";
        else name = customer.getName();
        //......
    }
}
