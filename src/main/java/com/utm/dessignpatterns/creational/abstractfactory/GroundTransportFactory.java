package com.utm.dessignpatterns.creational.abstractfactory;

public class GroundTransportFactory implements TransportFactory {

  /**
   * Variable from properties file or env.
   */
  public static boolean needMoreSpeed = true;

  @Override
  public Transport createTransport() {
    if(needMoreSpeed){
      return new Tesla();
    }
    
    return new Audi();
  }
  
}