package model;

public class Payment {

    private final PaymentMethod paymentMethod;
    private final double amount;

    public Payment(String p, double a) {
        this.paymentMethod = PaymentMethod.fromString(p);
        this.amount = a;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }
}