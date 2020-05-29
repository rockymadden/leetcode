public class Solution1004ViaSlidingWindow {
    public int longestOnes(int[] A, int K) {
        int zeros = 0;
        int longest = 0;

        for (int end = 0, start = 0, cnt = 0; end < A.length; end++) {
            if (A[end] == 0) zeros++;
            cnt++;

            while (zeros > K) {
                if (A[start] == 0) zeros--;
                cnt--;
                start++;
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
