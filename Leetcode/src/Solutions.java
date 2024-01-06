public class Solutions {
    /*
     * 4. Product of Array Except Self
     *
     * Given an integer array nums, return an array answer such that answer[i] is
     * equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
     * integer.
     * You must write an algorithm that runs in O(n) time and without using the
     * division operation.
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * Constraints:

     * 2 <= nums.length <= 10^5
     * -30 <= nums[i] <= 30
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array
     * does not count as extra space for space complexity analysis.)
     */
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftp = 1;
            int rightp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j < i) {
                    leftp *= nums[j];
                } else if (j > i) {
                    rightp *= nums[j];
                }
            }
               answer[i] = leftp * rightp;

        }
        return answer;
    }
}
