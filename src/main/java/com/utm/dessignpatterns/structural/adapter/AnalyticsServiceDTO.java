package com.utm.dessignpatterns.structural.adapter;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class AnalyticsServiceDTO {
  
  @Getter
  @Setter
  private List<Product> products;


}