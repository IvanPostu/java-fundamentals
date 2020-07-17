package com.utm.resources;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourceLoaderFromFS implements ResourcesLoader {
  
  private static final Logger logger = LogManager.getLogger(ResourcesLoader.class);
  

  /**
   * @path example "/application.properties"
   */
  @Override
  public String loadAsString(String path) {

    logger.debug("Load resource as string from path:{}", path);

    StringBuilder resultBuilder = new StringBuilder();

    try(InputStream in = this.getClass().getResourceAsStream(path)) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(in));
      Stream<String> lines = reader.lines();
      Iterator<String> iter = lines.iterator();

      while(iter.hasNext()){
        resultBuilder.append(iter.next());
      }

    } catch (Exception e) {
      logger.error(e);
      logger.debug("Load resource with FAILURE!!!");
    }

    final String result = new String(resultBuilder);
    
    logger.debug("Load resource with SUCCESS!!!");
    logger.debug(result);

    return result;
  }
  
}