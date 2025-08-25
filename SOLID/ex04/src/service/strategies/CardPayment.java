package service.strategies;

import model.Payment;
import service.PaymentStrategy;

public class CardPayment implements PaymentStrategy {
    public String pay(Payment payment){
        return "Charged card: " + payment.getAmount();
    }
}
