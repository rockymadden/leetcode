class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, tally = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            tally++;

            while (map.size() > k) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) map.remove(startChar);
                tally--;
                start++;
            }

            longest = Math.max(longest, tally);
        }

        return longest;
    }
}
