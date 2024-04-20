package com.duke;
/*Using while loop to find a gene in a DNA strand represented as a string of c,g,t,a letters.
 * A gene is a part of the DNA strand marked by start and stop codons (DNA triples)
 * that is a multiple of 3 letters long.
 * 
 * @author Duke Software Team
 */
public class FindGeneWhile {
  public String findGene(String dna) {
    int start = dna.indexOf("ATG");
    if (start == -1) {
      return "";
    }
    int stop = dna.indexOf("TAA", start+3);
    while (stop != -1) {
      if ((stop - start) % 3 == 0) {
        return dna.substring(start, stop+3);
      }
      else {
        stop = dna.indexOf("TAA", stop+1);
      }
    }
    return "";
  }
}