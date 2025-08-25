public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(2.0); // 2 kg

        ShippingCostCalculator calculator = new ShippingCostCalculator(new ExpressShipping());
        System.out.println("Express Cost: " + calculator.cost(shipment));

        calculator = new ShippingCostCalculator(new StandardShipping());
        System.out.println("Standard Cost: " + calculator.cost(shipment));

        calculator = new ShippingCostCalculator(new OvernightShipping());
        System.out.println("Overnight Cost: " + calculator.cost(shipment));
    }
}
