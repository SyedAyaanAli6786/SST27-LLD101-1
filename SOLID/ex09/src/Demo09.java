public class Demo09 {
    public static void main(String[] args) {
        // Inject dependency (SqlOrderRepository) into controller
        OrderRepository repo = new SqlOrderRepository();
        OrderController controller = new OrderController(repo);

        controller.create("ORD-1");
    }
}
