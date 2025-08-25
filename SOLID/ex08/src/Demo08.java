public class Demo08 {
    public static void main(String[] args) {
        PedalPowered b = new Bicycle();
        b.pedal(10);

        // compile-time error
        // v.startEngine();
    }
}
