package model;

public class Shipment {

    ShipmentType type;
    double weightKg;

    public Shipment(String type, double w) {
        this.type = ShipmentType.fromString(type);
        this.weightKg = w;
    }

    public ShipmentType getType() {
        return type;
    }

    public double getWeightKg() {
        return weightKg;
    }
}