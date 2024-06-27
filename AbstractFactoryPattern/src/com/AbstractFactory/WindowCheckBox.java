package com.AbstractFactory;


public class WindowCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("You have created Windows CheckBox.");
    }
}
