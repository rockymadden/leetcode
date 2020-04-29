class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mm = m - 1;
        int nn = n - 1;
        int x = m + n - 1;

        while (mm >= 0 || nn >= 0) {
            if (nn < 0) {
                nums1[x--] = nums1[mm--];
            } else if (mm < 0) {
                nums1[x--] = nums2[nn--];
            } else {
                nums1[x--] = nums1[mm] > nums2[nn] ? nums1[mm--] : nums2[nn--];
            }
        }
    }
}
