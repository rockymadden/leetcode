public class Solution528 {
    private int[] prefixSums;
    private int totalSum;

    private int binarySearch(double target) {
        int low = 0;
        int high = this.prefixSums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (target > this.prefixSums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public Solution528(int[] w) {
        this.prefixSums = new int[w.length];
        int prefixSum = 0;

        for (int i = 0; i < w.length; i++) {
            prefixSum += w[i];
            prefixSums[i] = prefixSum;
        }

        this.totalSum = prefixSum;
    }

    public int pickIndex() {
        double target = this.totalSum * Math.random();

        return binarySearch(target);
    }
}
