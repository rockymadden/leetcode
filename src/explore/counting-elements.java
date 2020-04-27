import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            ans += set.contains(arr[i] + 1) ? 1 : 0;
        }

        return ans;
    }
}
