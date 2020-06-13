/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
public class Solution1464 {
    /**
     * Time-complexity: O(n)
     * Space-complexity: O(1)
     */
    public int maxProduct(int[] nums) {
        int n = Integer.MIN_VALUE, m = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= n) {
                m = n;
                n = num;
            } else if (num > m) {
                m = num;
            }
        }

        return (n - 1) * (m - 1);
    }
}
