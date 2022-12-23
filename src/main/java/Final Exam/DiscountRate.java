public class DiscountRate {

    public static double getServiceDiscountRate(String type) {
        double serviceDiscountPremium = 0.2;
        double serviceDiscountGold = 0.15;
        double serviceDiscountSilver = 0.1;
        switch (type) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

    public static double getProductDiscountRate(String type) {
        double productDiscountPremium = 0.1;
        double productDiscountGold = 0.1;
        double productDiscountSilver = 0.1;
        switch (type) {
            case "Premium":
                return productDiscountPremium;
            case "Gold":
                return productDiscountGold;
            case "Silver":
                return productDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

}