package Final.Question3;

public class Visit {
    private Customer customer;
    private String service;
    private double price;

    public Visit(String name, String service) {
        this.customer = new Customer(name);
        this.service = service;
        this.price = 0;
    }

    public String getName() {
        return customer.getName();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getServiceExpense() {
        return price * (1 - DiscountRate.getServiceDiscountRate(service));
    }

    public double getProductExpense() {
        return price * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()));
    }

    public double getTotalExpense() {
        return getServiceExpense() + getProductExpense();
    }
}
