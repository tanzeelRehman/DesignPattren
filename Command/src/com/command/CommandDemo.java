package com.command;

public class CommandDemo {
    public static void main(String[] args) {
        Device device = new Fan();
        Remote remote  = new Remote(device);
       remote.pressOnButton();
       remote.pressUndoButton();

       remote.setDevice(new Light());
       remote.pressOffButton();
       remote.pressUndoButton();

    }
}
