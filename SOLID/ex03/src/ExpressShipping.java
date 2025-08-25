public class ExpressShipping implements ShippingCostStrategy {
    @Override
    public double calculateCost(Shipment shipment) {
        return 80 + 8 * shipment.getWeightKg();
    }
}
