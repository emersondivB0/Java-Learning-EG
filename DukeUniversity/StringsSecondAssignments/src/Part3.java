public class Part3 {
  /**
   * Write a program to count how many genes are in a strand of DNA.
   * Specifically, you should do the following:
   * 1. Create a new Java Class named Part3 in the StringsSecondAssignments project.
   * Put the following methods in this class.
   * 2. Copy your methods from Part1 to find one gene and print all genes.
   * 3. Write the method named countGenes that has a String parameter named dna
   * representing a string of DNA. This method returns the number of genes found in dna.
   * For example the call countGenes(“ATGTAAGATGCCCTAGT”) returns 2, finding the gene
   * ATGTAA first and then the gene ATGCCCTAG. Hint: This is very similar to finding
   * all genes and printing them, except that instead of printing all the genes you will count them.
   * 4. Write the void method named testCountGenes that has no parameters.
   * This method calls countGenes with many example strings and prints the result for each.
   * You should create several examples with different numbers of genes to test your code.
   */

  public static int findStopCodon(String dna, int startIndex, String stopCodon) {
    int stopCodonIndex = dna.indexOf(stopCodon, startIndex + 3);
    if (stopCodonIndex == -1) {
      return dna.length();
    }
    return stopCodonIndex;
  }
  public static String findGene(String dna) {
    // find the first occurrence of "ATG", startIndex
    int startIndex = dna.indexOf("ATG");
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

  public static void printAllGenes(String dna) {
    while (true) {
      String gene = findGene(dna);
      if (gene.isEmpty()) {
        break;
      }
      System.out.println(gene);
      dna = dna.substring(dna.indexOf(gene) + gene.length());
    }
  }

  public static int countGenes(String dna) {
    int count = 0;
    while (true) {
      String gene = findGene(dna);
      if (gene.isEmpty()) {
        break;
      }
      count++;
      dna = dna.substring(dna.indexOf(gene) + gene.length());
    }
    return count;
  }

  public static void testCountGenes() {
    String dna = "ATGTAAGATGCCCTAGT";
    System.out.println("Genes found: " + countGenes(dna));
    dna = "ATGTAAGATGCCCTAGTATGTAAGATGCCCTAGT";
    System.out.println("Genes found: " + countGenes(dna));
    dna = "ATGTAAGATGCCCTAGTATGTAAGATGCCCTAGTATGTAAGATGCCCTAGT";
    System.out.println("Genes found: " + countGenes(dna));
  }
}
