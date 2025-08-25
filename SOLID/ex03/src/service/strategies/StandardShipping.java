package service.strategies;

import model.Shipment;
import service.ShippingStrategy;

public class StandardShipping implements ShippingStrategy {

    public double calculateCost(Shipment shipment) {
        return 50 + 5 * shipment.getWeightKg();
    }
}
