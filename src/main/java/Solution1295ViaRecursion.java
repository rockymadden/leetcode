class Solution1295ViaRecursion {
    private int digits(final int num) {
        if (num < 10) return 1;
        else {
            return 1 + digits(num / 10);
        }
    }

    public int findNumbers(final int[] nums) {
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (digits(nums[i]) % 2 == 0) cnt++;
        }

        return cnt;
    }
}
