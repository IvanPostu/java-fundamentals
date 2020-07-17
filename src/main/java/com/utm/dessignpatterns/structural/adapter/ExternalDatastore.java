package com.utm.dessignpatterns.structural.adapter;

import com.utm.resources.ResourceLoaderFromFS;
import com.utm.resources.ResourcesLoader;

public class ExternalDatastore {

  private ResourcesLoader loader = new ResourceLoaderFromFS();


  public String loadProductsListInJSONFormat(){

    String jsonData = loader.loadAsString("/adapter/products.json");
    
    return jsonData;
  }

}