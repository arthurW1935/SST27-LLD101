package model;

public enum PaymentMethod {
    CARD,
    UPI,
    WALLET;

    public static PaymentMethod fromString(String paymentMethod) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("PaymentMethod string cannot be null");
        }

        return switch (paymentMethod.trim().toLowerCase()) {
            case "card" -> CARD;
            case "upi" -> UPI;
            case "wallet" -> WALLET;
            default -> throw new IllegalArgumentException("Unknown PaymentMethod: " + paymentMethod);
        };
    }
}
