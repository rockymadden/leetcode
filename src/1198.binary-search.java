class Solution {
    private boolean find(int[] row, int val) {
        int low = 0;
        int high = row.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (row[mid] < val) {
                low = mid + 1;
            } else if (row[mid] > val) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return row[low] == val;
    }

    public int smallestCommonElement(int[][] mat) {
        if (mat.length == 1) return mat[0][0];

        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < m; i++) {
            int element = mat[0][i];
            boolean found = true;

            for (int j = 1; j < n && found; j++) {
                found = find(mat[j], element);
            }

            if (found) return element;
        }

        return -1;
    }
}

