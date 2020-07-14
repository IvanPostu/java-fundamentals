package com.utm;

import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
  
  @Test
  public void test(){
    Supplier<Boolean> мужикВсегдаПрав = () -> true;
    Assert.assertTrue(мужикВсегдаПрав.get());
  }

}