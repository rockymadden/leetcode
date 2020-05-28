public class Solution287 {
    public int findDuplicate(int[] nums) {
        int slow, fast;
        slow = nums[0];
        fast = nums[nums[0]];

        while (fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;

        while (fast != slow) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}
