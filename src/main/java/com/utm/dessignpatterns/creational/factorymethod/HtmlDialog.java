package com.utm.dessignpatterns.creational.factorymethod;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
      return new HtmlButton();
  }
}