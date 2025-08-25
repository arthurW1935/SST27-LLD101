package factory;

import controller.OrderController;
import repository.OrderRepository;
import repository.SqlOrderRepository;

public class AppFactory {
    private static OrderRepository orderRepository;
    private static OrderController orderController;

    public static OrderRepository getOrderRepository(){
        if (orderRepository == null){
            orderRepository = new SqlOrderRepository();
        }
        return orderRepository;
    }

    public static OrderController getOrderController(){
        if (orderController == null){
            orderController = new OrderController(getOrderRepository());
        }

        return orderController;
    }


}
