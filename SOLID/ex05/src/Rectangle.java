public class Rectangle implements Shape{

    protected int w,h;

    public Rectangle(){
        this.w = 0;
        this.h = 0;
    }

    public int area(){
        return w*h;
    }

    public void resize(int... dims) {
        if (dims.length == 2) {
            this.w = dims[0];
            this.h = dims[1];
        } else {
            throw new IllegalArgumentException("Rectangle requires only w and h");
        }
    }
}