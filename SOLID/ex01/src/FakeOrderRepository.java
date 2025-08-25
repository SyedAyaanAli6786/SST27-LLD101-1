public class FakeOrderRepository implements OrderRepository {
    @Override
    public void save(String orderDetails) {
        System.out.println("Order stored (pretend DB): " + orderDetails);
    }
}
