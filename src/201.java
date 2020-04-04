class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        // int lower = (int) (Math.log(m) / Math.log(2));
        // int upper = (int) (Math.log(n) / Math.log(2));
        int ans = m;
        
        for (int i = m; i < n; i++) {
            // int tmp =  (int) Math.pow(2, i);      
            if (ans == 0) return 0;
            ans = ans & (i + 1);
        }
        
        return ans;
    }
}