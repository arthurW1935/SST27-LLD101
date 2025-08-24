package cache;

import model.Frame;

public interface Cache {

    void store(Frame frame);

    Frame getLast();
}

