package com.utm.dessignpatterns.creational.prototype;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SkyNetTest {

  @Test
  public void createAnArmyOfT800Test(){
    SkyNet skyNet = new SkyNet();
    T800 arni = new T800();
    List<T800> armyOfArnies = skyNet.createAnArmy(arni, 12);

    Assert.assertEquals(armyOfArnies.size(), 12);
    Assert.assertTrue(T800.weapons.contains(armyOfArnies.get(0).getWeapon()));

  }

  @Test
  public void createAnArmyOfT1000Test(){
    SkyNet skyNet = new SkyNet();
    T1000 arniEnemy = new T1000();
    List<T1000> armyOfArniEnemies = skyNet.createAnArmy(arniEnemy, 7);

    Assert.assertEquals(armyOfArniEnemies.size(), 7);
    Assert.assertTrue(T1000.weapons.contains(armyOfArniEnemies.get(0).getWeapon()));

  }
  
}