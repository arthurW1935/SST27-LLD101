package service;

import model.Payment;

public interface PaymentStrategy {

    String pay(Payment p);
}
