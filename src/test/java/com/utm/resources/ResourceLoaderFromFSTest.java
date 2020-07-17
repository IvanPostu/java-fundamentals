package com.utm.resources;

import org.junit.Assert;
import org.junit.Test;

public class ResourceLoaderFromFSTest {

  @Test
  public void loadAsStringTest(){

    ResourcesLoader loader = new ResourceLoaderFromFS();
    String strFromFile = loader.loadAsString("/forTest/test.txt");

    Assert.assertEquals(strFromFile, "HelloWorld2");
  }

}