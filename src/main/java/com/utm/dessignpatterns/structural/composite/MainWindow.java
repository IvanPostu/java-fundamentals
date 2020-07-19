package com.utm.dessignpatterns.structural.composite;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

  private static final long serialVersionUID = 1L;

  public static final int WIDTH = 640;
  public static final int HEIGHT = 480;

  public MainWindow(){
    super();

    add(new Panel());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Composite design pattern");
    setSize(new Dimension(WIDTH, HEIGHT));
    setResizable(false);
    setLocationRelativeTo(null);
    setLayout(null);

    setVisible(true);
  }
  
  public static void main(String[] args) {
    new MainWindow();
  }
}
