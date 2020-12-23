class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        for (int lo = 0, hi = numbers.length - 1; lo < hi;) {
            final int sum = numbers[lo] + numbers[hi];

            if (sum > target) hi--;
            else if (sum < target) lo++;
            else return new int[] {lo + 1, hi + 1};
        }

        return new int[] {-1, -1};
    }
}
