package com.duke;

import edu.duke.*;

public class PerimeterRunner {
  public double getPerimeter(Shape s) {
    double totalPerim = 0.0;
    double longestDist = 0.0;
    int numPoints = 0;
    Point prevPt = s.getLastPoint();
    for (Point currPt : s.getPoints()) {
      double currDist = prevPt.distance(currPt);
      totalPerim = totalPerim + currDist;
      prevPt = currPt;
      if (currDist > longestDist) {
        longestDist = currDist;
      }
      numPoints++;
    }
    System.out.println("longest = " + longestDist);
    System.out.println("average = " + (totalPerim / numPoints));
    return totalPerim;
  }

  public void testPerimeter () {
    FileResource fr = new FileResource();
    Shape s = new Shape(fr);
    double length = getPerimeter(s);
    System.out.println("perimeter = " + length);
  }

}
