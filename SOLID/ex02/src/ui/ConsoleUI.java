package ui;

import model.Frame;

public class ConsoleUI implements UI{

    public void display(Frame frame) {
        System.out.println("\u25B6 Playing " + frame.getData().length + " bytes");
    }
}
