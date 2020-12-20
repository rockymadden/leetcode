class Solution904 {
    public int totalFruit(int[] tree) {
        int[] baskets = new int[tree.length];
        int max = 0;

        for (int end = 0, start = 0, cnt = 0, size = 0; end < tree.length; end++) {
            int endFruit = tree[end];
            if (baskets[endFruit] == 0) size++;
            baskets[endFruit]++;
            cnt++;

            while (size > 2) {
                int startFruit = tree[start];
                if (baskets[startFruit] == 1) size--;
                baskets[startFruit]--;
                start++;
                cnt--;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}
