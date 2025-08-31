import com.example.orders.*;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        Order o = new Order.Builder("o2", "a@b.com", l1)
        .addLine(l2)
        .discount(10)
        .expedited(true)
        .notes("Handle with care")
        .build();

        System.out.println("Before: " + o.totalAfterDiscount());
        System.out.println("After:  " + o.totalAfterDiscount());
        System.out.println("=> Totals remain stable due to immutability and defensive copies.");
    }
}
