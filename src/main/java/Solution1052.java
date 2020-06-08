public class Solution1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int max = 0, base = 0;

        for (int end = 0, start = 0, sum = 0; end < customers.length; end++) {
            base += (grumpy[end] ^ 1) * customers[end];
            sum += grumpy[end] * customers[end];

            if (end - start + 1 == X) {
                max = Math.max(max, sum);
                sum -= grumpy[start] * customers[start];
                start++;
            }
        }

        return base + max;
    }
}
