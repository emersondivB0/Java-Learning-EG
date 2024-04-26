package com.duke;

public class AllCodons {
  public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
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

  public String findGene(String dna, int where) {
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

  public void printAllGenes(String dna) {
    int startIndex = 0;
    while (true) {
      String currentGene = findGene(dna, startIndex);
      if (currentGene.isEmpty()) {
        break;
      }
      System.out.println(currentGene);
      startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
    }
  }

  public void testOn(String dna) {
    System.out.println("Testing printAllGenes on " + dna);
    printAllGenes(dna);
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
}
