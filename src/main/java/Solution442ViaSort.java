import java.util.*;

public class Solution442ViaSort {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int prev = 0;

        Arrays.sort(nums);

        for (int num : nums) {
            if (num == prev) list.add(num);
            prev = num;
        }

        return list;
    }
}
