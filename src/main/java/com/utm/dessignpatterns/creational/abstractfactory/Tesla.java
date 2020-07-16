package com.utm.dessignpatterns.creational.abstractfactory;

public class Tesla extends GroundTransport {

  @Override
  public void move() {
    System.out.println("Tesla drives.");
  }
  
}