import java.util.*;

/**
 * First tried using bits first which didn't work at all. Moved to string sorting which works "okay"
 * (50% faster). However, TIL about prime multiplication which is optimal for time-complexity.
 * See: https://stackoverflow.com/questions/18781106/generate-same-unique-hash-code-for-all-anagrams
 */
public class Solution49 {
    private static final int[] PRIMES = new int[] {2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int key = 1;

            for (int j = 0; j < strs[i].length(); j++) {
                key *= PRIMES[strs[i].charAt(j) - 'a'];
            }

            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(strs[i]);
            map.put(key, list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
