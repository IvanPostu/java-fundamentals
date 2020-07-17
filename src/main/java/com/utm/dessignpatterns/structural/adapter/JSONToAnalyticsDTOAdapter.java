package com.utm.dessignpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.utm.json.Json;

public class JSONToAnalyticsDTOAdapter {
  public AnalyticsServiceDTO fromJSONToAnalyticsDTOAdapt(String json){

    List<Product> products = new ArrayList<>();

    JsonNode node = Json.parse(json);
    node.forEach(p -> {
      Product product = new Product(p.get("title").asText(), p.get("description").asText(), 
        p.get("price").asInt(), p.get("totalCountInStorage").asInt());

      products.add(product);
    });

    return new AnalyticsServiceDTO(products);
  }
}