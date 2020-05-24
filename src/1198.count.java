class Solution {
    public int smallestCommonElement(int[][] mat) {
        int[] freq = new int[10001];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                 if (++freq[mat[i][j]] == mat.length) {
                     return mat[i][j];
                 }
            }
        }

        return -1;
    }
}
