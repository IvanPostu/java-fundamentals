package com.utm.dessignpatterns.creational.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class HtmlDialogTest {
  
  @Test
  public void hemlCreateButtonTest(){
    Dialog dialog = new HtmlDialog();
    Button button = dialog.createButton();

    Assert.assertNotNull(button);
    Assert.assertTrue(button instanceof HtmlButton);

  }

}