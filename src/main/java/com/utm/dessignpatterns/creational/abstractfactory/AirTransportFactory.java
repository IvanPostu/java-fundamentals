package com.utm.dessignpatterns.creational.abstractfactory;

public class AirTransportFactory implements TransportFactory {
  /**
   * Variable from properties file or env.
   */
  public static boolean needToTransportALotOfCargo = true;

  @Override
  public Transport createTransport() {
    if(needToTransportALotOfCargo){
      return new Boeing();
    }

    return new Helicopter();
  }
  
}