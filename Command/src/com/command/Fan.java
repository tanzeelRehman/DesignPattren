package com.command;

public class Fan implements Device{
    @Override
    public void start() {
        System.out.println("Fan Started");
    }

    @Override
    public void stop() {
        System.out.println("Fan Stopped");
    }
}
