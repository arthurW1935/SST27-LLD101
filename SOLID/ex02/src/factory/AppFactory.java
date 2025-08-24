package factory;

import cache.Cache;
import cache.FrameCache;
import decoder.Decoder;
import decoder.BasicDecoder;
import player.Player;
import player.Playable;
import ui.ConsoleUI;
import ui.UI;

public class AppFactory {

    private static Decoder decoder;
    private static UI ui;
    private static Cache cache;
    private static Playable player;

    public static Decoder getDecoder() {
        if (decoder == null) {
            decoder = new BasicDecoder();
        }
        return decoder;
    }

    public static UI getUI() {
        if (ui == null) {
            ui = new ConsoleUI();
        }
        return ui;
    }

    public static Cache getCache() {
        if (cache == null) {
            cache = new FrameCache();
        }
        return cache;
    }

    public static Playable getPlayer() {
        if (player == null) {
            player = new Player(getDecoder(), getUI(), getCache());
        }
        return player;
    }
}
