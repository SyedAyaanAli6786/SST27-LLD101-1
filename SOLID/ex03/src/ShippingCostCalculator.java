public class ShippingCostCalculator {
    private final ShippingCostStrategy strategy;

    public ShippingCostCalculator(ShippingCostStrategy strategy) {
        this.strategy = strategy;
    }

    public double cost(Shipment shipment) {
        return strategy.calculateCost(shipment);
    }
}
