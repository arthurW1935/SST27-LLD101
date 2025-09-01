package com.example.orders;

public final class PricingRules {
    private PricingRules() {}

    public static void validateId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
    }

    public static void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
    }

    public static void validateDiscount(Integer d) {
        if (d != null && (d < 0 || d > 100)) {
            throw new IllegalArgumentException("Discount must be between 0 and 100, got: " + d);
        }
    }

    public static void validateOrderLine(OrderLine line) {
        if (line == null) {
            throw new IllegalArgumentException("OrderLine cannot be null");
        }
        if (line.getQuantity() <= 0) {
            throw new IllegalArgumentException("Order line quantity must be positive: " + line.getQuantity());
        }
        if (line.getUnitPriceCents() < 0) {
            throw new IllegalArgumentException("Order line unit price cannot be negative: " + line.getUnitPriceCents());
        }
        if (line.getSku() == null || line.getSku().trim().isEmpty()) {
            throw new IllegalArgumentException("Order line SKU cannot be null or empty");
        }
    }
}
