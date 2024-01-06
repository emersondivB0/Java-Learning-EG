import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Iniciando Java con Neovim");

    Scanner scanner = new Scanner(System.in);

    Suma suma = new Suma();

    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    suma.suma(num1, num2);

    System.out.println("Ahora introduce 5 palabras:");

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
