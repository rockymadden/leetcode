class Solution {
    public int numKLenSubstrNoRepeats(String S, int K) {
        Map<Character, Integer> freq = new HashMap<>();
        int ans = 0;
        int count = 0;

        for (int end = 0, start = 0; end < S.length(); end++) {
            char endChar = S.charAt(end);

            if (freq.containsKey(endChar)) {
                freq.put(endChar, freq.get(endChar) + 1);
            } else {
                freq.put(endChar, 1);
            }

            for (end - start >= K) {
                char startChar = S.charAt(start);

                if (freq.get(startChar) == 1) {
                    freq.remove(startChar);
                } else {
                    freq.put(startChar, freq.get(startChar) - 1);
                }

                count--;
                start++;
            }

            if (++count == K && count == freq.size()) ans++;
        }

        return ans;
    }
}
