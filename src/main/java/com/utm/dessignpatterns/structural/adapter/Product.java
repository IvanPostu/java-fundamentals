package com.utm.dessignpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  private String title;
  private String description;
  private int price;
  private int totalCountInStorage;
}