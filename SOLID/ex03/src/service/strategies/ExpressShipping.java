package service.strategies;

import model.Shipment;
import service.ShippingStrategy;

public class ExpressShipping implements ShippingStrategy {

    public double calculateCost(Shipment shipment) {
        return 80 + 8 * shipment.getWeightKg();
    }
}
