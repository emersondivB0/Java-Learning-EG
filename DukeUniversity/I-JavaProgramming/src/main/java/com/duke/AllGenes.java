package com.duke;

public class AllGenes {
    public void printAllGenes(String dna) {

        while (true) {
            String currentGene = findGene(dna);
            if (currentGene.isEmpty()) {
                break;
            }
            System.out.println(currentGene);
            dna = dna.substring(currentGene.length());
        }
    }

    private String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) {
            return "";
        }
        return dna.substring(startIndex, stopIndex + 3);
    }
}
