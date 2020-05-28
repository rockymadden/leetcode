import java.util.*;

public class Solution442ViaSet {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) list.add(num);
            else set.add(num);
        }

        return list;
    }
}
