import factory.AppFactory;

public class Demo02 {
    public static void main(String[] args) {

        AppFactory.getPlayer().play(new byte[]{1,2,3,4});
    }
}
