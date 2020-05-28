public class Solution201 {
    public int rangeBitwiseAnd(int m, int n) {
        int ans = m;

        for (int i = m; i < n; i++) {
            if (ans == 0) return 0;
            ans = ans & (i + 1);
        }

        return ans;
    }
}
