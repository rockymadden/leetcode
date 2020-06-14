import java.util.*;

public class Solution1356 {
    private static int count(int num) {
        int cnt = 0;

        while (num > 0) {
            cnt += (1 & num);
            num >>= 1;
        }

        return cnt;
    }

    public int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (Integer a, Integer b) -> {
            int delta = count(a) - count(b);

            return delta != 0 ? delta : a - b;
        });

        return Arrays.stream(boxed).mapToInt(i -> i).toArray();
    }
}
