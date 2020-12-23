import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int f = m.getOrDefault(target - nums[i], -1);

            if (f != -1) return new int[] {f, i};
            else m.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
