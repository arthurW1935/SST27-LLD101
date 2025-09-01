import com.example.orders.*;

import java.util.ArrayList;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        List<OrderLine>  orderLines = new ArrayList<>();
        orderLines.add(new OrderLine("A", 1, 200));
        orderLines.add(new OrderLine("B", 3, 100));
        Order o = orderService.createOrder("o2", "a@b.com", orderLines, 10, null, null);

        System.out.println("Before Discount: " + o.totalBeforeDiscount());
        System.out.println("After Discount: " + o.totalAfterDiscount());
    }
}
