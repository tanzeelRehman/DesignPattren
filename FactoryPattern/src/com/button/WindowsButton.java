package com.button;

public class WindowsButton implements Button {
  @Override
  public void render() {
    System.out.println("Windows Button Rendered");
  }

  @Override
  public void onClick() {
    System.out.println("Windows Button clicked");
  }
}
