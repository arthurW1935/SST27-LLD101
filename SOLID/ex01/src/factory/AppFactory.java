package factory;

import notification.EmailClient;
import notification.NotificationService;
import repository.OrderRepository;
import service.OrderService;
import service.OrderServiceImpl;

public class AppFactory {

    private static EmailClient emailClient;
    private static NotificationService notificationService;
    private static OrderRepository orderRepository;
    private static OrderService orderService;

    public static EmailClient getEmailClient() {
        if (emailClient == null) {
            emailClient = new EmailClient();
        }
        return emailClient;
    }

    public static NotificationService getNotificationService() {
        if (notificationService == null) {
            notificationService = new NotificationService(getEmailClient());
        }
        return notificationService;
    }

    public static OrderRepository getOrderRepository(){
        if (orderRepository == null) {
            orderRepository = new OrderRepository();
        }
        return orderRepository;
    }

    public static OrderService getOrderService() {
        if (orderService == null) {
            orderService = new OrderServiceImpl(getOrderRepository(), getNotificationService());
        }
        return orderService;
    }
}
