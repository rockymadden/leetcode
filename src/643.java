class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;

        for (int end = 0, start = 0, sum = 0; end < nums.length; end++) {
            sum += nums[end];

            if (end >= k - 1) {
                max = Math.max(max, (double) sum / k);
                sum -= nums[start];
                start++;
            }
        }

        return max;
    }
}
