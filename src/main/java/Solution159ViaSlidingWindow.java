import java.util.*;

public class Solution159ViaSlidingWindow {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int longest = 0;

        for (int end = 0, start = 0, sum = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            freq.put(endChar, freq.getOrDefault(endChar, 0) + 1);
            sum++;

            while (freq.size() > 2) {
                char startChar = s.charAt(start);
                freq.put(startChar, freq.get(startChar) - 1);
                if (freq.get(startChar) == 0) freq.remove(startChar);
                sum--;
                start++;
            }

            longest = Math.max(longest, sum);
        }

        return longest;
    }
}
