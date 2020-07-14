package com.utm.dessignpatterns.creational.factorymethod;


public class WindowsButton implements Button {
  public void render() {
    System.out.println("<button>Windows button</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! Button says - 'Hello World!'");
  }
}