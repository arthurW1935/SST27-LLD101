package service;

import model.Payment;
import model.PaymentMethod;

import java.util.Map;

public class PaymentServiceImpl implements PaymentService {

    Map<PaymentMethod, PaymentStrategy> paymentStrategyMap;

    public PaymentServiceImpl(Map<PaymentMethod, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    public String pay(Payment payment){
        return this.paymentStrategyMap.get(payment.getPaymentMethod()).pay(payment);
    }
}
