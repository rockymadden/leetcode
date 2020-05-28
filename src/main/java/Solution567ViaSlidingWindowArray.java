public class Solution567ViaSlidingWindowArray {
    private boolean compare(int[] S1, int[] S2) {
        for (int i = 0; i < 26; i++) {
            if (S1[i] > 0 && S1[i] != S2[i]) return false;
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int ns1 = s1.length();
        int ns2 = s2.length();

        if (ns1 > ns2) return false;

        int[] S1 = new int[26];
        int[] S2 = new int[26];

        for (int i = 0; i < ns1; i++) S1[s1.charAt(i) - 'a']++;
        for (int end = 0, start = 0; end < ns2; end++) {
            S2[s2.charAt(end) - 'a']++;

            if (end - start + 1 > ns1) {
                S2[s2.charAt(start) - 'a']--;
                start++;
            }

            if (compare(S1, S2)) return true;
        }

        return compare(S1, S2);
    }
}
