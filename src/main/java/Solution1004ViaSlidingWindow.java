/**
 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
 *
 * Return the length of the longest (contiguous) subarray that contains only 1s.
 */
public class Solution1004ViaSlidingWindow {
    /**
     * Time-complexity: O(n)
     * Space-complexity: O(1)
     */
    public int longestOnes(int[] A, int K) {
        int max = 0;

        for (int end = 0, start = 0, zeros = 0; end < A.length; end++) {
            zeros += (A[end] ^ 1);

            while (zeros > K) {
                zeros -= (A[start] ^ 1);
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
