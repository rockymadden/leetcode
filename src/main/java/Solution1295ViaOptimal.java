/**
 * Leans on the constraints of the problem to remove the need to cast to String.
 */
public class Solution1295ViaOptimal {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999) || nums[i] == 100000) {
                ans++;
            }
        }

        return ans;
    }
}
