public class Solution1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int half = n / 2;

        for (int i = 0; i < half; i++) {
            ans[i] = -(i + 1);
            ans[i + half] = i + 1;
        }

        return ans;
    }
}
