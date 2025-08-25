
public class Square implements Shape {

    protected int side;

    public Square() {
        this.side = 0;
    }

    public int area() {
        return this.side * this.side;
    }

    public void resize(int... dims) {
        if (dims.length == 1) {
            this.side = dims[0];
        } else {
            throw new IllegalArgumentException("Square requires one dimension");
        }
    }

}