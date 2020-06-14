import java.util.*;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (Integer a, Integer b) -> {
            int delta = Integer.bitCount(a) - Integer.bitCount(b);

            return delta != 0 ? delta : a - b;
        });

        return Arrays.stream(boxed).mapToInt(i -> i).toArray();
    }
}
