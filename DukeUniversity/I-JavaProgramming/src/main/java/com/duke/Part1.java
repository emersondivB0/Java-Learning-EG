package com.duke;

public class Part1 {
    // Method finds a gene in a DNA strand using a simplified algorithm
    public static String findSimpleGene(String dna) {
        String gene = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return ""; // No start codon found
        }

        int endIndex = dna.indexOf("TAA", startIndex + 3);
        if (endIndex == -1 || (endIndex - startIndex) % 3 != 0) {
            return ""; // No valid stop codon or invalid gene length
        }

        gene = dna.substring(startIndex, endIndex + 3); // Include the stop codon
        return gene;
    }

    // Method tests the findSimpleGene method with various DNA strings
    public static void testSimpleGene() {
        String dna = "AATGCCTAA";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "CTACTATAG";
        System.out.println("\nDNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "CGAT";
        System.out.println("\nDNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "ATGTAAACT";
        System.out.println("\nDNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);

        dna = "ATGTCTAA";
        System.out.println("\nDNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }

    public static void main(String[] args) {
        testSimpleGene();
    }
}
