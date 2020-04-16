class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        int z = 0;
        int tmp;

        while (true) {
            while (a < nums.length) {
                if (nums[a] != 0) { break; }
                else { a++; }
            }
            
            if (a >= nums.length) { break; }
            
            while (z < nums.length) {
                if (nums[z] == 0) { break; }
                else { z++; }
            }
            
            if (z >= nums.length) { break; }
                        
            if (z < a) {
                tmp = nums[a];
                nums[a] = nums[z];
                nums[z++] = tmp;
                tmp = a;
            }
            
            a++;
        }
    }
}