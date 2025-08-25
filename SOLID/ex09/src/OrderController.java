public class OrderController {
    private final OrderRepository repository;

    // Dependency Injection via constructor
    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    public void create(String id) {
        repository.save(id);
        System.out.println("Created order: " + id);
    }
}
