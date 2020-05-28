public class Solution1394 {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
            if (freq[arr[i]] == arr[i]) largest = Math.max(largest, arr[i]);
        }

        for (int i = largest; i >= 1; i--) {
            if (freq[i] == i) return i;
        }

        return -1;
    }
}
