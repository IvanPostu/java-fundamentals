package com.utm.dessignpatterns.structural.composite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel implements  ActionListener {

  private static final long serialVersionUID = 6479743521537342864L;
  
  public static final int WIDTH = MainWindow.WIDTH;
  public static final int HEIGHT = MainWindow.HEIGHT;

  private Timer timer;
  private CompositeGraphic rootGraphic = new CompositeGraphic();

  public Panel() {
    super();
    setBackground(Color.DARK_GRAY);
    setBounds(0, 0, WIDTH, HEIGHT);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setFocusable(true);
    requestFocus();

    CompositeGraphic branchA = new CompositeGraphic();
    CompositeGraphic branchB = new CompositeGraphic();
    
    for (int i = 0; i < 4; i++) {
      branchA.add(new Circle(Color.GREEN));
    }

    for (int i = 0; i < 5; i++) {
      branchB.add(new Circle(Color.ORANGE));
    }

    rootGraphic.add(branchA);
    rootGraphic.add(branchB);
    rootGraphic.add(new Circle(Color.RED));
  }

  @Override
  public void addNotify(){
    super.addNotify();
    this.timer = new Timer(1000/60, this);
    this.timer.start();
  }

  @Override
  public void removeNotify(){
    super.removeNotify();
    this.timer.stop();
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    rootGraphic.draw(g);

  }

	@Override
	public void actionPerformed(ActionEvent arg0) {
    repaint();
	}
  
}
