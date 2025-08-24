import factory.AppFactory;

public class Demo01 {
    public static void main(String[] args) {
        AppFactory.getOrderService().checkout("a@shop.com", 100.0);
    }
}
