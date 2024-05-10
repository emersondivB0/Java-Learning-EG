package com.duke;

import edu.duke.FileResource;
import edu.duke.StorageResource;

public class AllCodons {
  public static int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
    // find stopCodon starting from (startIndex + 3), currentIndex = -1 when not
    // found
    int currentIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
    // as long as currIndex != -1:
    while (currentIndex != -1) {
      // if (currIndex - startIndex) % 3 == 0
      if ((currentIndex - startIndex) % 3 == 0) {
        return currentIndex;
      } else {
        currentIndex = dnaStr.indexOf(stopCodon, currentIndex + 1);
      }
    }
    return dnaStr.length();
  }

  public static String findGene(String dna, int where) {
    // find the first occurrence of "ATG", startIndex
    int startIndex = dna.indexOf("ATG", where);
    if (startIndex == -1) {
      return "";
    }
    int taaIndex = findStopCodon(dna, startIndex, "TAA");
    int tagIndex = findStopCodon(dna, startIndex, "TAG");
    int tgaIndex = findStopCodon(dna, startIndex, "TGA");
    int minIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
    if (minIndex == dna.length()) {
      return "";
    }
    return dna.substring(startIndex, minIndex + 3);
  }

  public static StorageResource getAllGenes(String dna) {
    //Create an empty StorageResource, call it geneList
    StorageResource geneList = new StorageResource();
    int startIndex = 0;
    while (true) {
      String currentGene = findGene(dna, startIndex);
      if (currentGene.isEmpty()) {
        break;
      }
      //Add that gene to gene list
        geneList.add(currentGene);
      System.out.println(currentGene);
      startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
    }
    //Your answer is geneList
    return geneList;
  }

  public void testOn(String dna) {
    System.out.println("Testing printAllGenes on " + dna);
    StorageResource genes = getAllGenes(dna);
    for (String gene : genes.data()) {
      System.out.println("> " + gene);
    }
  }

  public void test() {
    testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
    testOn("");

    testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
  }

  public void testFindStopCodon() {
    String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
    int where = findStopCodon(dna, 0, "TAA");
    if (where != 9)
      System.out.println("error on 9");
    where = findStopCodon(dna, 9, "TAA");
    if (where != 21)
      System.out.println("error on 21");
    where = findStopCodon(dna, 1, "TAA");
    if (where != 26)
      System.out.println("error on 26");
    where = findStopCodon(dna, 0, "TAG");
    if (where != 26)
      System.out.println("error on 26 TAG");
    System.out.println("tests finnished");
  }

  public void testFindGeneWithValidDNA() {
    String dna = "ATGTAAGCCCTATAG";
    String expectedGene = "ATGTAAGCCCTA";

    String actualGene = findGene(dna, 0);

    if (!actualGene.equals(expectedGene)) {
      System.out.println("testFindGeneWithValidDNA failed");
      System.out.println("expected: " + expectedGene);
      System.out.println("actual: " + actualGene);
    }
  }

  /**
   * THIRD ASSIGNMENT
   */
  public static float cgRatio(String dna) {
    int countC = 0;
    int countG = 0;
    int countGorC = 0;
    int length = dna.length();
    for (int i = 0; i < length; i++) {
      if (dna.charAt(i) == 'C') {
        countC++;
      } else if (dna.charAt(i) == 'G') {
        countG++;
      }
    }
    countGorC = countC + countG;
    if (countGorC == 0) {
      return (float) 0;
    }
    return (float) countGorC / length;
  }

  public void testCGRatio() {
    String dna = "ATGTAAGCCCTATAG";
    float ratio = cgRatio(dna);
    if (ratio != 0.5) {
      System.out.println("testCGRatio failed");
    } else {
      System.out.println("testCGRatio passed");
    }
  }

  public int countCTG(String dna) {
    int count = 0;
    int length = dna.length();
    for (int i = 0; i < length; i++) {
      if (dna.startsWith("CTG", i)) {
        count++;
      }
    }
    return count;
  }

  public void testCountCTG() {
    String dna = "ATGTAACTGCTGGCCCTATAGCTG";
    int count = countCTG(dna);
    if (count != 1) {
      System.out.println("testCountCTG failed");
    } else {
      System.out.println("testCountCTG passed");
    }
    System.out.println("All the count" + count);
  }

  public static void processGenes(StorageResource sr) {

      //print all the Strings in sr that are longer than 9 characters
      int count = 0;
      System.out.println("Strings in sr that are longer than 9 characters");
      for (String s : sr.data()) {
        if (s.length() > 60) {
          System.out.println("> " + s);
          count++;
        }
      }

      //print the number of Strings in sr that are longer than 9 characters
      System.out.println("Number of Strings in sr that are longer than 60 characters: " + count);
      //print the Strings in sr whose C-G-ratio is higher than 0.35
      int count2 = 0;
      for (String s : sr.data()) {
        if (cgRatio(s) > 0.35) {
          count2++;
        }
      }
      System.out.println("Strings in sr whose C-G-ratio is higher than 0.35 = " + count2);
      //print the number of strings in sr whose C-G-ratio is higher than 0.35

      //print the length of the longest gene in sr
      int longest = 0;
      for (String s : sr.data()) {
        if (s.length() > longest) {
          longest = s.length();
        }
      }
      System.out.println("Longest gene in sr = " + longest);
  }

  public static void testProcessGenes() {
    StorageResource sr = new StorageResource();
    sr.add("Hello");
    sr.add("World");
    sr.add("ATGTAACTGCTGGCCCTATAGCTG");
    sr.add("ATGTAAGCCCTATAG");
    sr.add("ATGTAAGCCCTATAGCTG");
    AllCodons.processGenes(sr);
  }

  /**
   * We have some real DNA for you to test your code on. Download the file brca1line.fa
   * from the DukeLearnToProgram Project Resources page. Make sure you save it in your
   * BlueJ project so that your code can access it. You can use a FileResource to open the
   * file and the FileResource method asString to convert the contents of the file to a single
   * string so that you can use it like the other DNA strings you have been using. Here is an example:
   *
   * 2
   * FileResource fr = new FileResource("brca1line.fa");
   * String dna = fr.asString();
   * Modify your processGenes method so that it prints all the Strings that are longer
   * than 60 characters and prints the number of Strings that are longer than 60 characters
   * (you do not need to make changes to the rest of the method).
   *
   * Modify the method testProcessGenes to call processGenes with a StorageResource of the
   * genes found in the file brca1line.fa.
   */

  public static void finalProcessGenes() {
    FileResource fr = new FileResource("/run/media/emerson-arch/DataN/Repositories/Java-Learning-EG/DukeUniversity/I-JavaProgramming/src/main/java/com/duke/brca1line.fa");
    String dna = fr.asString();
    dna = dna.toUpperCase();
    StorageResource sr = getAllGenes(dna);
    processGenes(sr);
    System.out.println("Total genes: " + sr.size());
    String stringa = "CTG";
    System.out.println("CTG occurs " + howMany(stringa, dna) + " times");
  }

  public static int howMany(String stringa, String stringb) {
    int count = 0;
    int currentIndex = 0;
    while (currentIndex != -1) {
      if (currentIndex == 0) {
        currentIndex = stringb.indexOf(stringa);
        System.out.println("primer encuentro: " + currentIndex);
        if (currentIndex != -1) {
          currentIndex += stringa.length();
          count = 1;
        } else {
          break;
        }
      } else {
        currentIndex = stringb.indexOf(stringa, currentIndex);
        if (currentIndex != -1) {
          currentIndex += stringa.length();
          count++;
        } else {
          break;
        }
      }
    }
    return count;
  }

  public static void testHowMany() {
    String stringa = "AA";
    String stringb = "ATAAAA";
    System.out.println("AA occurs " + howMany(stringa, stringb) + " times");
  }

}
