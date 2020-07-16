package com.utm.dessignpatterns.creational.abstractfactory;

public class Helicopter extends AirTransport {

  @Override
  public void move() {
    System.out.println("The helicopter is flying.");
  }
  
}