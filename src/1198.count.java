class Solution {
    public int smallestCommonElement(int[][] mat) {
        int[] freq = new int[10001];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                freq[mat[i][j]]++;
            }
        }

        for (int i = 0; i < 10001; i++) if (freq[i] == mat.length) return i;

        return -1;
    }
}
