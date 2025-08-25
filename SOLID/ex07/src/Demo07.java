public class Demo07 {
    public static void main(String[] args) {
        Printer m = new BasicPrinter();
        m.print("Hello");

        // compile-time error
        // m.scan("/tmp/out");
        // m.fax("1234567890");
    }
}
