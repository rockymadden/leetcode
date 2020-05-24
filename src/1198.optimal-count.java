class Solution {
    public int smallestCommonElement(int[][] mat) {
        int[] freq = new int[10001];

        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                 if (++freq[mat[i][j]] == mat.length) {
                     return mat[i][j];
                 }
            }
        }

        return -1;
    }
}
