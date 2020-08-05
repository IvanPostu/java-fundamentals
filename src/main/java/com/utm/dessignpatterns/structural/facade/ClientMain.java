package com.utm.dessignpatterns.structural.facade;

import java.io.File;

public class ClientMain {
  public static void main(String[] args) {
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    System.out.println(mp4Video);
  }
}