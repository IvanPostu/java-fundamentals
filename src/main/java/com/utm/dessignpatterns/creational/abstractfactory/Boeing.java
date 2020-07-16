package com.utm.dessignpatterns.creational.abstractfactory;

public class Boeing extends AirTransport{

  @Override
  public void move() {
    System.out.println("The boeing is flying.");
  }
  
}
