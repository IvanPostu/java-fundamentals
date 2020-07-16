package com.utm.dessignpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings({ "unchecked" })
public class SkyNet {

  private static final Logger logger = LogManager.getLogger(SkyNet.class);

  public <T extends Terminator> List<T> createAnArmy(T terminator, int armySize) {
    List<T> army = new ArrayList<>(armySize);

    for (int i = 0; i < armySize; i++) {
      
      try {
        T clone = (T) terminator.clone();
        army.add(clone);
      } catch (CloneNotSupportedException e) {
        logger.error(e);
      }

    }

    return army;
  }

}