/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only
 * once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 */
public class Solution26 {
    /**
     * Set a pointer `next` to where we will both write to next and which we will use to derive if
     * we actually need to write. Iterate through the array, via `i`, and compare the value at the
     * index previous to `next` to `i`. If they are not equal, we write to `next` with the value
     * at `i`. We also bump `next`.
     */
    public int removeDuplicates(int[] nums) {
        int next = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[next - 1] != nums[i]) nums[next++] = nums[i];
        }

        return next;
    }
}
