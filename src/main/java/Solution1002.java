import java.util.*;

public class Solution1002 {
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] frq = new int[26];

        for (int i = 0; i < A[0].length(); i++) {
            frq[A[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                frq[A[i].charAt(j) - 'a'] += 1000;
            }

            for (int j = 0; j < 26; j++) {
                int a = frq[j] / 1000;
                int b = frq[j] % 1000;
                frq[j] = Math.min(a, b);
            }
        }

        for (int i = 0; i < 26; i++) {
            int count = frq[i];

            while (count-- > 0) {
                ans.add(String.valueOf((char) ('a' + i)));
            }
        }

        return ans;
    }
}
