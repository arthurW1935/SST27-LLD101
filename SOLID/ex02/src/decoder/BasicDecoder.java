package decoder;

import model.Frame;

public class BasicDecoder implements Decoder {

    public Frame decode(byte[] bytes){
        return new Frame(bytes);
    }
}
