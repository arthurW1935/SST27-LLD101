package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, Boolean expedited, String notes) {
        Order.Builder builder = new Order.Builder(id, email);

        if (lines != null) {
            builder.addLines(lines);
        }

        if (discount != null) {
            builder.discountPercent(discount);
        }
        if (expedited != null) {
            builder.expedited(expedited);
        }
        if (notes != null && !notes.isBlank()) {
            builder.notes(notes);
        }

        return builder.build();
    }
}
