package com.command;

public class TurnOnCommand implements Command{
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.start();
    }

    @Override
    public void undo() {
        device.stop();
    }
}
