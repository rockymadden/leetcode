// Optimal time-complexity O(n) and space-complexity O(1). However, there might be a way to reduce
// memory usage further. 100% faster and 7% less (but the latter has been off lately).
public class Solution844 {
    public boolean backspaceCompare(String S, String T) {
        int s = S.length() - 1;
        int t = T.length() - 1;
        int sb = 0;
        int tb = 0;

        while (s >= 0 || t >= 0) {
            while (s >= 0) {
                if (S.charAt(s) == '#') {
                    sb++;
                    s--;
                } else if (sb > 0) {
                    sb--;
                    s--;
                } else {
                    break;
                }
            }

            while (t >= 0) {
                if (T.charAt(t) == '#') {
                    tb++;
                    t--;
                } else if (tb > 0) {
                    tb--;
                    t--;
                } else {
                    break;
                }
            }

            if ((s >= 0 ? S.charAt(s) : '\0') != (t >= 0 ? T.charAt(t) : '\0')) {
                return false;
            }

            s--;
            t--;
        }


        return true;
    }
}
