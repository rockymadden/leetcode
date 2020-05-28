import java.util.*;

public class Solution904 {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> baskets = new HashMap<>();
        int max = 0;

        for (int end = 0, start = 0; end < tree.length; end++) {
            int endFruit = tree[end];
            baskets.put(endFruit, baskets.getOrDefault(endFruit, 0) + 1);

            while (baskets.size() > 2) {
                int startFruit = tree[start];
                baskets.put(startFruit, baskets.get(startFruit) - 1);
                if (baskets.get(startFruit) < 1) baskets.remove(startFruit);
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
