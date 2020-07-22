package com.utm.dessignpatterns.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class FileDataSourceTest {
  
  @Test
  public void writeAndReadTest(){

    final String text = "text1112212";
    FileDataSource fileDataSource = new FileDataSource("test.out");

    fileDataSource.writeData(text);

    final String textFromFile = fileDataSource.readData();
    Assert.assertEquals(text, textFromFile);
  }

}
