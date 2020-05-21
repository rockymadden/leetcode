class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] freq = new int[2];
        int ans = 0;

        for (int end = 0, start = 0; end < nums.length; end++) {
            freq[nums[end]]++;

            while (start < end && freq[0] > 1) {
                freq[nums[start]]--;
                start++;
            }

            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
