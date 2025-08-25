public class Demo06 {
    public static void main(String[] args) {
        new Aviary().release(new Sparrow());

        // compile-time error
        // new Aviary().release(new Penguin());
    }
}
