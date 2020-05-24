class Solution {
    private boolean common(int[] row, int val) {
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

        for (int i = 0; i < mat[0].length; i++) {
            int element = mat[0][i];
            int count = 0;

            for (int j = 1; j < mat.length; j++) {
                if (common(mat[j], element)) count++;
            }

            if (count + 1 == mat.length) return element;
        }

        return -1;
    }
}
