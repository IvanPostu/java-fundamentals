package com.utm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Main {

  static Logger logger = LogManager.getLogger(Main.class);

  public static void main(String...args){
    System.out.println("Hello");
    logger.warn("Hello");
  }
}



