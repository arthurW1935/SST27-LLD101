package service;

import model.Shipment;

public interface ShippingStrategy {
    double calculateCost(Shipment shipment);
}

