package com.duke.week3;

import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FirstCSVExample {
  public void readFood() {
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
    for (CSVRecord record : parser) {
      System.out.print(record.get("Name") + " ");
      System.out.print(record.get("Favorite Color") + " ");
      System.out.println(record.get("Favorite Food"));
    }
  }
}
