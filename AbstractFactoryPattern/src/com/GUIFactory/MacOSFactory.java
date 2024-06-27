package com.GUIFactory;

import com.AbstractFactory.Button;
import com.AbstractFactory.CheckBox;
import com.AbstractFactory.MacOSButton;
import com.AbstractFactory.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();

    }
}
