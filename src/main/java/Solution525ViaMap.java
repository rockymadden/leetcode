import java.util.HashMap;
import java.util.Map;

public class Solution525ViaMap {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0, delta = 0;

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            delta += nums[i] == 0 ? -1 : 1;

            if (map.containsKey(delta)) {
                max = Math.max(max, i - map.get(delta));
            } else {
                map.put(delta, i);
            }
        }

        return max;
    }
}
