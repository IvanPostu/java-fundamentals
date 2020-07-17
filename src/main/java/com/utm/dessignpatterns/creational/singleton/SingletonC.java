package com.utm.dessignpatterns.creational.singleton;

public class SingletonC {
  
  private static final SingletonC instance = new SingletonC();

  public static SingletonC getInstance(){
    return instance;
  }

}