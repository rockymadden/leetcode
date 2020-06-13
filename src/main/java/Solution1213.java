import java.util.*;

/**
 * Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, return a
 * sorted array of only the integers that appeared in all three arrays.
 */
public class Solution1213 {
    /**
     * Time-complexity: O(n)
     * Space-complexity: O(1)
     */
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> ans = new ArrayList<>();
        int a = 0, b = 0, c = 0;

        while (a < arr1.length) {
            while (b < arr2.length - 1 && arr2[b] < arr1[a]) b++;
            while (c < arr3.length - 1 && arr3[c] < arr1[a]) c++;
            if (arr1[a] == arr2[b] && arr1[a] == arr3[c]) ans.add(arr1[a]);
            a++;
        }

        return ans;
    }
}
