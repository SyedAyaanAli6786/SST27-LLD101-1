public class WalletPaymentProcessor implements PaymentProcessor {
    @Override
    public String pay(Payment payment) {
        return "Wallet debit: " + payment.getAmount();
    }
}
