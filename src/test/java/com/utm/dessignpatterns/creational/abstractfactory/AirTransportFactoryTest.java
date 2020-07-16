package com.utm.dessignpatterns.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

public class AirTransportFactoryTest {
  
  @Test
  public void boeingCreateTest(){

    TransportFactory factory = new AirTransportFactory();
    AirTransportFactory.needToTransportALotOfCargo = true;

    Transport boeing = factory.createTransport();

    Assert.assertNotNull(boeing);
    Assert.assertTrue(boeing instanceof Boeing);

  }

  @Test
  public void helicopterCreateTest(){
    TransportFactory factory = new AirTransportFactory();
    AirTransportFactory.needToTransportALotOfCargo = false;

    Transport helicopter = factory.createTransport();

    Assert.assertNotNull(helicopter);
    Assert.assertTrue(helicopter instanceof Helicopter);

  }

}