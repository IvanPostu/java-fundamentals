package com.utm.dessignpatterns.structural.composite;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

public class CompositeGraphic implements Graphic {

  private List<Graphic> childGraphics = new LinkedList<>();

  @Override
  public void draw(Graphics g) {
    childGraphics.forEach(a -> a.draw(g));
  }

  public void add(Graphic graphic) {
    childGraphics.add(graphic);
  }

  public void remove(Graphic graphic) {
    childGraphics.remove(graphic);
  }

}