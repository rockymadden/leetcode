/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class Solution1470 {
    /**
     * Time-complexity: O(n)
     * Space-complexity: O(n)
     */
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0, j = 0; i < 2 * n; i++, j++) {
            ans[i] = nums[j];
            ans[++i] = nums[j + n];
        }

        return ans;
    }
}
