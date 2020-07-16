package com.utm.dessignpatterns.creational.prototype;

public abstract class Terminator implements Cloneable {
  
  /**
   * Very difficult and slow to design 
   * and create Terminator.
   * 
   * And very difficult to configure it.
   */
  public Terminator() {
  }

  public abstract String getWeapon();

  public abstract void doAction();

  @Override
  protected Terminator clone() throws CloneNotSupportedException {
    return (Terminator)super.clone();
  }

}