package com.command;

public class Light implements Device {
    @Override
    public void start() {
        System.out.println("Light is Turned On");

    }

    @Override
    public void stop() {
        System.out.println("Light is Turned Off");
    }
}
