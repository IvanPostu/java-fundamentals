package com.utm.dessignpatterns.structural.bridge;

public class Main {

  public static void main(String[] args) {
    Program[] programs = {
      new BankSystem(new JavaDeveloper()),
      new StockExchange(new CppDeveloper())
    };

    for (int i = 0; i < programs.length; i++) {
      programs[i].developProgram();
    }

  }
  
}