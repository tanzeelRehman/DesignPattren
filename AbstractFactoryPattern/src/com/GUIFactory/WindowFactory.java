package com.GUIFactory;

import com.AbstractFactory.Button;
import com.AbstractFactory.CheckBox;
import com.AbstractFactory.WindowButtton;
import com.AbstractFactory.WindowCheckBox;

public class WindowFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButtton();

    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();

    }
}
