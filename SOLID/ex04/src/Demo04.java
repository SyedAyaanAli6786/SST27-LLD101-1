public class Demo04 {
    public static void main(String[] args) {
        Payment payment = new Payment(499);

        // Choose processor dynamically
        PaymentProcessor processor = new UpiPaymentProcessor();

        PaymentService service = new PaymentService(processor);
        System.out.println(service.processPayment(payment));
    }
}
