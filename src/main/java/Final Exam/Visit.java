import java.util.Date;

public class Visit {

    private final Customer name;
    private final Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense += serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense += productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));

    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + name.toString() +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}