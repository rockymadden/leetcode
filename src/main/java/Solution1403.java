import java.util.*;

public class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        Arrays.sort(nums);

        for (int num : nums) sum += num;

        for (int i = nums.length - 1, gt = 0; i >= 0; i--) {
            ans.add(nums[i]);
            gt += nums[i];
            sum -= nums[i];
            if (gt > sum) break;
        }

        return ans;
    }
}
