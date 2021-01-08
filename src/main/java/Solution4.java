public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final boolean even = (nums1.length + nums2.length) % 2 == 0;
        final int lo = even ? ((nums1.length + nums2.length) / 2) - 1 : (nums1.length + nums2.length) / 2;
        final int hi = even ? lo + 1 : lo;
        double ans = 0.0;

        for (int i = 0, one = 0, two = 0; i <= hi; i++) {
            if (two >= nums2.length || one < nums1.length && nums1[one] <= nums2[two]) {
                if (i == lo || i == hi) ans += nums1[one];
                one++;
            } else {
                if (i == lo || i == hi) ans += nums2[two];
                two++;
            }
        }

        return hi == lo ? ans : ans / 2;
    }
}
