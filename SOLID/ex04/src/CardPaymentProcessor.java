public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public String pay(Payment payment) {
        return "Charged card: " + payment.getAmount();
    }
}
