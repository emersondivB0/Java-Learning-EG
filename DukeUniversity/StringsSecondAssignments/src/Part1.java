public class Part1 {
  /**
   * Find the index of the first occurrence of the stop codon in the DNA strand starting from the given index.
   *
   * @param  dna        the DNA strand to search in
   * @param  startIndex the index to start searching from
   * @param  stopCodon  the stop codon sequence to find
   * @return            the index of the stop codon if found, otherwise the length of the DNA strand
   */
  public static int findStopCodon(String dna, int startIndex, String stopCodon) {
    int stopCodonIndex = dna.indexOf(stopCodon, startIndex + 3);
    if (stopCodonIndex == -1) {
      return dna.length();
    }
    return stopCodonIndex;
  }

  /**
   * 4. Write the void method testFindStopCodon that calls the method findStopCodon
   * with several examples and prints out the results to check if findStopCodon is
   * working correctly. Think about what types of examples you should check.
   * For example, you may want to check some strings of DNA that have genes and
   * some that do not. What other examples should you check?
   */
  public void testFindStopCodon() {
    String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    int index = findStopCodon(dna, 0, "TAA");
    System.out.println(index);
    String dna2 = "xxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    int index2 = findStopCodon(dna2, 0, "TAA");
    System.out.println(index2);
  }

  /**
   * 5. Write the method findGene that has one String parameter dna, representing
   * a string of DNA. In this method you should do the following:
   * Find the index of the first occurrence of the start codon “ATG”.
   * If there is no “ATG”, return the empty string.
   * Find the index of the first occurrence of the stop codon “TAA” after
   * the first occurrence of “ATG” that is a multiple of three away from the “ATG”.
   * Hint: call findStopCodon.
   * Find the index of the first occurrence of the stop codon “TAG” after the
   * first occurrence of “ATG” that is a multiple of three away from the “ATG”.
   * Find the index of the first occurrence of the stop codon “TGA” after the
   * first occurrence of “ATG” that is a multiple of three away from the “ATG”.
   * Return the gene formed from the “ATG” and the closest stop codon that is
   * a multiple of three away. If there is no valid stop codon and therefore
   * no gene, return the empty string.
   * Find the index of the first occurrence of the stop codon in the DNA
   * strand starting from the given index.
   *
   * @param  dna        the DNA strand to search in
   * @param  startIndex the index to start searching from
   * @param  stopCodon  the stop codon sequence to find
   * @return            the index of the stop codon if found, otherwise the length of the DNA strand
   *
   **/
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

  /**
   * 6. Write the void method testFindGene that has no parameters.
   * You should create five DNA strings. The strings should have specific
   * test cases such as DNA with no “ATG”, DNA with “ATG” and one valid stop codon,
   * DNA with “ATG” and multiple valid stop codons, DNA with “ATG” and no valid stop codons.
   * Think carefully about what would be good examples to test. For each DNA string you should:
   * Print the DNA string.
   * Calculate the gene by sending this DNA string as an argument to findGene.
   * If a gene exists following our algorithm above, then print the gene,
   * otherwise print the empty string.
   */

  public void testFindGene() {
    String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    String gene = findGene(dna);
    System.out.println(gene);
    String dna2 = "xxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    String gene2 = findGene(dna2);
    System.out.println(gene2);
    String dna3 = "ATGyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    String gene3 = findGene(dna3);
    System.out.println(gene3);
    String dna4 = "ATGyyyzzzTAAxxxATGyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    String gene4 = findGene(dna4);
    System.out.println(gene4);
  }

  /**
   * 7. Write the void method printAllGenes that has one String parameter dna,
   * representing a string of DNA. In this method you should repeatedly find genes
   * and print each one until there are no more genes. Hint: remember you learned
   * a while(true) loop and break.
   */

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
  public static void testPrintAllGenes() {
    String dna = "AATGCTAACTAGCTGACTAAT";
    printAllGenes(dna);
  }
}
