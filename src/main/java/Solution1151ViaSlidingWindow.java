public class Solution1151ViaSlidingWindow {
    public int minSwaps(int[] data) {
        int k = 0, min = Integer.MAX_VALUE;

        for (int bit : data) if (bit == 1) k++;

        for (int end = 0, start = 0, sum = 0; end < data.length; end++) {
            if (data[end] == 0) sum++;

            if (end - start + 1 == k) {
                min = Math.min(min, sum);
                if (data[start] == 0) sum--;
                start++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
