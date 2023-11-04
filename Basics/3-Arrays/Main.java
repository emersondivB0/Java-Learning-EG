
public class Main {
  public static void main(String[] args) {
    // int[] prices = {2, 4, 1};
    // Solution solution = new Solution();
    // int maxProfit = solution.maxProfit(prices);
    // System.out.println("Max Profit: " + maxProfit);
    //
    // 3. Contains Duplicates
    int[] nums = {1,5,67,7,8,9,4,0,2,44};
    Solution solution = new Solution();
    boolean countDuplicates = solution.containsDuplicate(nums);
    System.out.println("Duplicates: " + countDuplicates);
  }
}
