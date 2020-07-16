package com.utm.dessignpatterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {
  
  @Test
  public void carBuilderTest(){

    Car car = Car.builder()
      .setColour("GREEN")
      .setMaxSpeed(312)
      .setModel("Mercedez")
      .build();

    Assert.assertEquals(car.getModel(), "Mercedez");
    Assert.assertEquals(car.getColour(), "GREEN");
    Assert.assertEquals(car.getMaxSpeed(), 312);

  }

}