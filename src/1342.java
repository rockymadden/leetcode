class Solution {
    public int numberOfSteps (int num) {
        int z = num;
        int ops = 0;
        
        while (z != 0) {
            z = z % 2 == 0 ? z / 2 : z - 1;
            ops++;
        }
        
        return ops;
    }
}