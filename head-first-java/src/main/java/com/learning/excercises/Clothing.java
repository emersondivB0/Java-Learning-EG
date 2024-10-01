package com.learning.excercises;

public class Clothing {

  public String description;
  public double price;
  public String size = "M";

  public void Clothing(String description, double price, String size) {
    this.description = description;
    this.price = price;
    this.size = size;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setSize(String size) {
    this.size = size;
  }

}
