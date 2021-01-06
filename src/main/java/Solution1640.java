import java.util.*;

public class Solution1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < pieces.length; i++) map.put(pieces[i][0], i);

        int[] coords = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int i = 0; i < arr.length; i++) {
            if (coords[0] == Integer.MIN_VALUE) {
                coords[0] = map.getOrDefault(arr[i], -1);
                coords[1] = 0;
            }

            if (coords[0] == -1) return false;
            else if (pieces[coords[0]][coords[1]] != arr[i]) return false;
            else if (coords[1] < pieces[coords[0]].length - 1) coords[1]++;
            else coords[0] = Integer.MIN_VALUE;
        }

        return true;
    }
}
