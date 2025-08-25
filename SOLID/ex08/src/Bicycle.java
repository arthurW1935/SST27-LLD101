public class Bicycle implements Vehicle, PedalPowered {

    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}