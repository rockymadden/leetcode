import java.util.*;

public class Solution1356 {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
            .boxed()
            .sorted((Integer a, Integer b) ->
                (Integer.bitCount(a) * 10000 + a) - (Integer.bitCount(b) * 10000 + b)
            )
            .mapToInt(i -> i)
            .toArray();
    }
}
