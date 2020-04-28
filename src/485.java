class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cur += 1;
            } else {
                max = Math.max(max, cur);
                cur = 0;
            }
        }

        return Math.max(max, cur);
    }
}
