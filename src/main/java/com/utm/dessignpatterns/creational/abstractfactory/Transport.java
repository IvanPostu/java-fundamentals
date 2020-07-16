package com.utm.dessignpatterns.creational.abstractfactory;

public abstract class Transport {
  
  protected Driver driver;

  public abstract void move();

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Driver getDriver() {
    return driver;
  }

}