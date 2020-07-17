package com.utm.dessignpatterns.creational.singleton;

public enum SingletonA {
  INSTANCE;

  private String fieldA;
  private int fieldB;

  private SingletonA(){
    this.fieldA = "adfdgdgdagag";
    this.fieldB = 22;
  }

  public void methodA(){
    System.out.println(this.fieldA);
  }

  public void methodB(){
    System.out.println(this.fieldB);
  }

}