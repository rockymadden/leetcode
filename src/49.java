import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = "";

            for (int j = 0; j < strs[i].length(); j++) {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                key = new String(chars);
            }

            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(strs[i]);
            map.put(key, list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
