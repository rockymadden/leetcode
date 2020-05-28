public class Solution997ViaOptimal {
    public int findJudge(int N, int[][] trust) {
        int judge = -10000 * (N - 1);
        int[] t = new int[N + 1];

        for (int i = 0; i < trust.length; i++) {
            t[trust[i][0]]++;
            t[trust[i][1]] -= 10000;
        }

        for (int i = 1; i < N + 1; i++) {
            if (t[i] == judge) return i;
        }

        return -1;
    }
}
