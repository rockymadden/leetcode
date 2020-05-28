public class Solution487ViaSlidingWindow {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;

        for (int end = 0, start = 0, zeros = 0; end < nums.length; end++) {
            if (nums[end] == 0) zeros++;

            while (start < end && zeros > 1) {
                if (nums[start] == 0) zeros--;
                start++;
            }

            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
