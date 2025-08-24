package decoder;

import model.Frame;

public interface Decoder {

    public Frame decode(byte[] bytes);
}
