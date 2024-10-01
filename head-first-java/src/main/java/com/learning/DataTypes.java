package com.learning;

public class DataTypes {

  public void primeraPrueba() {
    System.out.println("Hello World!");
    int x = 3;
    System.out.println("x = " + x);
    String pass = "password";
    double d = Math.random();
    System.out.println("random = " + d);
    System.out.println("random 2: " + Math.round(d));
  }

  // Lets study Primitive Data types and Operators
  /*
   * Integral types: byte, short, int, long,
   * Floating point types: float, double,
   * Textual type: char,
   * Logical type: booblean
   *
   * Any values that must not change should be made constant using the 'final'
   * keyword
   * final int NUMBER_OF_MONTHS = 12;
   *
   */

  public void DataTypes() {
    System.out.println("Init Data Types...");
    int num1 = 0;
    int num2 = 0;

  }

  /*
   * Primitives can be compared only by using relational Operators
   * Objects, for example String, can be compared by using Operators
   */
  public void Comparing() {
    double price1 = 9.99, price2 = 12.99;
    boolean cheap = price1 > price2;
    System.out.println("Comparig prices: " + price1 + " > " + price2 + " = " + cheap);

    String name1 = "Pinkly", name2 = "pinkly";
    boolean sameName1 = name1.equals(name2);
    boolean sameName2 = name1.equalsIgnoreCase(name2);
    System.out.println("Primer caso: " + sameName1);
    System.out.println("Segundo caso: " + sameName2);
  }

  /*
   * String variables can be combined using the '+' Operator
   */
  public void Concatenation() {
    String greet1 = "Hello", greet2 = "World";

    String message1 = greet1.concat(greet2);

    String message2 = greet1 + " " + greet2 + "!";

    System.out.println(message1);
    System.out.println(message2);
  }

  /*
   * Java provides multiple different classes, such a String
   * Each class provides multiple methods
   * The Java docs provides the reference for the classes
   */
  public void Operations() {
    String hello = "Heloo World";

    int stringLength = hello.length();
    String greet = " HOW ".trim();
    System.out.println("Trim HOW: " + greet);

    String lc1 = greet + "DY".toLowerCase();
    String lc2 = (greet + "DY").toLowerCase();
    System.out.println("To lower case: " + lc1 + " - " + lc2);

    int idx1 = hello.indexOf("o");
    System.out.println("Index of o in greeting: " + idx1);
  }
}
