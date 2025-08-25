public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public String pay(Payment payment) {
        return "Paid via UPI: " + payment.getAmount();
    }
}
