import java.util.*;

public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        final Set<Character> set = new HashSet<>();

        for (final char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        return set.size() <= 1;
    }
}
