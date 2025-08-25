import factory.AppFactory;
import model.Payment;

public class Demo04 {
    public static void main(String[] args) {
        System.out.println(AppFactory.getPaymentService().pay(new Payment("UPI", 499)));
    }
}
