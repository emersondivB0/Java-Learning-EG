package com.duke;

public class Part2 {
    // Method finds a gene in a DNA strand (modified for start/stop codons and case)
    public static String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String gene = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1 ) {
            return ""; // No start codon found
        }

        int endIndex = dna.indexOf(stopCodon, startIndex + startCodon.length());
        if ( endIndex == -1 || (endIndex - startIndex) % 3 != 0 ) {
            return ""; // No valid stop codon or invalid gene length
        }

        gene = dna.substring(startIndex, endIndex + stopCodon.length());
        // Adjust case to match DNA string
        return dna.toUpperCase().equals(dna) ? gene.toUpperCase() : gene.toLowerCase();
    }

    // Method tests the findSimpleGene method (unchanged from Part1)
    public static void testSimpleGene() {
        String dna = "ATGTAA";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);

        dna = "AAATATAGATG";
        System.out.println("\nDNA strand is " + dna);
        gene = findSimpleGene(dna, "ATG", "TAG");
        System.out.println("Gene is " + gene);

        dna = "AAATATAA";
        System.out.println("\nDNA strand is " + dna);
        gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
    }

    public static void main(String[] args) {
        testSimpleGene();
    }
}
