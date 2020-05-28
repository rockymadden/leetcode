public class Solution540ViaBinarySearch {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            boolean even = (hi - mid) % 2 == 0;

            if (nums[mid + 1] == nums[mid]) {
                if (even) lo = mid + 2;
                else hi = mid - 1;
            } else if (nums[mid - 1] == nums[mid]) {
                if (even) hi = mid - 2;
                else lo = mid + 1;
            } else {
                return nums[mid];
            }
        }

        return nums[lo];
    }
}
