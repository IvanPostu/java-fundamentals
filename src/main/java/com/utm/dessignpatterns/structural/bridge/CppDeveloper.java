package com.utm.dessignpatterns.structural.bridge;

public class CppDeveloper implements Developer {

  @Override
  public void writeCode() {
    System.out.println("Cpp developer writes cpp code ....");
  }
  
}