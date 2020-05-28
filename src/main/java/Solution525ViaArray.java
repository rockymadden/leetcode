import java.util.Arrays;

public class Solution525ViaArray {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[(nums.length * 2) + 1];
        int max = 0, delta = 0;

        Arrays.fill(arr, -2);
        arr[nums.length] = -1;

        for (int i = 0; i < nums.length; i++) {
            delta += nums[i] == 0 ? -1 : 1;

            if (arr[delta + nums.length] >= -1) {
                max = Math.max(max, i - arr[delta + nums.length]);
            } else {
                arr[delta + nums.length] = i;
            }
        }

        return max;
    }
}
