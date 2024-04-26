package com.duke.week1;

public class Part3 {
    // Method checks if stringa appears at least twice in stringb
    public static boolean twoOccurrences(String stringa, String stringb) {
        int count = 0;
        int index = 0;
        while ((index = stringb.indexOf(stringa, index)) != -1) {
            count++;
            index++; // Start searching from next character after the found occurrence
        }
        return count >= 2;
    }

    // Method returns the part of stringb after the first occurrence of stringa
    public static String lastPart(String stringa, String stringb) {
        int index = stringb.indexOf(stringa);
        if (index == -1) {
            return stringb; // Stringa not found, return the whole stringb
        } else {
            return stringb.substring(index + stringa.length()); // Return part after stringa
        }
    }

    // Method tests the twoOccurrences and lastPart methods
    public static void testing() {
        System.out.println("Testing twoOccurrences:");
        System.out.println("Is there more than one 'wow' in 'world of Warcraft'? " + twoOccurrences("wow", "world of Warcraft"));
        System.out.println("Is there more than one 'r' in 'world of Warcraft'? " + twoOccurrences("r", "world of Warcraft"));
        System.out.println("Is there more than one 'a' in 'banana'? " + twoOccurrences("a", "banana"));
        System.out.println("Is there more than one 'atg' in 'ctgtatgta'? " + twoOccurrences("atg", "ctgtatgta"));

        System.out.println("\nTesting lastPart:");
        System.out.println("The part of the string after 'an' in 'banana' is " + lastPart("an", "banana"));
        System.out.println("The part of the string after 'zoo' in 'forest' is " + lastPart("zoo", "forest"));
    }

    public static void main(String[] args) {
        testing(); // Call the testing method
    }
}
