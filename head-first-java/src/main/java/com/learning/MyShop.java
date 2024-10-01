package com.learning;

import javax.management.Query;

import com.learning.excercises.Clothing;
import com.learning.excercises.Customer;

public class MyShop {

  public static void main(String[] args) {
    // double tax = 0.2;
    // double total;

    Clothing item1 = new Clothing();
    Clothing item2 = new Clothing();
    Clothing item3 = new Clothing();

    item1.Clothing("Blue Jacket", 20.9, "M");
    item2.Clothing("Orange T-Shirt", 10.5, "S");
    item3.Clothing("Black Pants", 15.4, "L");

    Clothing[] items = { item1, item2, item3 };
    // System.out.println(item1.size);

    // total = (2 * item2.price + item1.price) * (1 + tax);
    // System.out.println("Total: " + total);

    // System.out.println("Pants price: " + item3.price);

    Customer c1 = new Customer();
    c1.name = "Pinky";
    c1.size = "S";

    int measurement = 3;
    switch (measurement) {
      case 1:
      case 2:
      case 3:
        c1.size = "S";
        break;
      case 4:
      case 5:
      case 6:
        c1.size = "M";
        break;
      case 7:
      case 8:
      case 9:
        c1.size = "L";
        break;

      default:
        c1.size = "X";
        break;
    }
    System.out.println(c1.size);

  }
}
