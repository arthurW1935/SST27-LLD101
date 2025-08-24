package player;

import cache.Cache;
import decoder.Decoder;
import model.Frame;
import ui.UI;

public class Player implements Playable{
    private Decoder decoder;
    private UI ui;
    private Cache cache;

    public Player(Decoder decoder, UI ui, Cache cache) {
        this.decoder = decoder;
        this.ui = ui;
        this.cache = cache;
    }

    public void play(byte[] fileBytes) {
        Frame f = decoder.decode(fileBytes);
        ui.display(f);
        cache.store(f);
    }
}

