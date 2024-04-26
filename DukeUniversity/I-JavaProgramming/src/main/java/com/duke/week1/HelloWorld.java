package com.duke.week1;

import edu.duke.FileResource;

public class HelloWorld {
  public void runHello() {
    FileResource fr = new FileResource("file.txt");
    for (String line : fr.lines()) {
      System.out.println(line);

    }
  }
}
