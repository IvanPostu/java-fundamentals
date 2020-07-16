package com.utm.dessignpatterns.creational.builder;

public class Car {

  public static class CarBuilder {

    private Car car = new Car();

    public CarBuilder setModel(String model){
      this.car.model = model;
      return this;
    }

    public CarBuilder setColour(String colour){
      this.car.colour = colour;
      return this;
    }

    public CarBuilder setMaxSpeed(int maxSpeed){
      this.car.maxSpeed = maxSpeed;
      return this;
    }

    public Car build(){
      return car;
    }

  }

  private String model;
  private String colour;
  private int maxSpeed;

  private Car() {
  }

  public static CarBuilder builder(){
    return new CarBuilder();
  }

  public String getModel() {
    return model;
  }

  public String getColour() {
    return colour;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

}