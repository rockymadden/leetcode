import java.util.*;

public class Solution1029 {
    public int twoCitySchedCost(int[][] costs) {
        int min = 0;

        Arrays.sort(costs, (int[] a, int[] b) -> (a[0] - a[1]) - (b[0] - b[1]));

        for (int i = 0, as = costs.length / 2; i < costs.length; i++)
            min += as-- > 0 ? costs[i][0] : costs[i][1];

        return min;
    }
}
