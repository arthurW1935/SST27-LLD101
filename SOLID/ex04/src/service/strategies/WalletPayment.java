package service.strategies;

import model.Payment;
import service.PaymentStrategy;

public class WalletPayment implements PaymentStrategy {
    public String pay(Payment payment){
        return "Wallet debit: " + payment.getAmount();
    }
}
