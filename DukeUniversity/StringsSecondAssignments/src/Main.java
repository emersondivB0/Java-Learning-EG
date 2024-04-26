//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Hello and welcome!");

    String dna = "ATGyyyzzzTAAxxxATGyyyzzzTAAATGxxxyyyzzzxxxyyyzzzwwwTAA";
    Part1.printAllGenes(dna);

    String stringa = "TAA";
    String stringb = "ATGAACGAAxxGAAAATC";
    System.out.println("Cantidad: " + Part2.howMany(stringa, stringb));
    Part3.testCountGenes();
    Part1.testPrintAllGenes();
    Debug1.test();
  }
}