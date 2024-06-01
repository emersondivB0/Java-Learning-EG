package com.duke.week3;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

public class CSVMax {
  public CSVRecord hottestHourInFile(CSVParser parser) {

    CSVRecord largestSoFar = null;
    for (CSVRecord currentRow : parser) {
      largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
    }
    return largestSoFar;
  }

  public void testHottestInDay() {
    FileResource fr = new FileResource("/run/media/emersong/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/data/weather/2015/weather-2015-01-01.csv");
    CSVParser parser = fr.getCSVParser();
    CSVRecord largest = hottestHourInFile(parser);
    System.out.println("hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get( "TimeEST"));
  }

  public CSVRecord hottestInManyDays() {
    CSVRecord largestSoFar = null;
    DirectoryResource dr = new DirectoryResource();
    for (File f : dr.selectedFiles()) {
      FileResource fr = new FileResource(f);
      CSVParser parser = fr.getCSVParser();
      CSVRecord currentRow = hottestHourInFile(parser);
      largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
    }
    return largestSoFar;
  }
public CSVRecord getLargestOfTwo(CSVRecord currentRow, CSVRecord largestSoFar) {
  if (largestSoFar == null) {
    largestSoFar = currentRow;
  } else {
    double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
    double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));
    if (currentTemp > largestTemp) {
      largestSoFar = currentRow;
    }
  }
  return largestSoFar;
}

  public void testHottestInManyDays() {
    CSVRecord largest = hottestInManyDays();
    System.out.println("hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("DateUTC"));
  }

  public CSVRecord getSmallestOfTwo(CSVRecord currentRow, CSVRecord smallestSoFar) {
      if (smallestSoFar == null) {
          smallestSoFar = currentRow;
      } else if (!currentRow.get("TemperatureF").equals("-9999")) {
          double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
          double smallestTemp = Double.parseDouble(smallestSoFar.get("TemperatureF"));
          if (currentTemp < smallestTemp) {
              smallestSoFar = currentRow;
          }
      }
      return smallestSoFar;
  }

  public CSVRecord coldestHourInFile(CSVParser parser) {
    CSVRecord smallestSoFar = null;
    for (CSVRecord currentRow : parser) {
      smallestSoFar = getSmallestOfTwo(currentRow, smallestSoFar);
    }
    return smallestSoFar;
  }

  public void testColdestHourInFile() {
    FileResource fr = new FileResource("/run/media/emersong/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/data/weather/2015/weather-2015-01-01.csv");
    CSVParser parser = fr.getCSVParser();
    CSVRecord largest = coldestHourInFile(parser);
    System.out.println("coldest temperature was " + largest.get("TemperatureF") + " at " + largest.get( "TimeEST"));
  }

  public String fileWithColdestTemperature() {
    CSVRecord coldestSoFar = null;
    String coldestFile = null;
    DirectoryResource dr = new DirectoryResource();
    for (File f : dr.selectedFiles()) {
      FileResource fr = new FileResource(f);
      CSVParser parser = fr.getCSVParser();
      CSVRecord currentRow = coldestHourInFile(parser);

      if (coldestSoFar == null || getSmallestOfTwo(currentRow, coldestSoFar) == currentRow) {
        coldestSoFar = currentRow;
        coldestFile = f.getName();
      }
    }
    if (coldestFile != null) {
      System.out.println("Coldest day was in file " + coldestFile);
      System.out.println("Coldest temperature on that day was " + coldestSoFar.get("TemperatureF"));
      //printAllTemperatures(coldestFile);
    }
    return coldestFile;
  }

  public void printAllTemperatures(String fileName) {
    try {
      FileResource fr = new FileResource(fileName);
      CSVParser parser = fr.getCSVParser();
      System.out.println("All temperatures on the coldest day:");
      for (CSVRecord record : parser) {
        System.out.println(record.get("TemperatureF"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void testFileWithColdestTemperature() {
    String file = fileWithColdestTemperature();
    System.out.println("Coldest day was in file " + file);
  }

//  public CSVRecord lowestHumidityInFile(CSVParser parser) {
//    CSVRecord lowestSoFar = null;
//    for (CSVRecord currentRow : parser) {
//      if (lowestSoFar == null) {
//        lowestSoFar = currentRow;
//      } else if (!currentRow.get("Humidity").equals("N/A")) {
//        int currentHumidity = Integer.parseInt(currentRow.get("Humidity"));
//        int lowestHumidity = Integer.parseInt(lowestSoFar.get("Humidity"));
//        if (currentHumidity < lowestHumidity) {
//          lowestSoFar = currentRow;
//        }
//      }
//    }
//    return lowestSoFar;
//  }
//
//  public void testLowestHumidityInFile() {
//    FileResource fr = new FileResource();
//    CSVParser parser = fr.getCSVParser();
//    CSVRecord csv = lowestHumidityInFile(parser);
//    System.out.println("Lowest humidity was " + csv.get("Humidity") + " at " + csv.get("DateUTC"));
//  }
//
//  public CSVRecord lowestHumidityInManyFiles() {
//      CSVRecord lowestSoFar = null;
//
//      DirectoryResource dr = new DirectoryResource();
//      CSVRecord currentRow = null;
//      for (File f : dr.selectedFiles()) {
//          FileResource fr = new FileResource(f);
//          CSVParser parser = fr.getCSVParser();
//          currentRow = lowestHumidityInFile(parser);
//      }
//      return currentRow;
//  }
//
//  public void testLowestHumidityInManyFiles() {
//    CSVRecord csv = lowestHumidityInManyFiles();
//    System.out.println("Lowest humidity was " + csv.get("Humidity") + " at " + csv.get("DateUTC"));
//  }
public static CSVRecord lowestHumidityInFile(CSVParser parser) {
  //start with lowestSoFar as nothing
  CSVRecord lowestSoFar = null;
  //For each row (currentRow) in the CSV File
  for (CSVRecord currentRow : parser) {
    // use method to compare two records
    lowestSoFar = getSmallestHumidityOfTwo(currentRow, lowestSoFar);
  }
  //The smallestSoFar is the answer
  return lowestSoFar;
}

  public static CSVRecord getSmallestHumidityOfTwo (CSVRecord currentRow, CSVRecord smallestSoFar) {
    //If smallestSoFar is nothing
    if (smallestSoFar == null) {
      smallestSoFar = currentRow;
    }
    //Otherwise
    else {
      if (currentRow.get("Humidity").length() != 3){
        double currentTemp = Double.parseDouble(currentRow.get("Humidity"));
        double smallestTemp = Double.parseDouble(smallestSoFar.get("Humidity"));
        //Check if currentRow’s temperature < smallestSoFar’s
        if (currentTemp < smallestTemp && currentTemp != -9999) {
          //If so update smallestSoFar to currentRow
          smallestSoFar = currentRow;
        }
      }
    }
    return smallestSoFar;
  }

  public static void testLowestHumidityInFile() {
    FileResource fr = new FileResource("/run/media/emersong/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/data/weather/2014/weather-2014-07-22.csv");
    CSVRecord smallest = lowestHumidityInFile(fr.getCSVParser());
    System.out.println("Lowest humidity was " + smallest.get("Humidity") +
            " at " + smallest.get("DateUTC"));
  }


  public static CSVRecord lowestHumidityInManyFiles() {
    CSVRecord lowestSoFar = null;
    DirectoryResource dr = new DirectoryResource();
    // iterate over files
    for (File f : dr.selectedFiles()) {
      FileResource fr = new FileResource(f);
      // use method to get largest in file.
      CSVRecord currentRow = lowestHumidityInFile(fr.getCSVParser());
      // use method to compare two records
      lowestSoFar = getSmallestHumidityOfTwo(currentRow, lowestSoFar);
    }
    //The largestSoFar is the answer
    return lowestSoFar;
  }

  public static void testLowestHumidityInManyFiles() {
    CSVRecord csv = lowestHumidityInManyFiles();
    System.out.println("Lowest Humidity was " + csv.get("Humidity") + " at " + csv.get("DateUTC"));
  }

  public static double averageTemperatureInFile(CSVParser parser){
    double sum=0;
    double avarage =0;
    int count = 1;
    for (CSVRecord currentRow : parser) {
      double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
      sum += currentTemp;
      avarage =sum/count;
      count++;
    }
    return avarage;
  }

  public static void  testAverageTemperatureInFile() {
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
    double avarage = averageTemperatureInFile(parser);
    System.out.println("Average temperature in file is " + avarage);
  }

  public static double averageTemperatureWithHighHumidityInFile(CSVParser parser, int value ){

    double sum=0;
    double avarage =0;
    int count = 1;
    for (CSVRecord currentRow : parser) {
      // use method to compare two records
      double currentHumidity = Double.parseDouble(currentRow.get("Humidity"));
      double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
      if(currentHumidity>=value){
        sum += currentTemp;
        avarage =sum/count;
        count++;
      }
    }

    return avarage;
  }


  public static void testAverageTemperatureWithHighHumidityInFile(){
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();
    double avarage = averageTemperatureWithHighHumidityInFile(parser,80);
    if(avarage==0)System.out.println("No temperatures with that humidity");
    else System.out.println("Average temperature when high Humidity is " + avarage);
  }
}
