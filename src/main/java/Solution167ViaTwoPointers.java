/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that
 * they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2.
 *
 * Note:
 *   Your returned answers (both index1 and index2) are not zero-based.
 *   You may assume that each input would have exactly one solution and you may not use the same
 *   element twice.
 */
public class Solution167ViaTwoPointers {
    /**
     * Time-complexity: O(n)
     * Space-complexity: O(1)
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) return new int[] {left + 1, right + 1};
            else if (sum < target) left++;
            else right--;
        }

        return new int[] {-1, -1};
    }
}
