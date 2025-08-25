public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator tax = new SimpleTaxCalculator();
        EmailSender email = new EmailClient();
        OrderRepository repo = new FakeOrderRepository();

        OrderService orderService = new OrderService(tax, email, repo);
        orderService.checkout("a@shop.com", 100.0);
    }
}
