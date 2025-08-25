public class OrderService {
    private final TaxCalculator taxCalculator;
    private final EmailSender emailSender;
    private final OrderRepository orderRepository;

    public OrderService(TaxCalculator taxCalculator, EmailSender emailSender, OrderRepository orderRepository) {
        this.taxCalculator = taxCalculator;
        this.emailSender = emailSender;
        this.orderRepository = orderRepository;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotal(subtotal);
        emailSender.send(customerEmail, "Thanks! Your total is " + total);
        orderRepository.save("Customer: " + customerEmail + ", Total: " + total);
    }
}
