package com.duke.week3;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class WhichCountriesExport {
  public void listExporters(CSVParser parser, String exportOfInterest) {

    for (CSVRecord record : parser) {
      String export = record.get("Exports");
      if (export.contains(exportOfInterest)) {
        String country = record.get("Country");
        System.out.println(country);
      }
    }
  }

  public void whoExportsCoffee() {
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
    listExporters(parser, "coffee");
  }

  public String countryInfo(CSVParser parser, String country) {
    for (CSVRecord record : parser) {
      String exports = record.get("Exports");
      String value = record.get("Value (dollars)");
      if (record.get("Country").contains(country)) {
        return country + ": " + exports + ": " + value;
      }
    }
    return "NOT FOUD";
  }

  public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
    for (CSVRecord record : parser) {
      String exports = record.get("Exports");
      if (exports.contains(exportItem1) && exports.contains(exportItem2)) {
        String country = record.get("Country");
        System.out.println(country);
      }
    }
  }

  public int numberOfExporters(CSVParser parser, String exportItem) {
    int count = 0;
    for (CSVRecord record : parser) {
      String exports = record.get("Exports");
      if (exports.contains(exportItem)) {
        count++;
      }
    }
    return count;
  }

  public void bigExporters(CSVParser parser, String amount) {
    for (CSVRecord record : parser) {
      String value = record.get("Value (dollars)");
      if (value.length() > amount.length()) {
        String country = record.get("Country");
        System.out.println(country + " " + value);
      }
    }
  }

  public void tester() {
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
    //System.out.println(countryInfo(parser, "Nauru"));
    //listExportersTwoProducts(parser, "cotton", "flowers");
    //System.out.println(numberOfExporters(parser, "cocoa"));
    bigExporters(parser, "$999,999,999,999");
  }

}
