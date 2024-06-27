package com.buttons.creater;

import com.button.Button;
import com.button.HTMLButton;

public class WebDialog extends Dialog {
  @Override
  public Button createButton() {
    return new HTMLButton();
  }

  @Override
  public void renderWindow() {
    System.out.println("Web Dialog rendered");
  }
}
