package com.duke;

public class FindGeneSimpleAndTest {
    public String findSimpleGene(String dna) {
        int start = dna.indexOf("ATG");
        if (start == -1) {
            return "";
        }
        int stop = dna.indexOf("TAA", start+3);
        if (stop == -1) {
            return "";
        }
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop+3);
        }
        else {
            return "";
        }
    }

    public void testFindGeneSimple() {
     String dna = "AATGCTGTAATATGGT";
        System.out.println("DNA strand: " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene);

        dna = "ATGCGTAATATGGT";
        System.out.println("DNA strand: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene);

        dna = "ATGCGTAATATGGTT";
        System.out.println("DNA strand: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene: " + gene);
    }
}
