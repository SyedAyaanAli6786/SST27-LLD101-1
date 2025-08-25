public class PaymentService {
    private final PaymentProcessor processor;

    public PaymentService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public String processPayment(Payment payment) {
        return processor.pay(payment);
    }
}
