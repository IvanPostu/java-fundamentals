package com.utm.dessignpatterns.creational.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class WindowsDialogTest {


  @Test
  public void windowCreateButtonTest(){
    Dialog dialog = new WindowsDialog();
    Button button = dialog.createButton();

    Assert.assertNotNull(button);
    Assert.assertTrue(button instanceof WindowsButton);

  }

}