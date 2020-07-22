package com.utm.dessignpatterns.structural.decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileDataSource implements DataSource {
  private static final Logger logger = LogManager.getLogger(FileDataSource.class);

  private String name;

  public FileDataSource(String name) {
    this.name = name;
  }

  @Override
  public void writeData(String data) {
    File file = new File(name);
    try (OutputStream fos = new FileOutputStream(file)) {
      file.createNewFile();
      fos.write(data.getBytes(), 0, data.length());
    } catch (IOException ex) {
      logger.error(ex);
    }
  }

  @Override
  public String readData() {
    char[] buffer = null;
    File file = new File(name);
    try (FileReader reader = new FileReader(file)) {
      buffer = new char[(int) file.length()];
      reader.read(buffer);
    } catch (IOException ex) {
      logger.error(ex);
    }
    return new String(buffer);
  }

}