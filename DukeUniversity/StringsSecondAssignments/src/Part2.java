public class Part2 {
  /**
   * Write the method named howMany that has two String parameters named stringa and stringb.
   * This method returns an integer indicating how many times stringa appears in stringb,
   * where each occurrence of stringa must not overlap with another occurrence of it.
   * For example, the call howMany(“GAA”, “ATGAACGAATTGAATC”) returns 3 as GAA occurs 3 times.
   * The call howMany(“AA”, “ATAAAA”) returns 2. Note that the AA’s found cannot overlap.
   */

  public static int howMany(String stringa, String stringb) {
    int count = 0;
    int currentIndex = 0;
    while (currentIndex != -1) {
      if (currentIndex == 0) {
        currentIndex = stringb.indexOf(stringa);
        System.out.println("primer encuentro: " + currentIndex);
        if (currentIndex != -1) {
          currentIndex += stringa.length();
          count = 1;
        } else {
          break;
        }
      } else {
        currentIndex = stringb.indexOf(stringa, currentIndex);
        if (currentIndex != -1) {
          currentIndex += stringa.length();
          count++;
        } else {
          break;
        }
      }
      System.out.println("current index: " + currentIndex);
    }
    return count;
  }

  public static void testHowMany() {
    String stringa = "GAA";
    String stringb = "ATGAACGAATTGAATC";
    System.out.println("GAA occurs " + howMany(stringa, stringb) + " times");
    stringa = "AA";
    stringb = "ATAAAA";
    System.out.println("AA occurs " + howMany(stringa, stringb) + " times");
  }
}
