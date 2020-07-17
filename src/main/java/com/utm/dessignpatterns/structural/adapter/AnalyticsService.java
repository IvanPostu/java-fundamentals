package com.utm.dessignpatterns.structural.adapter;

import java.util.List;

public class AnalyticsService {
  
  /**
   * Return "...need more products" if less than 100 products in storage.
   * 
   * Or else return "It's ok"
   * 
   */
  public String analyze(AnalyticsServiceDTO dto){

    int productCount = 0;
    List<Product> products = dto.getProducts();

    for(Product product : products){
      productCount += product.getTotalCountInStorage();
    }

    if(productCount<100){
      return "...need more products";
    }

    return "It's ok";

  }

}