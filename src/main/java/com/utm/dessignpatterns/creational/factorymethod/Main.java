package com.utm.dessignpatterns.creational.factorymethod;

public class Main {
  private static final String OS_NAME = "Win10";
  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  static void configure() {
    if (OS_NAME.equals("Linux")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  static void runBusinessLogic() {
    dialog.renderWindow();
  }

}