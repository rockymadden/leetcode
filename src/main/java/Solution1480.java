public class Solution1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 0, sum = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
