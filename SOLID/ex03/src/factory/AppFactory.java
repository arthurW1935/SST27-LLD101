package factory;

import model.ShipmentType;
import service.ShippingService;
import service.ShippingServiceImpl;
import service.ShippingStrategy;
import service.strategies.ExpressShipping;
import service.strategies.OvernightShipping;
import service.strategies.StandardShipping;

import java.util.HashMap;
import java.util.Map;

public class AppFactory {

    private static ShippingService shippingService;

    public static ShippingService getShippingService() {
        if (shippingService == null) {
            shippingService = buildShippingService();
        }
        return shippingService;
    }

    private static ShippingService buildShippingService() {
        Map<ShipmentType, ShippingStrategy> strategies = new HashMap<>();
        strategies.put(model.ShipmentType.STANDARD, new StandardShipping());
        strategies.put(model.ShipmentType.EXPRESS, new ExpressShipping());
        strategies.put(model.ShipmentType.OVERNIGHT, new OvernightShipping());

        return new ShippingServiceImpl(strategies);
    }
}