package com.AbstractFactory;

public class MacOSCheckBox  implements CheckBox{

    @Override
    public void paint() {
        System.out.println("You have created MacOS CheckBox.");
    }
}