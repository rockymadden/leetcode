class Solution {
    private HashSet<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        int ans = 0;

        while (n > 0) {
            int mod = n % 10;
            n = n / 10;
            
            ans += Math.pow(mod, 2); 
        }
        
        if (ans == 1) {
            return true;
        } else if (this.set.contains(ans)) {
            return false;
        } else {
            this.set.add(ans);
            return isHappy(ans);
        }
    }
}