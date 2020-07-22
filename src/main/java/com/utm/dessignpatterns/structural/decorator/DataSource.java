package com.utm.dessignpatterns.structural.decorator;

public interface DataSource {
  void writeData(String data);
  String readData();
}
