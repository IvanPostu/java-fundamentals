package com.utm.dessignpatterns.creational.singleton;

public class SingletonB {
  private SingletonB() {
  }

  private static SingletonB instance;

  synchronized public static SingletonB getInstance(){
    if(instance == null){
      instance = new SingletonB();
    }

    return instance;

  }

}