import java.util.Scanner;

public class Suma {

  public void suma() {
    try (Scanner scanner = new Scanner(System.in)) {
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      System.out.println(num1 + num2);
    }
  }

  public void imprimeCinco() {
    System.out.println("Ahora introduce 5 palabras:");

    try (Scanner scanner = new Scanner(System.in)) {
      scanner.nextLine();
      String word1 = scanner.next();
      String word2 = scanner.next();
      String word3 = scanner.next();
      String word4 = scanner.next();
      String word5 = scanner.next();

      System.out.println(word1);
      System.out.println(word2);
      System.out.println(word3);
      System.out.println(word4);
      System.out.println(word5);
    }
  }

  public void aritmethic1() {
    try (Scanner input = new Scanner(System.in)) {

      // Input two integers
      int first = input.nextInt();
      int second = input.nextInt();

      // Perform calculation with the two input numbers

      // TODO:
      // Add the first integer to twice the second integer.
      // Subtract the cube of the first integer from the result.
      // Assign the result to a variable.

      int result = (first + (2 * second)) - (first * first * first);

      // After performing the calculation, print the result.
      System.out.println(result);
    }
  }
}
