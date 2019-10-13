package version2;

public class Customer {
    private String name;
    private BillingPlan plan;
    private PaymentHistory payHistory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillingPlan getPlan() {
        return plan;
    }

    public void setPlan(BillingPlan plan) {
        this.plan = plan;
    }

    public PaymentHistory getPayHistory() {
        return payHistory;
    }

    public void setPayHistory(PaymentHistory payHistory) {
        this.payHistory = payHistory;
    }

    // factory method

    static Customer newNull(){
        return new NullCustomer();
    }
    protected Customer(){}
}
