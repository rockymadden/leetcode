public class Solution977ViaOptimalForLoop {
    public int[] sortedSquares(final int[] nums) {
        final int[] ans = new int[nums.length];

        for (int lo = 0, hi = nums.length - 1, i = hi; i >= 0;) {
            ans[i--] = (Math.abs(nums[hi]) >= Math.abs(nums[lo]))
                ? nums[hi] * nums[hi--]
                : nums[lo] * nums[lo++];
        }

        return ans;
    }
}
