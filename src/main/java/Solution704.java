/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search
 * target in nums. If target exists, then return its index, otherwise return -1.
 */
public class Solution704 {
    /**
     * Time-complexity: O(log n)
     * Space-complexity: O(1)
     */
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }

        return nums[lo] == target ? lo : -1;
    }
}
