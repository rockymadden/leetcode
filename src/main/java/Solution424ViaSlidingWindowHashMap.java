import java.util.*;

public class Solution424ViaSlidingWindowHashMap {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int longest = 0;
        int repeat = 0;

        for (int end = 0, start = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            repeat = Math.max(repeat, freq.get(endChar));

            while (end - start + 1 - repeat > k) {
                char startChar = s.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                start++;
            }

            longest = Math.max(longest, end - start + 1);
        }

        return longest;
    }
}
