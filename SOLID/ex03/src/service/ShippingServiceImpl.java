package service;

import model.Shipment;
import model.ShipmentType;

import java.util.Map;

public class ShippingServiceImpl implements ShippingService {

    private final Map<ShipmentType, ShippingStrategy> strategies;

    public ShippingServiceImpl(Map<ShipmentType, ShippingStrategy> strategies) {
        this.strategies = strategies;
    }

    public double cost(Shipment shipment) {
        ShippingStrategy strategy = strategies.get(shipment.getType());
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for type: " + shipment.getType());
        }
        return strategy.calculateCost(shipment);
    }
}
