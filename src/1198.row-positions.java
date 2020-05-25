class Solution {
    public int smallestCommonElement(int[][] mat) {
        if (mat.length == 1) return mat[0][0];

        int n = mat.length, m = mat[0].length;
        int[] pos = new int[n];
        int max = 0, cnt = 0;

        while (true) {
            // Loop over each row.
            for (int i = 0; i < n; i++) {
                // While position has not run off the edge and the current row,
                // row position is less than the max -- move position forward.
                while (pos[i] < m && mat[i][pos[i]] < max) pos[i]++;

                // If the position ran off the edge, no possible common.
                if (pos[i] >= m) return -1;

                // If a new max will be set, reset count and max.
                if (mat[i][pos[i]] != max) {
                    cnt = 1;
                    max = mat[i][pos[i]];
                // Increment count and if the same as the row count, common.
                } else if (++cnt == n) {
                    return max;
                }
            }
        }
    }
}

