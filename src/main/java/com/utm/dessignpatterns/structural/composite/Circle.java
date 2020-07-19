package com.utm.dessignpatterns.structural.composite;

import java.awt.*;
import java.util.Random;

public class Circle implements Graphic {

  public static final int WIDTH = MainWindow.WIDTH;
  public static final int HEIGHT = MainWindow.HEIGHT;

  private int x;
  private int y;
  private int r;
  private Color color;

  public Circle(Color color) {
    Random random = new Random();
    this.r = random.nextInt(25) + 15;
    this.x = random.nextInt(WIDTH);
    this.y = random.nextInt(HEIGHT);
    this.color = color;
  }

  @Override
  public void draw(Graphics g) {
    g.setColor(color);
    g.drawOval(x, y, r, r);
  }
  
  
  
}