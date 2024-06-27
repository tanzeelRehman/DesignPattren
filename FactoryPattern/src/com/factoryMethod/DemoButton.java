package com.factoryMethod;

import com.button.Button;
import com.buttons.creater.Dialog;
import com.buttons.creater.WebDialog;
import com.buttons.creater.WindowsDialog;

import java.util.ArrayList;
import java.util.List;

public class DemoButton {
  public static void main(String[] args) {
    List<Button> buttons = new ArrayList<Button>();
    Dialog webButton = new WebDialog();
    Dialog windowButton = new WindowsDialog();

    // create and add two Button
    buttons.add(webButton.createButton());
    buttons.add(windowButton.createButton());

    for (Button button : buttons) {
      button.render();
      button.onClick();
    }
  }
}
