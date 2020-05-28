import java.util.*;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(), np = p.length();
        List<Integer> ans = new ArrayList<>();

        if (np > ns) return ans;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> src = new HashMap<>();

        for (int i = 0; i< np; i++) {
            src.put(p.charAt(i), src.getOrDefault(p.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ns; i++) {
            char endChar = s.charAt(i);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);

            if (i >= np) {
                char startChar = s.charAt(i - np);
                if (map.get(startChar) == 1) map.remove(startChar);
                else map.put(startChar, map.get(startChar) - 1);
            }

            if (src.equals(map)) ans.add(i - np + 1);
        }

        return ans;
    }
}
