import edu.duke.StorageResource;

public class Part1 {
  public static int findStopCodon(String dna, int startIndex, String stopCodon) {
    int stopCodonIndex = dna.indexOf(stopCodon, startIndex + 3);
    if (stopCodonIndex == -1) {
      return dna.length();
    }
    return stopCodonIndex;
  }

  public void testFindStopCodon() {
    String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    int index = findStopCodon(dna, 0, "TAA");
    System.out.println(index);
    String dna2 = "xxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAAxxxyyyzzzTAA";
    int index2 = findStopCodon(dna2, 0, "TAA");
    System.out.println(index2);
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

  public StorageResource getAllGenes(String dna) {
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
}
