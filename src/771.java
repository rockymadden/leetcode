class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] x = new int[26 + 6 + 26];
        int ans = 0;

        for (int i = 0; i < J.length(); i++) {
            x[J.charAt(i) - 'A']++;
        }

        for (int i = 0; i < S.length(); i++) {
            if (x[S.charAt(i) - 'A'] > 0) ans++;
        }

        return ans;
    }
}
