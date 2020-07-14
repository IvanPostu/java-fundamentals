package com.utm.dessignpatterns.creational.factorymethod;

public class HtmlButton implements Button {

  public void render() {
    System.out.println("<button>Html button</button>");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! Button says - 'Hello World!'");
  }
}