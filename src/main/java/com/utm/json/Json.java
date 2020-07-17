package com.utm.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Json {

  private static final Logger logger = LogManager.getLogger(Json.class);
  private static ObjectMapper objectMapper = getDefaultObjectMapper();

  private static ObjectMapper getDefaultObjectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper;
  }

  public static JsonNode parse(String src) {
    try {
      return objectMapper.readTree(src);
    } catch (Exception e) {
      logger.error(e);
      throw new RuntimeException();
    } 
  }

  
}