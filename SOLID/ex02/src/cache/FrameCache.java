package cache;

import model.Frame;

public class FrameCache implements Cache{

    private Frame last;

    public void store(Frame frame) {
        last = frame;
    }

    public Frame getLast() {
        return last;
    }
}
