public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            cur = nums[i] == 1 ? cur + 1 : 0;
            max = Math.max(max, cur);
        }

        return max;
    }
}
