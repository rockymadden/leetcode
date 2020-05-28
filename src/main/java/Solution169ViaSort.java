import java.util.*;

public class Solution169ViaSort {
    public int majorityElement(int[] nums) {
        int ref = Integer.MIN_VALUE;
        int cnt = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != ref) cnt = 0;
            if (++cnt > (nums.length / 2)) return nums[i];
            ref = nums[i];
        }

        return -1;
    }
}
