package com.buttons.creater;

import com.button.Button;
import com.button.WindowsButton;

public class WindowsDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public void renderWindow() {
    System.out.println("Windows Dialog rendered");
  }
}
