package service;

import model.Order;
import notification.NotificationService;
import repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

    private final double taxRate = 0.18;
    private final OrderRepository repository;
    private final NotificationService notificationService;

    public OrderServiceImpl(OrderRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    private double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = totalWithTax(subtotal);
        Order order = new Order(customerEmail, subtotal, total);

        repository.save(order);
        notificationService.notifyCustomer(customerEmail, "Thanks! Your total is " + total);
    }
}
