package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines;
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final Boolean expedited;
    private final String notes;

    private Order(Builder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        this.lines = new ArrayList<>();
        for (OrderLine line : builder.lines) {
            this.lines.add(new OrderLine(line.getSku(), line.getQuantity(), line.getUnitPriceCents()));
        }
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; } // leaks internal list
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }

    public static class Builder {
        private String id;
        private String customerEmail;
        private List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent;
        private Boolean expedited;
        private String notes;

        public Builder(String id, String customerEmail) {
            this.id(id);
            this.customerEmail(customerEmail);
        }

        private void id(String id) {
            PricingRules.validateId(id);
            this.id = id;
        }

        private void customerEmail(String customerEmail) {
            PricingRules.validateEmail(customerEmail);
            this.customerEmail = customerEmail;
        }

        public Builder addLine(OrderLine line) {
            PricingRules.validateOrderLine(line);
            this.lines.add(line);
            return this;
        }

        public Builder addLines(List<OrderLine> lines) {
            if (lines == null){
                throw new IllegalArgumentException("List of OrderLine cannot be null");
            }
            for (OrderLine l : lines){
                this.addLine(l);
            }
            return this;
        }

        public Builder discountPercent(Integer discountPercent) {
            PricingRules.validateDiscount(discountPercent);
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder expedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
