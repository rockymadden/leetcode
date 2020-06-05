public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int nextDupe = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[nextDupe - 1] != nums[i]) nums[nextDupe++] = nums[i];
        }

        return nextDupe;
    }
}
