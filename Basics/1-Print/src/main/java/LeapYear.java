import java.util.Scanner;

public class LeapYear {

  public void leapYear() {

    Scanner scanner = new Scanner(System.in);
    // start coding here
    int year = scanner.nextInt();

    if (year % 100 == 0 && year % 400 == 0) {
      System.out.println("Leap Special");
    } else if (year % 4 == 0 && year % 100 != 0) {
      System.out.println("Leap");
    } else {
      System.out.println("Regular");
    }

  }
}
