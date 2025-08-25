package factory;

import model.PaymentMethod;
import service.PaymentService;
import service.PaymentServiceImpl;
import service.PaymentStrategy;
import service.strategies.CardPayment;
import service.strategies.UpiPayment;
import service.strategies.WalletPayment;

import java.util.HashMap;
import java.util.Map;

public class AppFactory {
    private static PaymentService paymentService;

    public static PaymentService getPaymentService() {
        if (paymentService == null) {
            paymentService = buildPaymentService();
        }
        return paymentService;
    }

    private static PaymentService buildPaymentService() {
        Map<PaymentMethod, PaymentStrategy> strategies = new HashMap<>();
        strategies.put(PaymentMethod.CARD, new CardPayment());
        strategies.put(PaymentMethod.UPI, new UpiPayment());
        strategies.put(PaymentMethod.WALLET, new WalletPayment());

        return new PaymentServiceImpl(strategies);
    }
}
