package model;

public enum ShipmentType {
    STANDARD,
    EXPRESS,
    OVERNIGHT;

    public static ShipmentType fromString(String type) {
        if (type == null) {
            throw new IllegalArgumentException("ShipmentType string cannot be null");
        }

        return switch (type.trim().toLowerCase()) {
            case "standard" -> STANDARD;
            case "express" -> EXPRESS;
            case "overnight" -> OVERNIGHT;
            default -> throw new IllegalArgumentException("Unknown ShipmentType: " + type);
        };
    }

    @Override
    public String toString() {
        return switch (this) {
            case STANDARD -> "STANDARD";
            case EXPRESS -> "EXPRESS";
            case OVERNIGHT -> "OVERNIGHT";
            default -> name();
        };
    }
}
