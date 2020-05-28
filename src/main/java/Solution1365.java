public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) freq[num]++;
        for (int i = 0, cnt = 0; i < 101; i++) {
            if (freq[i] > 0) {
                cnt += freq[i];
                freq[i] = cnt - freq[i];
            }
        }
        for (int i = 0; i < nums.length; i++) nums[i] = freq[nums[i]];

        return nums;
    }
}
