
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        final int [] frq = new int[128];
        final int n = s.length();
        int ans = 0;

        for (int end = 0, start = 0, dst = 0, cnt = 0; end < n; end++) {
            final char endChar = s.charAt(end);

            if (frq[endChar] == 0) dst++;
            else dst--;

            frq[endChar]++;
            cnt++;

            while (cnt > dst) {
                final char startChar = s.charAt(start++);

                if (frq[startChar] == 2) dst++;
                else if (frq[startChar] == 1) dst--;

                frq[startChar]--;
                cnt--;
            }

            ans = Math.max(ans, end - start + 1);
        }

        return ans;
    }
}
