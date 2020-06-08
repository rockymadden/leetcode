/**
 * Today, the bookstore owner has a store open for customers.length minutes. Every minute, some
 * number of customers (customers[i]) enter the store, and all those customers leave after the end
 * of that minute.
 *
 * On some minutes, the bookstore owner is grumpy. If the bookstore owner is grumpy on the
 * i-th minute, grumpy[i] = 1, otherwise grumpy[i] = 0. When the bookstore owner is grumpy, the
 * customers of that minute are not satisfied, otherwise they are satisfied.
 *
 * The bookstore owner knows a secret technique to keep themselves not grumpy for X minutes
 * straight, but can only use it once.
 *
 * Return the maximum number of customers that can be satisfied throughout the day.
 */
public class Solution1052 {
    /**
     * Remarkably similar to a typical sliding window problem, only that we need only maximize
     * the window where the owner is grumpy. We do additionally need to keep track of non-grumpy
     * sum as well due to the return value requirement.
     *
     * Time-complexity: O(n)
     * Space-complexity: O(1)
     */
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
