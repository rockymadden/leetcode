public class Solution1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 0, p = 0; i < nums.length; i++) {
            nums[i] = nums[i] + p;
            p = nums[i];
        }

        return nums;
    }
}
