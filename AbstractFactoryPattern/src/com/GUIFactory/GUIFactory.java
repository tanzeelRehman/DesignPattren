package com.GUIFactory;

import com.AbstractFactory.Button;
import com.AbstractFactory.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();


}
