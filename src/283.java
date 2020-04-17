class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int tmp;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}