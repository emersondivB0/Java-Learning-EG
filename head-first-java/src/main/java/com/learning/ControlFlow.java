package com.learning;

public class ControlFlow {

  public void Flow() {
    int attendees = 4;
    boolean largeVenue = false;
    int fee = 42;

    if (attendees >= 5 && fee > 25) {
      largeVenue = true;
    }
    System.out.println("First Large Venue: " + largeVenue);

    // same code with less code
    largeVenue = (attendees >= 5 && fee > 25);

    System.out.println("Second Large Venue: " + largeVenue);
  }

  /*
   * A Ternary Operator is a concise way to perform conditional operations.
   * It consist in 3 operands: a condition, a value if the condition is true
   * and a value if the condition is false.
   * Can be used instead if-else statement.
   * variable = (condition) ? expressionTrue : expressionFalse;
   */
  public void TernaryOparator() {
    // instead of writing
    int time = 20;
    if (time < 18) {
      System.out.println("Good Day!");
    } else {
      System.out.println("Good Evening!");
    }

    // You can write it as:
    time = 16;
    String result = (time < 18) ? "Good Day!" : "Good Evening!";
    System.out.println(result);
  }

  /*
   * Switch Statement:
   */
  public void SwitchStatement() {
    double price = 1.99;
    double discount = 0;
    String condition = "Used";

    switch (condition) {
      case "Damaged":
        discount = price * 0.1;
        break;
      case "Used":
        discount = price * 0.2;
        break;
      default:
        discount = price;
    }
    System.out.println("discount: " + discount);
  }

}
