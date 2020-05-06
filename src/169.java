class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxRef = 0;
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = map.getOrDefault(nums[i], 0) + 1;

            map.put(nums[i], sum);

            if (sum > maxSum) {
                maxSum = sum;
                maxRef = nums[i];
            }
        }

        return maxRef;
    }
}
