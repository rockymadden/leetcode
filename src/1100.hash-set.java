class Solution {
    public int numKLenSubstrNoRepeats(String S, int K) {
        Set<Character> freq = new HashSet<>();
        int ans = 0;

        for (int end = 0, start = 0; end < S.length(); end++) {
            while (freq.contains(S.charAt(end))) {
                freq.remove(S.charAt(start++));
            }

            freq.add(S.charAt(end));

            if (end - start + 1 >= K) ans++;
        }

        return ans;
    }
}
