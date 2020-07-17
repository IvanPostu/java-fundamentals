package com.utm.dessignpatterns.structural.adapter;

public class Main {
  
  public static void main(String[] args) {
  
    ExternalDatastore datastore = new ExternalDatastore();
    AnalyticsService analyticsService = new AnalyticsService();
    JSONToAnalyticsDTOAdapter adapter = new JSONToAnalyticsDTOAdapter();

    String dataFromDatastoreInJSON = datastore.loadProductsListInJSONFormat();
    AnalyticsServiceDTO dto = adapter.fromJSONToAnalyticsDTOAdapt(dataFromDatastoreInJSON);


    String analyticsResult = analyticsService.analyze(dto);
    System.out.println(analyticsResult);
  }

}