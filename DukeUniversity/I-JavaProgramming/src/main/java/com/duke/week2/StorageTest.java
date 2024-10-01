package com.duke.week2;

import edu.duke.StorageResource;

public class StorageTest {
  public static void storageTest() {
    StorageResource sr = new StorageResource();
    sr.add("Hello");
    sr.add("World");

    for (String s : sr.data()) {
      System.out.println(s);
    }
  }
}
