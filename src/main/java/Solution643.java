public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;

        for (int end = 0, start = 0, sum = 0; end < nums.length; end++) {
            sum += nums[end];

            if (end >= k - 1) {
                max = Math.max(max, sum);
                sum -= nums[start];
                start++;
            }
        }

        return (double) max / k;
    }
}
