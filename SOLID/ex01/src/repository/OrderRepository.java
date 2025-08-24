package repository;

import model.Order;

public class OrderRepository {
    public void save(Order order) {

        // pretending to store the order in a DB
        System.out.println("Order stored: " + order);
    }
}