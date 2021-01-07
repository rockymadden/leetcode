public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int non = 0; non < nums.length; non++) {
            if (nums[non] != val) nums[i++] = nums[non];
        }

        return i;
    }
}
