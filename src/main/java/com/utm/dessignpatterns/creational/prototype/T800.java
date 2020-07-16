package com.utm.dessignpatterns.creational.prototype;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class T800 extends Terminator {

  public static final List<String> weapons = Arrays.asList("Minigun", "Shotgun");

  @Override
  public String getWeapon() {
    Random r = new Random();
    int index = r.nextInt(weapons.size());
    return weapons.get(index);
  }

  @Override
  public void doAction() {
    System.out.println("I'll be back");
  }
  
}