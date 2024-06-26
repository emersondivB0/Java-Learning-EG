package com.duke.week4;

import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;

/**
 * @author Emerson González
 */
public class BabyBirths {

    public void printNames() {
        FileResource fr = new FileResource();
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            if (numBorn <= 100) {
                System.out.println("Name: " + rec.get(0) + " Gender: " + rec.get(1) + " Births: " + rec.get(2));
            }
        }
    }

    public void totalBirths(FileResource fr) {
        int totalBirths = 0;
        int totalBoys = 0;
        int totalGirls = 0;
        for (CSVRecord rec : fr.getCSVParser(false)) {
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn;
            if (rec.get(1).equals("M")) {
                totalBoys += numBorn;
            } else if (rec.get(1).equals("F")) {
                totalGirls += numBorn;
            }
        }
        System.out.println("Total births: " + totalBirths);
        System.out.println("Total girls: " + totalGirls);
        System.out.println("Total boys: " + totalBoys);
        System.out.println("Average girls: " + 1.0 * totalGirls / totalBirths);
        System.out.println("Average boys: " + 1.0 * totalBoys / totalBirths);
    }

    public void testTotalBirths() {
        FileResource fr = new FileResource("/run/media/emersong/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/data/us_babynames/us_babynames_test/example-small.csv");
        FileResource fr2 = new FileResource("/run/media/emersong/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/data/us_babynames/us_babynames_by_year/yob1900.csv");
        FileResource fr3 = new FileResource("/run/media/emersong/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/data/us_babynames/us_babynames_by_year/yob1905.csv");
        totalBirths(fr2);
    }

    /*
     * This method returns the rank of the name in the file for the given gender,
     * where rank 1 is the name with the largest number of births.
     * If the name is not in the file, then -1 is returned.
     */
    public long getRank(int year, String name, String gender) {
        long rank = -1;
        FileResource fr = new FileResource("data/us_babynames/us_babynames_by_year/yob" + year + ".csv");
        CSVParser parser = fr.getCSVParser(false);

        for(CSVRecord record : parser) {
            String currName = record.get(0);
            String currGender = record.get(1);

            if(currGender.equals(gender) && currName.equals(name)) {
                rank = record.getRecordNumber();
            }
        }
        return rank;
    }

    /*
     * This method returns the name of the person in the file at this rank,
     * for the given gender, where rank 1 is the name with the largest number of births.
     * If the rank does not exist in the file, then “NO NAME” is returned.
     */
    public String getName(int year, int rank, String gender) {
        String name = "";
        FileResource fr = new FileResource("data/us_babynames/us_babynames_by_year/yob" + year + ".csv");
        CSVParser parser = fr.getCSVParser(false);

        for(CSVRecord record : parser) {
            long currRank = record.getRecordNumber();
            String currGender = record.get(1);
            String currName = record.get(0);

            if(currRank == rank && currGender.equals(gender)) {
                name = currName;
            }
        }

        if(name != "") {
            return name;
        }
        else {
            return "NO NAME";
        }
    }

    /*
     * This method determines what name would have been named if they were born
     * in a different year, based on the same popularity.
     */
    public void whatIsNameInYear(String name, int year, int newYear, String gender) {
        FileResource fr = new FileResource("data/us_babynames/us_babynames_by_year/yob" + year + ".csv");
        FileResource newFr = new FileResource("data/us_babynames/us_babynames_by_year/yob" + newYear + ".csv");
        CSVParser parserOld = fr.getCSVParser(false);
        CSVParser parserNew = newFr.getCSVParser(false);
        String newName = "";
        long popularity = 0;

        for(CSVRecord record : parserOld) {
            String currName = record.get(0);
            String currGender = record.get(1);

            if(currName.equals(name) && currGender.equals(gender)) {
                popularity = record.getRecordNumber();
            }
        }

        for(CSVRecord record : parserNew) {
            String currGender = record.get(1);
            long currPopularity = record.getRecordNumber();

            if(currGender.equals(gender) && popularity == currPopularity) {
                newName = record.get(0);
            }
        }

        System.out.println(name + " born in " + year + " would be " + newName + " if she was born in " + newYear);
    }

    /*
     * This method selects a range of files to process and returns an integer,
     * the year with the highest rank for the name and gender.
     * If the name and gender are not in any of the selected files, it should return -1.
     */
    public int yearOfHighestRank(String name, String gender) {
        long highestRank = 0;
        int yearOfHighestRank = -1;
        String fileName = "";
        DirectoryResource dr = new DirectoryResource();

        // Iterate through all files
        for(File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);

            // Iterate through all records in file
            for(CSVRecord record : parser) {
                String currName = record.get(0);
                String currGender = record.get(1);

                if(currName.equals(name) && currGender.equals(gender)) {
                    long currRank = record.getRecordNumber();

                    if(highestRank == 0) {
                        highestRank = currRank;
                        fileName = f.getName();
                    }
                    else {
                        if(highestRank > currRank) {
                            highestRank = currRank;
                            fileName = f.getName();
                        }
                    }
                }
            }
        }

        // Remove all non-numeric characters from the filename
        fileName = fileName.replaceAll("[^\\d]", "");

        // Convert String fileName to Integer
        yearOfHighestRank = Integer.parseInt(fileName);

        return yearOfHighestRank;
    }

    /*
     * This method returns the average rank of a name in multiple files
     */
    public double getAverageRank(String name, String gender) {
        // Initialize a DirectoryResource
        DirectoryResource dr = new DirectoryResource();
        // Define rankTotal, howMany
        double rankTotal = 0.0;
        int howMany = 0;
        // For every file the directory add name rank to agvRank
        for(File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);
            for(CSVRecord record : parser) {
                String currName = record.get(0);
                String currGender = record.get(1);
                if(currName.equals(name) && currGender.equals(gender)){
                    long currRank = record.getRecordNumber();
                    rankTotal += (double)currRank;
                    howMany += 1;
                }
            }
        }
        // Define avgRank = rankTotal / howMany
        double avgRank = rankTotal / (double)howMany;
        return avgRank;
    }

    /*
     * This method returns the total births of the same gender that are ranked higher
     * than the parameter name
     */
    public int getTotalBirthsRankedHigher(int year, String name, String gender) {
        int numBorn = 0;
        long rank = getRank(year, name, gender);
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);
        for(CSVRecord record : parser) {
            int currBorn = Integer.parseInt(record.get(2));
            String currGender = record.get(1);
            long currRank = record.getRecordNumber();
            if(gender.equals(currGender) && rank > currRank) {
                numBorn += currBorn;
            }
        }
        return numBorn;
    }

    public void testTotalBirth() {
        //FileResource fr = new FileResource("yob1900.csv");
        //totalBirths(fr);

        //long rank = getRank(1971, "Frank", "M");
        //System.out.println("Rank is: " + rank);

        //String name = getName(1982, 450, "M");
        //System.out.println("Name: " + name);

        //whatIsNameInYear("Owen", 1974, 2014, "F");

        //System.out.println(yearOfHighestRank("Mich", "M"));

        //System.out.println(getAverageRank("Robert", "M"));

        System.out.println(getTotalBirthsRankedHigher(1990, "Drew", "M"));
    }

}
