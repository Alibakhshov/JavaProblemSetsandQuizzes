package Final.Question3;


public class Visit {
    private final Customer customer;
    private final double serviceExpense;
    private final double productExpense;

    public Visit(String name, double serviceExpense, double productExpense) {
        this.customer = new Customer(name);
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit(" +
                "name=" + getName() +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                ')';
    }
}



























//import java.util.Date;
//
//public class Visit {
//
//    private final Customer name;
//    private final Date date;
//    private double serviceExpense;
//    private double productExpense;
//
//    public Visit(Customer name, Date date) {
//        this.name = name;
//        this.date = date;
//    }
//
//    public String getName() {
//        return name.getName();
//    }
//
//    public double getServiceExpense() {
//        return serviceExpense;
//    }
//
//    public void setServiceExpense(double serviceExpense) {
//        this.serviceExpense += serviceExpense;
//    }
//
//    public double getProductExpense() {
//        return productExpense;
//    }
//
//    public void setProductExpense(double productExpense) {
//        this.productExpense += productExpense;
//    }
//
//    public double getTotalExpense() {
//        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType()))) +
//                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));
//
//    }
//
//    @Override
//    public String toString() {
//        return "Visit{" +
//                "customer=" + name.toString() +
//                ", date=" + date +
//                ", serviceExpense=" + serviceExpense +
//                ", productExpense=" + productExpense +
//                '}';
//    }
//}



