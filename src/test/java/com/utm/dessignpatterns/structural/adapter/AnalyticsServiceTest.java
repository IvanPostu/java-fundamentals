package com.utm.dessignpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AnalyticsServiceTest {

  @Test
  public void analyzeIfProductsIsLessThanOneHungredTest(){
    AnalyticsService service = new AnalyticsService();

    List<Product> products = Arrays.asList(new Product("Banana", "Very delicious", 22, 77));

    var dto = new AnalyticsServiceDTO();
    dto.setProducts(products);

    Assert.assertEquals(service.analyze(dto), "...need more products");
  }

  @Test
  public void analyzeIfProductsIsMoreThanOneHungredTest(){
    AnalyticsService service = new AnalyticsService();

    List<Product> products = Arrays.asList(new Product("Banana", "Very delicious", 22, 177));

    var dto = new AnalyticsServiceDTO();
    dto.setProducts(products);

    Assert.assertEquals(service.analyze(dto), "It's ok");
  }
  
}