package com.duke;

import edu.duke.URLResource;

public class Part4 {
    public void findYouTubeLinks() {
        URLResource ur = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String word : ur.words()) {
            String lowerCaseWord = word.toLowerCase();
            int youtubeIndex = lowerCaseWord.indexOf("youtube.com");
            if (youtubeIndex != -1) {
                int leftQuoteIndex = word.lastIndexOf("\"", youtubeIndex);
                int rightQuoteIndex = word.indexOf("\"", youtubeIndex);
                if (leftQuoteIndex != -1 && rightQuoteIndex != -1) {
                    System.out.println(word.substring(leftQuoteIndex + 1, rightQuoteIndex));
                }
            }
        }
    }

    public static void main(String[] args) {
        Part4 p4 = new Part4();
        p4.findYouTubeLinks();
    }
}
