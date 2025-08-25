package service.strategies;

import model.Payment;
import service.PaymentStrategy;

public class UpiPayment implements PaymentStrategy {
    public String pay(Payment payment){
        return "Paid via UPI: " + payment.getAmount();
    }
}
