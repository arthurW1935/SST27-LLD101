package service.strategies;

import model.Shipment;
import service.ShippingStrategy;

public class OvernightShipping implements ShippingStrategy {

    public double calculateCost(Shipment shipment) {
        return 120 + 10 * shipment.getWeightKg();
    }
}
