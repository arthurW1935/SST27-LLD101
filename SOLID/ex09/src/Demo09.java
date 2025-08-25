import factory.AppFactory;

public class Demo09 {
    public static void main(String[] args) {
        AppFactory.getOrderController().create("ORD-1");
    }
}
