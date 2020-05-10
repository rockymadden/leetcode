class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] a = new int[N + 1];
        int[] b = new int[N + 1];

        for (int i = 0; i < trust.length; i++) {
            a[trust[i][0]]++;
            b[trust[i][1]]++;
        }

        for (int i = 1; i < N + 1; i++) {
            if (a[i] == 0 && b[i] == N - 1) return i;
        }

        return -1;
    }
}
