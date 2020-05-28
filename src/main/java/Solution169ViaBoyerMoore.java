public class Solution169ViaBoyerMoore {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int cnd = Integer.MIN_VALUE; // Potential unsafe, given domain.

        for (int num : nums) {
            if (cnt == 0) cnd = num;
            cnt += (num == cnd) ? 1 : -1;
        }

        return cnd;
    }
}
