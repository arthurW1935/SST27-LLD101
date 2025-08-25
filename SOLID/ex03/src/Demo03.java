import factory.AppFactory;
import model.Shipment;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(AppFactory.getShippingService().cost(new Shipment("EXPRESS", 2.0)));
    }
}
