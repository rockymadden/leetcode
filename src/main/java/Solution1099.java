import java.util.*;

class Solution1099 {
    public int twoSumLessThanK(int[] nums, int k) {
        int lo = 0;
        int hi = nums.length - 1;
        int max = Integer.MIN_VALUE;

        Arrays.sort(nums);

        while (lo < hi) {
            final int sum = nums[lo] + nums[hi];

            if (sum < k) {
                max = Math.max(sum, max);
                lo++;
            } else {
                hi--;
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
