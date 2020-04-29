class Solution {
    public void duplicateZeros(int[] arr) {
        int[] copy = new int[arr.length * 2];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                copy[j++] = 0;
                copy[j++] = 0;
            } else {
                copy[j++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[i];
        }
    }
}
