package com.utm.dessignpatterns.structural.facade;

public class VideoFile {
  private String name;
  private String codecType;

  public VideoFile(String name) {
    this.codecType = name.substring(name.indexOf(".") + 1);
    this.name = name;
  }

  public String getCodecType() {
    return codecType;
  }

  public String getName() {
    return name;
  }


}
