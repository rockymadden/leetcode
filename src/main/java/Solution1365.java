/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than
 * it. That is, for each nums[i] you have to count the number of valid j's such that j != i and
 * nums[j] < nums[i].
 *
 * Return the answer in an array.
 */
public class Solution1365 {
    /**
     * Time-complexity: O(n)
     * Space-complexity: O(1)
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] frq = new int[101];

        for (int num : nums) frq[num]++;
        for (int i = 0, count = 0; i < 101; i++) {
            int tmp = frq[i];
            frq[i] = count;
            count += tmp;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = frq[nums[i]];
        }

        return nums;
    }
}
