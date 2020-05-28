import java.util.*;

public class Solution3 {
    private boolean hasRepeat(Map<Character, Integer> freq) {
        for (Integer count : freq.values()) {
            if (count > 1) return true;
        }

        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int start = 0, longest = 0;
        char endChar, startChar;

        for (int end = 0; end < s.length(); end++) {
            endChar = s.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);

            while (start < end && hasRepeat(freq)) {
                startChar = s.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                if (freq.get(startChar) == 0) freq.remove(startChar);
                start++;
            }

            longest = Math.max(longest, end - start + 1);
        }

        return longest;
    }
}
