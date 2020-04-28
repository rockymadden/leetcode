class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i = 0, j = n - 1; i < n; i++, j--) {
            if(i == 0) left[i] = nums[i];
            else left[i] = left[i - 1] * nums[i];

            if(j == n - 1) right[j] = nums[j];
            else right[j] = right[j + 1] * nums[j];
        }

        for(int i = 0; i < n; i++) {
            int l = i - 1 < 0 ? 1 : left[i - 1];
            int r = i + 1 > n - 1 ? 1 : right[i + 1];

            nums[i] = l * r;
        }

        return nums;
    }
}
