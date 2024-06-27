package com.AbstractFactory;

public class WindowButtton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
