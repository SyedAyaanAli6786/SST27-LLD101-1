public class SimpleTaxCalculator implements TaxCalculator {
    private final double taxRate = 0.18;

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
