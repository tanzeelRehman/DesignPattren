package com.button;

public class HTMLButton implements Button {
  @Override
  public void render() {
    System.out.println("HTMl Button Rendered");
  }

  @Override
  public void onClick() {
    System.out.println("HTMl button clicked");
  }
}
