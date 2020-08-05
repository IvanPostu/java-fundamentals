package com.utm.dessignpatterns.structural.facade;

public class CodecFactory {
  public static Codec extract(VideoFile videoFile) {
    final String type = videoFile.getCodecType();

    if (type.equals("mp4")) {
      System.out.println("CodecFactory: extracting mpeg audio...");
      return new MPEG4CompressionCodec();
    }

    if (type.equals("off")) {
      System.out.println("CodecFactory: extracting ogg audio...");
      return new OggCompressionCodec();
    }

    return null;
  }
}