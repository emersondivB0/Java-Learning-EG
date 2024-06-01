package com.duke;

import com.duke.week2.StorageTest;
import com.duke.week3.CSVMax;
import com.duke.week3.FirstCSVExample;
import com.duke.week3.WhichCountriesExport;
import com.duke.week4.BabyBirths;
import com.duke.week4.BabyNames;
import com.duke.week5.GrayScaleConverter;
import com.duke.week5.ImageSaver;
import edu.duke.DirectoryResource;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

/**
 * Here are some optional ideas to extend your program even further:
 *
 * Test edge cases. 'Edge cases' refer to special situations where a program might break down.
 * For example, consider searching for names that don't exist at all on the list of baby names provided,
 * or only appear in some years but not in others. What happens when you try to find the most popular decade for such a name?
 *
 * Use a different set of data. Does your home country record a similar set of data? Try finding a similar
 * but different set of data and modifying your program to work with it. What changes do you have to make
 * with the new data set? What are the similarities? How might those similarities and differences affect
 * how you would write a program that used data from every country in the world?
 *
 * Explore different statistics. If you wanted to know the median rank for a name over a period of multiple years,
 * rather than the most popular year in that span, how would you write your program? What about finding a list
 * of all the names that were used for fewer than 10 children in a particular year? What about finding the most
 * popular name and year in the entire data set from a short list of your friends and family names? What are your
 * own ideas for discovering interesting facts from this data set?
 *
 * Adapt your program to a new problem. This project focused on reading data from CSV files, which is a common
 * data storage format. Try adapting your baby name program to do something new. For example, you might be a
 * teacher with a gradebook of student test results; you could use your program to find the average scores for each test.
 * Or you might run a business and have accounting records; you could find your most profitable month over the last two years of operation.
 *
 * Whatever you do to extend your program and solve new problems, share it with us and your peers in the forums! Happy programming!
 *
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Init Learning!");

    //FirstCSVExample firstCSVExample = new FirstCSVExample();
    //firstCSVExample.readFood();

    //WhichCountriesExport whichCountriesExport = new WhichCountriesExport();
    //whichCountriesExport.whoExportsCoffee();
    //whichCountriesExport.tester();

    //CSVMax csvMax = new CSVMax();
    //csvMax.testHottestInDay();
    //csvMax.testHottestInManyDays();
    //csvMax.testColdestHourInFile();
    //csvMax.testFileWithColdestTemperature();
    //CSVMax.testLowestHumidityInFile();
    //CSVMax.testLowestHumidityInManyFiles();
    //CSVMax.testAverageTemperatureInFile();
    //CSVMax.testAverageTemperatureWithHighHumidityInFile();

    //BabyBirths babyBirths = new BabyBirths();
    //babyBirths.printNames();
    //babyBirths.testTotalBirths();
    //babyBirths.testTotalBirth();

    //BabyNames babyNames = new BabyNames();
    //babyNames.testTotalBirth();

    //GrayScaleConverter grayScaleConverter = new GrayScaleConverter();
    //grayScaleConverter.testGray();

    ImageSaver imageSaver = new ImageSaver();
    imageSaver.testSave();
  }


}
