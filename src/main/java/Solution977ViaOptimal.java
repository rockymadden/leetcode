public class Solution977ViaOptimal {
    public int[] sortedSquares(int[] A) {
        if (A == null) return A;

        int[] ans = new int[A.length];
        int start = 0, end = A.length - 1;
        int i = end;

        while (start <= end) {
            int pow1 = A[start] * A[start];
            int pow2 = A[end] * A[end];

            if (pow1 > pow2) {
                ans[i--] = pow1;
                start++;
            } else {
                ans[i--] = pow2;
                end--;
            }
        }

        return ans;
    }
}
