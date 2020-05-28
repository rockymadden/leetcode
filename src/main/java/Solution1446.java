public class Solution1446 {
    public int maxPower(String s) {
        int max = 0, con = 1;
        char prev = '\0';

        for (char ch : s.toCharArray()) {
            con = ch == prev ? con + 1 : 1;
            prev = ch;
            max = Math.max(max, con);
        }

        return max;
    }
}
