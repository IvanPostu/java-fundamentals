package com.utm.dessignpatterns.creational.prototype;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class T1000 extends Terminator {
  public static final List<String> weapons = Arrays.asList("Sword", "Plasma weapon");

  @Override
  public String getWeapon() {
    Random r = new Random();
    int index = r.nextInt(weapons.size());
    return weapons.get(index);
  }

  @Override
  public void doAction() {
    System.out.println("***********");
  }
  
}