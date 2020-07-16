package com.utm.dessignpatterns.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class GroundTransportFactoryTest {
  
  @Test
  public void createTeslaUsingFactoryTest(){
    TransportFactory factory = new GroundTransportFactory();
    GroundTransportFactory.needMoreSpeed = true;

    Transport tesla = factory.createTransport();

    Assert.assertNotNull(tesla);
    Assert.assertTrue(tesla instanceof Tesla);

  }

  @Test
  public void createAudiUsingFactoryTest(){
    TransportFactory factory = new GroundTransportFactory();
    GroundTransportFactory.needMoreSpeed = false;

    Transport audi = factory.createTransport();

    Assert.assertNotNull(audi);
    Assert.assertTrue(audi instanceof Audi);

  }

}