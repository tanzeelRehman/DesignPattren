package com.command;

public class Remote {
    private Command lastCommand;
    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    void pressOnButton() {
        lastCommand = new TurnOnCommand(device);
        lastCommand.execute();

    }

    void pressOffButton() {
        lastCommand = new TurnOffCommand(device);
        lastCommand.execute();
    }

    void pressUndoButton() {
        lastCommand.undo();
    }
}
