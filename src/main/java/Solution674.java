public class Solution674 {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0, start = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans = Math.max(ans, i - start);
                start = i;
            }
        }

        return Math.max(ans, nums.length - start);
    }
}
